

lazy val commonSettings = Seq(
  organization := "com.izikovic",
  version := "0.1",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(
    name := "scalajs-daterange-bootstrap",
	scalacOptions ++= Seq("-deprecation", "-feature"),
	libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0",
	libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
	libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.3" % "test",
	libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.1" % "test",
	libraryDependencies += "org.webjars" % "bootstrap-daterangepicker" % "2.1.24" % "test",
	testFrameworks += new TestFramework("utest.runner.Framework")
  )