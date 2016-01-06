scalaVersion in Global := "2.11.4" 

def ProjectName(name: String,path:String): Project =  Project(name, file(path))

resolvers in Global ++= Seq(Resolver.mavenLocal, "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" at "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" ,
           "http://nexus.opendaylight.org/content/repositories/public/" at "http://nexus.opendaylight.org/content/repositories/public/" ,
           "https://repo.maven.apache.org/maven2" at "https://repo.maven.apache.org/maven2" )

val `org.apache.karaf.features_standard` = "org.apache.karaf.features" % "standard" % "3.0.3"

val `org.apache.karaf.features_framework` = "org.apache.karaf.features" % "framework" % "3.0.3"

val `org.opendaylight.controller_karaf.branding` = "org.opendaylight.controller" % "karaf.branding" % "1.2.0-SNAPSHOT"

val `org.opendaylight.controller_opendaylight-karaf-resources` = "org.opendaylight.controller" % "opendaylight-karaf-resources" % "1.6.0-SNAPSHOT"

val `org.opendaylight.coretutorials_hello-features` = "org.opendaylight.coretutorials" % "hello-features" % "1.1.0-SNAPSHOT"


version := "1.1.0-SNAPSHOT"

name := "hello-karaf"

organization := "org.opendaylight.coretutorials"

libraryDependencies in Global ++= Seq(`org.opendaylight.coretutorials_hello-features` % "runtime" ,
   `org.opendaylight.controller_opendaylight-karaf-resources`,
   `org.opendaylight.controller_karaf.branding`,
   `org.apache.karaf.features_standard` % "runtime" ,
   `org.apache.karaf.features_framework`)



