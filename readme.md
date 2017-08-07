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

========== backend ===========

pom - dep
 - spring-orm (version should match webmvc)
 - spring-jdbc (version should match webmvc)
 - jta
 - hibernate-entity-manager
 - mysql-connector-java (pg breaks *sad*)

Sv, mvn update, verify it deploys to tomcat / still works
	 
META-INF
	- add dir under src/main/resources
	- add persistence.xml (copy paste) :: ! version must align JPA	
web.xml
  - add context param pointing at your context file
  - pull in spring listener to load backend
jpaContext.xml
  - add in src/main/resources (or wherever designated by web.xml)
  - use spring-IDE (new bean config file :: add tx, beans, context)
  - add context annotation and persistenceSupport-bean
	 	 	
DB
	using db admin tool, make db table !!! the maven plugin for pg breaks, so forced to use mysql

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
  
 - when deploying to tomcat, error "nested child failed to load"
 --> a dependency is breaking the app; add one at a time to figure out which and work around it
 
