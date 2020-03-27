package org.scalablytyped.converter.internal.scalajs

object Versions {
  val sbtVersion = "1.3.8"

  val runtime      = Dep.ScalaJs("com.olvind", "scalablytyped-runtime", "2.1.0")
  val scalaJsDom   = Dep.ScalaJs("org.scala-js", "scalajs-dom", "1.0.0")
  val slinkyWeb    = Dep.ScalaJs("me.shadaj", "slinky-web", "0.6.4")
  val slinkyNative = Dep.ScalaJs("me.shadaj", "slinky-native", "0.6.4")
  val scalajsReact = Dep.ScalaJs("com.github.japgolly.scalajs-react", "core", "1.5.0")

  case class Scala(scalaVersion: String, binVersion: String) {
    val scalaOrganization = "org.scala-lang"
    val compiler          = Dep.Java(scalaOrganization, "scala-compiler", scalaVersion)
    val library           = Dep.Java(scalaOrganization, "scala-library", scalaVersion)
  }

  val Scala212 = Scala("2.12.10", "2.12")

  val Scala213 = Scala("2.13.1", "2.13")

  case class ScalaJs(scalaJsVersion: String) {
    private val StableVersion = "(\\d+).(\\d+).(\\d+)".r

    val scalaJsBinVersion: String =
      scalaJsVersion match {
        case StableVersion("1", _, _)   => "1"
        case StableVersion("0", "6", _) => "0.6"
        case other                      => other
      }

    val scalaJsOrganization = "org.scala-js"
    def scalacOptions: List[String] = {
      val base = List("-encoding", "utf-8", "-g:notailcalls")
      if (scalaJsVersion.startsWith("0.6")) base :+ "-P:scalajs:sjsDefinedByDefault"
      else base
    }
    val library       = Dep.Scala(scalaJsOrganization, "scalajs-library", scalaJsVersion)
    val testInterface = Dep.Scala(scalaJsOrganization, "scalajs-test-interface", scalaJsVersion)
    val compiler      = Dep.ScalaFullVersion(scalaJsOrganization, "scalajs-compiler", scalaJsVersion)
    val sbtPlugin     = Dep.Scala(scalaJsOrganization, "sbt-scalajs", scalaJsVersion)
  }

  val ScalaJs1  = ScalaJs("1.0.0")
  val ScalaJs06 = ScalaJs("0.6.32")
}

case class Versions(scala: Versions.Scala, scalaJs: Versions.ScalaJs) {
  val scalacOptions: List[String] = scalaJs.scalacOptions

  def sjs(artifact: String): String =
    s"${artifact}_sjs${scalaJs.scalaJsBinVersion}_${scala.binVersion}"
}
