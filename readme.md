Make project boilerplate
	pom - dep
	 - spring-webmvc
	 - jstl (provided)
	 - servlet-api (provided)
	 - hibernate-validator (form validations)
	pom - plugin
	 - maven-compiler-plugin
	web.xml
	 - change to xml, version should match version of servlet-api
	 - add dispatcher servlet to route requests to config file
	servlet-config.xml
	 - use spring-IDE to set-up xml includes
	 - enable annotation driven coding and parsing of controllers
	 - set-up internal view resolver to point to views folders
	 
Server
	make server in eclipse - in order to add app to server
	 - the app must be faceted (RC -> properties -> project facets
	 - the facet "dynamic web app" must be selected (min java 1.6)
	 	*if "dynamic web app" doesn't appear as an option, you need to add java-ee to IDE

Errors
 - java.lang.classexception "org.spring..." not found
 --> need to add maven dependencies to build path (RC -> properties -> DeploymentAssemblies)
 
 ASM Class reader failed to parse file
  - java 8 requires spring 4 (which breaks on my Maven)
  --> use source/target 1.7 in maven builder and spring 3.x.x