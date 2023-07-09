# Patterns

## [Gangs of Four (GoF)](https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns) 
GoF Design Patterns are divided into three categories:

1. Creational: The design patterns that deal with the creation of an object.
2. Structural: The design patterns in this category deals with the class structure such as Inheritance and Composition.
3. Behavioral: This type of design patterns provide solution for the better interaction between objects, how to provide lose coupling, and flexibility to extend easily in the future.

### Creational Design Patterns
There are 5 design patterns in the creational design patterns category.

#### Singleton
The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created.

- Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
- The singleton class must provide a global access point to get the instance of the class.
- Singleton pattern is used for logging, drivers objects, caching, and thread pool.

Java Singleton Pattern Implementation
1. Eager initialization ([EagerInitializedSingleton.java](patterns-with-java%2Fsrc%2Fmain%2Fjava%2Fcom%2Fpatterns%2Fgof%2Fsingleton%2FEagerInitializedSingleton.java)) 
2. Static block initialization ([StaticBlockSingleton.java](patterns-with-java%2Fsrc%2Fmain%2Fjava%2Fcom%2Fpatterns%2Fgof%2Fsingleton%2FStaticBlockSingleton.java))
3. Lazy Initialization ([LazyInitializedSingleton.java](patterns-with-java%2Fsrc%2Fmain%2Fjava%2Fcom%2Fpatterns%2Fgof%2Fsingleton%2FLazyInitializedSingleton.java))
4. Thread Safe Singleton ([ThreadSafeSingleton.java](patterns-with-java%2Fsrc%2Fmain%2Fjava%2Fcom%2Fpatterns%2Fgof%2Fsingleton%2FThreadSafeSingleton.java))


#### Factory
The factory pattern takes out the responsibility of instantiating a object from the class to a Factory class.

#### Abstract Factory
Allows us to create a Factory for factory classes.

#### Builder
Creating an object step by step and a method to finally get the object instance.
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

#### Prototype
Creating a new object instance from another similar instance and then modify according to our requirements.

### Structural Design Pattern
#### Adapter
Provides an interface between two unrelated entities so that they can work together.

Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches - class adapter and object adapter - however both these approaches produce same result.
1. Class Adapter - This form uses java inheritance and extends the source interface, in our case Socket class.
2. Object Adapter - This form uses Java Composition and adapter contains the source object.

Some adapter design pattern example I could easily find in JDK classes are;
java.util.Arrays#asList()
java.io.InputStreamReader(InputStream) (returns a Reader)
java.io.OutputStreamWriter(OutputStream) (returns a Writer)

#### Composite
Used when we have to implement a part-whole hierarchy. For example, a diagram made of other pieces such as circle, square, triangle, etc.
Important Points:
- Composite pattern should be applied only when the group of objects should behave as the single object.
- Composite design pattern can be used to create a tree like structure.


## [SOLID](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
#### Single Responsability Principle (SRP)
**Concept:** 
* One Class = One concept and one responsibility
* A class should have only one reason to change.

**How To**
* Small service classes with narrow goals

**Purpose**
* High cohesion and robust
* Allow class composition
* Avoid duplication

**Tips**
* Order | User | Client: These are objects from domain model, non service
* Order Analyzer | OrderProcessor: Generic terms carry more than one liability.
  You have to use OrderTrustabilityChecker | OrderMarginCalculator

#### Open-Closed Principle (OCP)
**Concept:**
* the software should be open to extension and closed to modifications

**How To**
* Not depend on a specific implementation

**Purpose**
* Ease of adding new use cases

**Case**  

Measurable example is the way to do OCP by interfaces, but we can do 
OCP by abstract class where the method getSentLengthPercentage is calulated
in Measurable and only is call from Progress class.


## Liskov Substitution Principle (LSP)
**Concept:**
* Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
* LSP is a premise of OSP

**How To**
* Subclass behavior must respect the contract of the superclass

**Purpose**
* Maintain correctness to be able to apply OCP

**Case**

[UserRepositoryMySql](patterns-with-java/src/main/java/com/patterns/solid/lsv/ok/UserRepositoryMySql.java)

In [SquareTest](patterns-with-java/src/test/java/com/patterns/solid/lsv/violation/SquareTest.java) is violet the ISP because if I replace Square to Rectangle object
I am changing the behavior of the parent class.

## Interface Segregation Principle (ISP)
**Concept:**
* No delivery should be forced to depend on methods it doesn't use.

**How To**
* Define interface contracts based on the deliveries that use them and not on the implementations that we could have (The interfaces belong to the deliveries)
* Avoid Header Interfaces promoting Role Interfaces  
  Header Interface based on the implementation (for Slack, email and file respectively).

**Purpose**
* High cohesion and low structural coupling

**Tips**
* The interfaces belong to the deliveries and not to those who implement them.

**Case**  

[DeliveryRepository](patterns-with-java/src/main/java/com/patterns/solid/isp/DeliveryRepository.java)

## Dependency Inversion Principle (DIP)
**Concept:**
* High level modules should not depend on low level ones. Both should depend on abstractions

**How to:**
* Inject dependencies (parameters received in constructor)
* Depend on the interfaces (contracts) of these dependencies and not on concrete implementations
* LSP as a premise

**Purpose:**
* Facilitate modification and substitution of implementations
* Best class testability

TODO
- Robert C. Martin -> https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html
- read -> https://blog.ploeh.dk/2014/03/10/solid-the-next-step-is-functional/
- wath interview https://www.youtube.com/watch?v=gI8AhDMkICQ&ab_channel=CodelyTV-Redescubrelaprogramaci%C3%B3n
- Specification pattern (DDD) https://en.wikipedia.org/wiki/Specification_pattern
- Example about refactoring https://github.dev/CodelyTV/java-gildedrose-kata/tree/03-ubiquitous_language