enablePlugins(ScalaJSPlugin)

lazy val commonSettings = Seq(
  organization := "com.izikovic",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scalajs-daterange-bootstrap",
	scalacOptions ++= Seq("-deprecation", "-feature"),
	jsDependencies += "org.webjars" % "bootstrap-daterangepicker" % "2.1.24" / "daterangepicker.js"	
  )