import sbtrelease.ReleaseStateTransformations._

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

releaseProcess := Seq(
  // Get exit code 1 instead of 0
  runTest
  // With this uncommented, we get the proper behavior:
  // This step is short-circuited and exit code != 0
  // , releaseStepCommand("show version")
)
