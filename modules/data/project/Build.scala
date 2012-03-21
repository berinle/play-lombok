import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-lombok"
    val appVersion      = "1.0-SNAPSHOT"

    val dataDependencies = Seq(
    	"org.projectlombok" % "lombok" % "0.10.8"
    	)

    val dataProject = PlayProject(
	    appName + "-data",
	    appVersion,
	    dataDependencies,
	    path = file("modules/data"),
	    mainLang = JAVA
	  )

    val appDependencies = Seq(
      // Add your project dependencies here,
      //"org.projectlombok" % "lombok" % "0.10.8"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    ).dependsOn(dataProject)

}
