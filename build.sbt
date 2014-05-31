lazy val sample = Project(
  "sample", file(".")
).enablePlugins(PlayScala).settings(
  scalaVersion := "2.11.1"
)
