scalaVersion in Global := "2.11.4" 

def ProjectName(name: String,path:String): Project =  Project(name, file(path))

resolvers in Global ++= Seq(Resolver.mavenLocal, "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" at "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" ,
           "http://nexus.opendaylight.org/content/repositories/public/" at "http://nexus.opendaylight.org/content/repositories/public/" ,
           "https://repo.maven.apache.org/maven2" at "https://repo.maven.apache.org/maven2" )

val `org.opendaylight.controller_config-api` = "org.opendaylight.controller" % "config-api" % "0.4.0-SNAPSHOT"

val `org.opendaylight.controller_sal-binding-config` = "org.opendaylight.controller" % "sal-binding-config" % "1.3.0-SNAPSHOT"

val `org.opendaylight.coretutorials_hello-api` = "org.opendaylight.coretutorials" % "hello-api" % "1.1.0-SNAPSHOT"

val `org.opendaylight.mdsal_yang-binding` = "org.opendaylight.mdsal" % "yang-binding" % "0.8.0-SNAPSHOT"

val `org.opendaylight.yangtools_yang-common` = "org.opendaylight.yangtools" % "yang-common" % "0.8.0-SNAPSHOT"


version := "1.1.0-SNAPSHOT"

name := "hello-impl"

organization := "org.opendaylight.coretutorials"

libraryDependencies in Global ++= Seq(`org.opendaylight.yangtools_yang-common`,
   `org.opendaylight.mdsal_yang-binding`,
   `org.opendaylight.coretutorials_hello-api`,
   `org.opendaylight.controller_sal-binding-config`,
   `org.opendaylight.controller_config-api`)



