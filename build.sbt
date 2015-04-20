name := """play-example-postgresql"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc4"
)     

lazy val root = (project in file(".")).enablePlugins(PlayJava)
