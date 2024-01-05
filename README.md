### Scala wrapper for Dcm4Che

This is a simple, part port of dcm4che's cfind, cget source to use in Scala language (3.X). Part port means much of controllable arguments of cfind, cget are ignored.

* supports C-FIND, G-GET operations in CFind, CGet classes
* for use add sbt-github-packages to your project and add resolvers to build.sbt
* github token should be saved at environment variable "GITHUB_TOKEN"
```
// project/plugins.sbt
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")

// build.sbt
resolvers ++= Seq(
    Resolver.githubPackages("maryknollrad"),
    // for download of dcm4che, which is needed for d4cs
    "SciJava" at "https://maven.scijava.org/content/repositories/public/", 
),
libraryDepencencies += "net.maryknollrad" %% "d4cs" % "VERSION",
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
```
