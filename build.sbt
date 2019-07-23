
name := "Site"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "io.javalin" % "javalin" % "3.1.0",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.9",
  "org.slf4j" % "slf4j-simple" % "1.7.26"
)
mainClass in assembly := Some("me.Main")
assemblyJarName in assembly := "Site.jar"
assemblyMergeStrategy in assembly := {
  case PathList("org", "eclipse", "jetty", "http", "encoding.properties") => MergeStrategy.first
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}



