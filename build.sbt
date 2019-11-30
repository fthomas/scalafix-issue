name := "scalafix-issue"

scalaVersion := "2.13.1"

crossScalaVersions := Seq("2.12.10", scalaVersion.value)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"

// Required for the 2.13 build:
addCompilerPlugin(scalafixSemanticdb)
scalacOptions += "-Yrangepos"
