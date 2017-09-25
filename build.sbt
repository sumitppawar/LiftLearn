name := "LiftLearn"

version := "0.1"

scalaVersion := "2.12.3"

organization := "com.sumit"

enablePlugins(JettyPlugin)

libraryDependencies ++= {
  val liftVersion = "3.1.0"
  val liftEdition = liftVersion.split("\\.").take(2).mkString(".")
  Seq(
    "net.liftweb"       %% "lift-webkit"            % liftVersion,
    "net.liftweb"       %% "lift-mapper"            % liftVersion,
    "net.liftmodules"   %% s"lift-jquery-module_$liftEdition" % "2.10",
    "ch.qos.logback"    % "logback-classic"         % "1.2.3",
    "javax.servlet"     % "javax.servlet-api"       % "3.0.1"            % "provided"
  )
}
