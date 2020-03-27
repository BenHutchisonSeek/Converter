package org.scalablytyped.converter.internal
package importer
package build

import ammonite.ops.%
import org.scalablytyped.converter.internal.scalajs.{Name, ObjectMembers, ScalaNameEscape, Versions}
import org.scalablytyped.converter.internal.stringUtils.quote

object GenerateSbtPlugin {
  def apply(
             versions:       Versions,
             organization:   String,
             projectName:    String,
             projectDir:     os.Path,
             projects:       Set[PublishedSbtProject],
             pluginVersion:  String,
             resolverRefOpt: Option[Publisher],
             action:         String,
  ): Unit = {
    files.sync(
      contents(versions, organization, projectName, projects, pluginVersion, resolverRefOpt),
      projectDir,
      deleteUnknowns = true,
      soft           = true,
    )
    implicit val wd = projectDir
    %.extend(
      Nil,
      Map(
        "JVM_OPTS" -> "-Xmx1G",
        "JAVA_TOOL_OPTIONS" -> "-XX:MaxInlineLevel=24 -Xmx1G -Xss2M",
      ),
    )('sbt, action)
  }

  def contents(
                v:              Versions,
                organization:   String,
                projectName:    String,
                projects:       Set[PublishedSbtProject],
                pluginVersion:  String,
                resolverRefOpt: Option[Publisher],
  ): Map[os.RelPath, Array[Byte]] = {

    val buildSbt = s"""name := "sbt-$projectName"
      |organization := ${quote(organization)}
      |version := ${quote(pluginVersion)}
      |sbtPlugin := true
      |licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
      |publishMavenStyle := true
      |crossSbtVersions := Vector("0.13.16", ${quote(Versions.sbtVersion)})
      |""".stripMargin + resolverRefOpt.fold("")(_.sbtPublishTo + "\n")

    /* we have at least a `clone` and a `notify` library - of course */
    def fix(name: String): String =
      ObjectMembers.byName.get(Name(name)) match {
        case Some(_) => s"_$name"
        case None    => name
      }

    val projectsByLetter =
      projects
        .map(_.project)
        .groupBy(_.name.head)
        .to[Array]
        .sortBy(_._1)
        .map {
          case (letter, ps) =>
            s"""|      object ${ScalaNameEscape(letter.toUpper.toString)} {
                |${ps
                 .to[Vector]
                 .distinct
                 .sortBy(_.name)
                 .map(p => s"|        val ${ScalaNameEscape(fix(p.name))} = ${p.reference.asMangledSbt(v)}")
                 .mkString("", "\n", "")}
        |      }""".stripMargin
        }
        .mkString("\n")

    val resolvers = resolverRefOpt match {
      case Some(r) => s"\n    resolvers += ${r.sbtResolver}"
      case None    => ""
    }
    val pluginSource = s"""
      |package $organization.sbt
      |
      |import sbt._
      |import sbt.Keys._
      |
      |object ${projectName}Plugin extends AutoPlugin {
      |  override def trigger = allRequirements
      |  override def requires = sbt.plugins.JvmPlugin
      |  override def globalSettings = List($resolvers
      |  )
      |
      |  object autoImport {
      |    object $projectName {
      |$projectsByLetter
      |    }
      |  }
      |}""".stripMargin

    val pluginSourcePath = os.RelPath("src") / 'main / 'scala / 'com / 'olvind / 'sbt / "ScalablytypedPlugin.scala"

    val pluginsSbt = resolverRefOpt.map(_.sbtPlugin).map(dep => s"addSbtPlugin(${dep.asSbt})").mkString("\n")

    Map(
      os.RelPath("build.sbt") -> buildSbt,
      os.RelPath("project") / "plugins.sbt" -> pluginsSbt,
      os.RelPath("project") / "build.properties" -> s"sbt.version=${Versions.sbtVersion}",
      pluginSourcePath -> pluginSource,
    ).map {
      case (relPath, str) => relPath -> str.getBytes(constants.Utf8)
    }
  }
}
