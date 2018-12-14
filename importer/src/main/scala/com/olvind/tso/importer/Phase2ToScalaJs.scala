package com.olvind.tso
package importer

import com.olvind.logging.Logger
import com.olvind.tso.importer.Phase1Res.{LibTs, LibraryPart}
import com.olvind.tso.importer.Phase2Res.LibScalaJs
import com.olvind.tso.phases.{GetDeps, IsCircular, Phase, PhaseRes}
import com.olvind.tso.scalajs.transforms.FakeLiterals
import com.olvind.tso.scalajs.{ContainerTree, Name, TreeScope, transforms => S}

class Phase2ToScalaJs(pedantic: Boolean, OutputPkg: Name) extends Phase[Source, Phase1Res, Phase2Res] {

  override def apply(source:     Source,
                     current:    Phase1Res,
                     getDeps:    GetDeps[Source, Phase2Res],
                     isCircular: IsCircular,
                     logger:     Logger[Unit]): PhaseRes[Source, Phase2Res] =
    current match {
      case Phase1Res.Contrib => PhaseRes.Ok(Phase2Res.Contrib)

      case _: LibraryPart =>
        PhaseRes.Ignore()

      case lib: LibTs =>
        getDeps(lib.dependencies.keys.map(x => x: Source).to[Set]) map {
          case Phase2Res.Unpack(scalaDeps, contribs) =>
            val scope = new TreeScope.Root(
              libName       = ImportName(lib.name),
              _dependencies = scalaDeps.map { case (_, l) => l.packageTree.name -> l.packageTree },
              logger        = logger,
              pedantic      = pedantic
            )

            logger.warn(s"Processing ${lib.name.value}")

            val ScalaTransforms = List[ContainerTree => ContainerTree](
              S.RemoveDuplicateInheritance >>
                S.CleanupTypeAliases >>
                S.CleanIllegalNames(OutputPkg) >>
                S.InlineNestedIdentityAlias >>
                S.LimitUnionLength >>
                S.Deduplicator visitContainerTree scope,
              FakeLiterals(scope),
              S.RemoveMultipleInheritance visitContainerTree scope,
              S.CombineOverloads >> //must have stable types, so FakeLiterals run before
                S.FilterMemberOverrides visitContainerTree scope, //
              S.InferMemberOverrides visitContainerTree scope, //runs in phase after FilterMemberOverrides
              S.CompleteClass >> //after FilterMemberOverrides
                S.Sorter visitContainerTree scope
            )

            val rewrittenTree = ScalaTransforms.foldLeft(ImportTree(lib, logger)) { case (acc, f) => f(acc) }

            LibScalaJs(lib.source)(
              libName      = lib.name.`__value`.replaceAll("\\.", "_dot_"),
              libVersion   = lib.version,
              packageTree  = rewrittenTree,
              dependencies = scalaDeps,
              isStdLib     = lib.parsed.isStdLib,
              contribs     = lib.contribs ++ contribs
            )
        }
    }
}
