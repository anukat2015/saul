# Saul Project 

[![Build Status](https://semaphoreci.com/api/v1/projects/3a8f460c-fd44-42e2-bedb-70611d83a15c/791347/badge.svg)](https://semaphoreci.com/christos-c/saul) 
 
The project contains three modules. See the readme files for each module:

- [Saul core](saul-core/README.md)
- [Saul examples](saul-examples/README.md)
- [Saul webapp] (saul-webapp/README.md)

The project's [official chat group is at Slack](https://cogcomp.slack.com/messages/saul/)

## Getting started 

### Using Saul as dependency 
If you want to use Saul in your project, should first add it as your dependency. 
Note that this is the *recommended* way of using it; if you don't use any 
dependency management system, you can use compile it directly (next section).
Here are examples of how it is done in different dependency managment frameworks. 
For each sample code, replace `VERSION` with the version number reported [in our
sbt file](https://github.com/IllinoisCogComp/saul/blob/master/build.sbt#L10). 

 - Maven 

```xml
<repositories>
    <repository>
        <id>CogcompSoftware</id>
        <name>CogcompSoftware</name>
        <url>http://cogcomp.cs.illinois.edu/m2repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>edu.illinois.cs.cogcomp</groupId>
        <artifactId>saul</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```

 - SBT 

```sbt
resolvers += "CogcompSoftware" at "http://cogcomp.cs.illinois.edu/m2repo/"
libraryDependencies += "edu.illinois.cs.cogcomp" % "saul_2.11" % "VERSION"
```

 - Gradle 
 
```
compile 'edu.illinois.cs.cogcomp:saul_2.11:VERSION'
```

### Compiling Saul  
Usually you need this options if you are developing using Saul, or 
you want to run the examples.  

First, run `sbt`. 

- `projects` will show the names of the existing module names. 
    - `project saulCore` will take you inside the core package. 
    -  `project saulExamples` will take you inside the examples package.
    - `project saulWebapp` will take you inside the webapp package. Then type `run` to start the server. Type `localhost:9000` in browser address bar to see the webapp.
- Inside each project you can `compile` it, or `run` it. 
- To fix the formatting problems, run `format`
