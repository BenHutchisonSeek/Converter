organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-f5ed5e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-824f62",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-e57a88",
  "org.scalablytyped" %%% "std" % "0.0-unknown-267bca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"