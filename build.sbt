ThisBuild / scalaVersion := "3.3.1"
ThisBuild / version := "0.5.8-SNAPSHOT"
ThisBuild / organization := "net.maryknollrad"

val dcm4cheVersion = "5.31.2"
val catsEffectVersion = "3.5.1"

lazy val d4cs = (project in file("."))
    .settings(
        resolvers += "SciJava" at "https://maven.scijava.org/content/repositories/public/",
        libraryDependencies ++= Seq(
            "org.typelevel" %% "cats-effect" % catsEffectVersion,
            "org.dcm4che" % "dcm4che-core" % dcm4cheVersion,
            "org.dcm4che" % "dcm4che-net" % dcm4cheVersion,
            "org.dcm4che" % "dcm4che-imageio" % dcm4cheVersion,
        ),
        githubOwner := "maryknollrad",
        githubRepository := "d4cs",
        publishConfiguration := publishConfiguration.value.withOverwrite(true)
    )