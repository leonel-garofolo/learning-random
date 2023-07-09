# Projects in JAVA
In this group, I work in improve different feature in lifecicle of develop in JAVA

#### Simple java project
Command to create a new project with basic features
```
mvn archetype:generate -DgroupId=com.java8.app -DartifactId=java8 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```


#### slf4j Library
I use the log [slf4j](https://www.slf4j.org/) in the projects examples.

**java**
``` 
private final static Logger LOGGER = LoggerFactory.getLogger(MyPrivateClass.class);
``` 

**pom.xml**
``` 
 <!-- libraries version -->
    <slf4j.version>2.0.5</slf4j.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>${slf4j.version}</version>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>${slf4j.version}</version>
    </dependency>
  </dependencies>
```