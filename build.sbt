import Dependencies._

ThisBuild / organization := "com.lightbend.rp"
ThisBuild / organizationName := "Lightbend, Inc."
ThisBuild / startYear := Some(2017)
ThisBuild / licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://www.lightbend.com/"))
ThisBuild / developers := List(
  Developer("lightbend", "Lightbend", "", url("https://www.lightbend.com/"))
)
// ThisBuild / scmInfo := Some(ScmInfo(url("https://github.com/lightbend/sbt-deckhand"), "git@github.com:lightbend/sbt-deckhand.git"))

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-deckhand",
    libraryDependencies += mustache,
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false
  )