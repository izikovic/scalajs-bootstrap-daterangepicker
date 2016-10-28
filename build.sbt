

lazy val commonSettings = Seq(
  organization := "com.izikovic",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(commonSettings: _*).
  settings(
    name := "scalajs-daterange-bootstrap",
	scalacOptions ++= Seq("-deprecation", "-feature"),
	libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0",
	libraryDependencies += "ru.pavkin" %%% "scala-js-momentjs" % "0.3.1",
	libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0",
	jsDependencies += "org.webjars" % "bootstrap-daterangepicker" % "2.1.24" / "daterangepicker.js"	
  )