scalaVersion in Global := "2.11.4" 

def ProjectName(name: String,path:String): Project =  Project(name, file(path))

resolvers in Global ++= Seq(Resolver.mavenLocal, "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" at "http://nexus.opendaylight.org/content/repositories/opendaylight.snapshot/" ,
           "http://nexus.opendaylight.org/content/repositories/public/" at "http://nexus.opendaylight.org/content/repositories/public/" ,
           "https://repo.maven.apache.org/maven2" at "https://repo.maven.apache.org/maven2" )

val `org.apache.karaf.features_standard` = "org.apache.karaf.features" % "standard" % "3.0.3"

val `org.apache.karaf.features_framework` = "org.apache.karaf.features" % "framework" % "3.0.3"

val `org.opendaylight.controller_config-api` = "org.opendaylight.controller" % "config-api" % "0.4.0-SNAPSHOT"

val `org.opendaylight.controller_sal-binding-config` = "org.opendaylight.controller" % "sal-binding-config" % "1.3.0-SNAPSHOT"

val `org.opendaylight.controller_karaf.branding` = "org.opendaylight.controller" % "karaf.branding" % "1.2.0-SNAPSHOT"

val `org.opendaylight.controller_features-mdsal` = "org.opendaylight.controller" % "features-mdsal" % "1.3.0-SNAPSHOT"

val `org.opendaylight.controller_opendaylight-karaf-resources` = "org.opendaylight.controller" % "opendaylight-karaf-resources" % "1.6.0-SNAPSHOT"

val `org.opendaylight.mdsal_features-mdsal` = "org.opendaylight.mdsal" % "features-mdsal" % "2.0.0-SNAPSHOT"

val `org.opendaylight.mdsal_yang-binding` = "org.opendaylight.mdsal" % "yang-binding" % "0.8.0-SNAPSHOT"

val `org.opendaylight.mdsal.model_features-mdsal-model` = "org.opendaylight.mdsal.model" % "features-mdsal-model" % "0.8.0-SNAPSHOT"

val `org.opendaylight.netconf_features-restconf` = "org.opendaylight.netconf" % "features-restconf" % "1.3.0-SNAPSHOT"

val `org.opendaylight.odlparent_features-test` = "org.opendaylight.odlparent" % "features-test" % "1.6.0-SNAPSHOT"

val `org.opendaylight.yangtools_features-yangtools` = "org.opendaylight.yangtools" % "features-yangtools" % "0.8.0-SNAPSHOT"

val `org.opendaylight.yangtools_yang-common` = "org.opendaylight.yangtools" % "yang-common" % "0.8.0-SNAPSHOT"

lazy val `hello-karaf` = ProjectName("hello-karaf","hello-karaf").settings(
  libraryDependencies ++= Seq(`org.opendaylight.controller_opendaylight-karaf-resources`,
   `org.opendaylight.controller_karaf.branding`,
   `org.apache.karaf.features_standard` % "runtime" ,
   `org.apache.karaf.features_framework`),
    name := "hello-karaf",
    version := "1.1.0-SNAPSHOT",
    organization := "org.opendaylight.coretutorials"
).settings().dependsOn(`hello-features`)

lazy val `hello-impl` = ProjectName("hello-impl","hello-impl").settings(
  libraryDependencies ++= Seq(`org.opendaylight.yangtools_yang-common`,
   `org.opendaylight.controller_sal-binding-config`,
   `org.opendaylight.controller_config-api`),
    name := "hello-impl",
    version := "1.1.0-SNAPSHOT",
    organization := "org.opendaylight.coretutorials"
).settings().dependsOn(`hello-api`)

lazy val `hello-features` = ProjectName("hello-features","hello-features").settings(
  libraryDependencies ++= Seq(`org.opendaylight.yangtools_features-yangtools` % "runtime" ,
   `org.opendaylight.odlparent_features-test` % "test" ,
   `org.opendaylight.netconf_features-restconf` % "runtime" ,
   `org.opendaylight.mdsal.model_features-mdsal-model` % "runtime" ,
   `org.opendaylight.mdsal_features-mdsal` % "runtime" ,
   `org.opendaylight.controller_features-mdsal` % "runtime" ),
    name := "hello-features",
    version := "1.1.0-SNAPSHOT",
    organization := "org.opendaylight.coretutorials"
).settings().dependsOn(`hello-impl`,`hello-impl`)

lazy val `hello-artifacts` = ProjectName("hello-artifacts","hello-artifacts").settings(
  libraryDependencies ++= Seq(),
    name := "hello-artifacts",
    version := "1.1.0-SNAPSHOT",
    organization := "org.opendaylight.coretutorials"
).settings().dependsOn()

lazy val `hello-api` = ProjectName("hello-api","hello-api").settings(
  libraryDependencies ++= Seq(`org.opendaylight.mdsal_yang-binding`),
    name := "hello-api",
    version := "1.1.0-SNAPSHOT",
    organization := "org.opendaylight.coretutorials"
).settings().dependsOn()


version := "1.1.0-SNAPSHOT"

name := "hello-aggregator"

organization := "org.opendaylight.coretutorials"

libraryDependencies in Global ++= Seq()



