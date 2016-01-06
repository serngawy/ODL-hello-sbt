scalaVersion in Global := "2.11.4" 

def ProjectName(name: String,path:String): Project =  Project(name, file(path))

resolvers in Global ++= Seq(Resolver.mavenLocal, "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" at "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" ,
           "http://nexus.opendaylight.org/content/repositories/public/" at "http://nexus.opendaylight.org/content/repositories/public/" ,
           "https://repo.maven.apache.org/maven2" at "https://repo.maven.apache.org/maven2" )

val `org.opendaylight.controller_features-mdsal` = "org.opendaylight.controller" % "features-mdsal" % "1.3.0-SNAPSHOT"

val `org.opendaylight.coretutorials_hello-impl` = "org.opendaylight.coretutorials" % "hello-impl" % "1.1.0-SNAPSHOT"

val `org.opendaylight.coretutorials_hello-api` = "org.opendaylight.coretutorials" % "hello-api" % "1.1.0-SNAPSHOT"

val `org.opendaylight.mdsal_features-mdsal` = "org.opendaylight.mdsal" % "features-mdsal" % "2.0.0-SNAPSHOT"

val `org.opendaylight.mdsal.model_features-mdsal-model` = "org.opendaylight.mdsal.model" % "features-mdsal-model" % "0.8.0-SNAPSHOT"

val `org.opendaylight.netconf_features-restconf` = "org.opendaylight.netconf" % "features-restconf" % "1.3.0-SNAPSHOT"

val `org.opendaylight.odlparent_features-test` = "org.opendaylight.odlparent" % "features-test" % "1.6.0-SNAPSHOT"

val `org.opendaylight.yangtools_features-yangtools` = "org.opendaylight.yangtools" % "features-yangtools" % "0.8.0-SNAPSHOT"


version := "1.1.0-SNAPSHOT"

name := "hello-features"

organization := "org.opendaylight.coretutorials"

libraryDependencies in Global ++= Seq(`org.opendaylight.yangtools_features-yangtools` % "runtime" ,
   `org.opendaylight.odlparent_features-test` % "test" ,
   `org.opendaylight.netconf_features-restconf` % "runtime" ,
   `org.opendaylight.mdsal.model_features-mdsal-model` % "runtime" ,
   `org.opendaylight.mdsal_features-mdsal` % "runtime" ,
   `org.opendaylight.coretutorials_hello-impl`,
   `org.opendaylight.coretutorials_hello-impl`,
   `org.opendaylight.coretutorials_hello-api`,
   `org.opendaylight.controller_features-mdsal` % "runtime" )



