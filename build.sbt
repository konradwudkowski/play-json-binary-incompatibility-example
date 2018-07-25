import Deps._

lazy val root =
  Project("play-json-binary-incompatibility-example", file("."))
    .aggregate(testProject, playJson25, playJson26)


lazy val testProject =
  commonProject("testProject")
    .settings(
      libraryDependencies ++= Seq(
        Deps.playJson26
      )
    )
    .dependsOn(playJson25)

lazy val playJson25 =
  commonProject("playJson25")
    .settings(
      libraryDependencies ++= Seq(
       Deps.playJson25
      )
    )

lazy val playJson26 =
  commonProject("playJson26")
    .settings(
      libraryDependencies ++= Seq(
        Deps.playJson26
      )
    )

def commonProject(name: String) =
  Project(name, file(name))
    .settings(
      scalaVersion        := "2.11.12",
      version             := "0.1.0-SNAPSHOT",
      libraryDependencies ++= Seq(
        scalaTest
      )
    )
