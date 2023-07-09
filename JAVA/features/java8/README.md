# Feature of Java 8

## Lambdas

## @FunctionalInteface

## Optional Object
It's feature is important use to prevent the NullPointerException in runtime execution. 
[Example](src/main/java/com/java8/app/optional/JavaOptional.java)

## New functions and Stream Object in Collections

- Streams. 
- Introduce computeIfAbsent in HashMap.  
- Function interface. 
- Consumers
- Predicates
- Operators

[Examples](src/main/java/com/java8/app/optional/JavaOptional.java)

## Functional Programming
Functional programming is a programming paradigm in which we try to bind everything in pure mathematical functions style.

#### Funciones puras.

#### Composición de funciones.

#### Estados compartidos.

#### Mutabilidad.

#### Efecto secundario.    
    
## Implementation default method in Java Interface
Java 8 allow us implement default method in an interface without necessary implement all method in object implamentation,
such as [VehicleInterface](src/main/java/com/java8/app/interfaces/VehicleInterface.java):
```
default Boolean isWorking(Vehicle vehicle){
    return true;
}
```
    


