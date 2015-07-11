organization in ThisBuild := "net.tixxit"

licenses in ThisBuild += ("BSD-style" -> url("http://opensource.org/licenses/MIT"))

scalaVersion in ThisBuild := "2.11.5"

crossScalaVersions in ThisBuild := Seq("2.10.5", "2.11.5")

scalacOptions in ThisBuild ++= Seq("-deprecation", "-feature", "-unchecked", "-language:higherKinds", "-optimize")

maxErrors in ThisBuild := 5

lazy val root = project.
  in(file(".")).
  aggregate(csv).
  settings(
    publish := (),
    publishLocal := ()
  )

lazy val csv = project.
  in(file("csv"))
