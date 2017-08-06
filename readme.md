Make project boilerplate
	pom - dep
	 - spring-webmvc :: core
	 - jstl (provided) :: views
	 - servlet-api (provided) :: dispatch servlet
	 - hibernate-validator :: form validations
	pom - plugin
	 - maven-compiler-plugin
	web.xml
	 - change to xml, version should match version of servlet-api
	 - add dispatcher servlet to route requests to config file
	servlet-config.xml
	 - use spring-IDE to set-up xml includes (bean, context, mvc, p)
	 - enable annotation driven coding and parsing of controllers
	 - set-up internal view resolver to point to views folders
	 
Server
	make server in eclipse - in order to add app to server
	 - the app must be faceted (RC -> properties -> project facets)
	 - the facet "dynamic web app" must be selected (min java 1.6)
	 	*if "dynamic web app" doesn't appear as an option, you need to add java-ee to IDE

Errors
 - java.lang.classexception "org.spring..." not found
 --> need to add maven dependencies to build path (RC -> properties -> DeploymentAssemblies -> add)

 - the maven dependencies lib disappeared (after closing/shutting down eclipse)
 --> (not ideal)
 	del project in eclipse
 	clone down project from github
 	reimport as maven project
	(add back maven depenencides to buildpath)
 
 ASM Class reader failed to parse file
  - java 8 requires spring 4 (which breaks on my Maven)
  --> use source/target 1.7 in maven builder and spring 3.x.x
  
Reset Counter = 2

the tutoraial adds the following dependencies
 - mysql 5.1.21
 - hibernate-entitymanager 4.1.9.Final
 - jta 1.1
 - spring-jdbc 3.2.0.RELEASE
 - spring-orm 3.2.0.RELEASE
 
I am trying to add the following
 - postgresql (I want to use pg)
 x spring-jdbc 3.2.6.RELEASE (needs to match my current spring webmvc)
 x spring-rom 3.2.6.RELEASE
 - hibernate-entitiymanager 4.1.9.Final
 x jta 1.1
 
after adding something in here, it corrupts my dependancies and tomcat fails to launch
after rebuilding, dep are always dropped from build path (maven update after each add)

 WORKS :: add spring-orm & spring-jdbc
 WORKS :: jta
 FAILS :: postgres :: org.postgresql	postgresql	42.1.4.jre7 
 WORKS :: hibernate
 
 -- installing mysql, see if that gets around the problem
 
 installed mySql workbench
 !!! added SpringExerciseDatabase (for project)
 