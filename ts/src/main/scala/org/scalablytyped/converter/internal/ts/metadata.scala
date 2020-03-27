package org.scalablytyped.converter.internal
package ts

case class CompilerOptions(
    module:                           Option[String],
    lib:                              Option[IArray[String]],
    noImplicitAny:                    Option[Boolean],
    noImplicitThis:                   Option[Boolean],
    strictNullChecks:                 Option[Boolean],
    baseUrl:                          Option[os.RelPath],
    typeRoots:                        Option[IArray[os.RelPath]],
    types:                            Option[IArray[String]],
    noEmit:                           Option[Boolean],
    forceConsistentCasingInFileNames: Option[Boolean],
)

case class TsConfig(
    compilerOptions: Option[CompilerOptions],
    files:           Option[IArray[String]],
)

case class PackageJsonDeps(
    version:          Option[String],
    dependencies:     Option[Map[String, String]],
    devDependencies:  Option[Map[String, String]],
    peerDependencies: Option[Map[String, String]],
    typings:          Option[String],
    types:            Option[String],
    files:            Option[IArray[String]],
) {
  def allLibs: Set[String] = {
    val set: Set[Map[String, String]] = IArray
      .fromOptions(dependencies, devDependencies, peerDependencies)
      .toSet
    set
      .flatMap(_.keys)
  }
}

case class NotNeededPackage(
    libraryName:        String,
    typingsPackageName: TsIdentLibrary,
    sourceRepoURL:      String,
    asOfVersion:        String,
)
case class TypingsJson(
    name:   String,
    main:   String,
    files:  IArray[String],
    global: Boolean,
)

case class NotNeededPackages(packages: IArray[NotNeededPackage])
