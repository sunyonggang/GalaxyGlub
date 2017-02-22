name := "CodeAnalyzer"

version := "1.0"

isSnapshot := true

organization := "com.github.sunyonggang"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.2" % "test",
  "org.pegdown" % "pegdown" % "1.0.2" % "test", //used in html report
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.7",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"
//  "org.specs2" %% "specs2-core" % "3.8.8" % "test"
)

parallelExecution := true

mainClass in (Compile, run) := Some("lesson2.MainApp")


//scalacOptions in Test ++= Seq("-Yrangepos")