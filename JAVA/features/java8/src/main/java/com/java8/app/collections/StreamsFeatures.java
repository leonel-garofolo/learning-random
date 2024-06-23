package com.java8.app.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.java8.app.model.City;
import com.java8.app.model.Person;

/**
 * Document about Streams vs Collections https://www.oracle.com/lad/technical-resources/articles/java/processing-streams-java-se8.html Also,
 * we can see the feature of develop with Programing funtional Performance: https://blog.knoldus.com/java-streams-vs-loop/
 * Summary: https://www.thecodecity.com/java/streams-in-java/
 */
public class StreamsFeatures {

  public void countDeclarativeVsImperative() {
    //Declarativo.
    List<Integer> numeros = Arrays.asList(18, 6, 4, 15, 55, 78, 12, 9, 8);
    int contador = 0;
    for (int numero : numeros) {
      if (numero > 10) {
        contador++;
      }
    }
    System.out.println(contador);

    Long result = numeros.stream().filter(num -> num > 10).count();
    System.out.println(result);
  }

  public void filterList() {
    List<String> list = Arrays.asList("foo", "bar", "aaa");

    List<String> listFiltered = list.stream()
        .filter(s -> s.equals("aaa"))
        .collect(Collectors.toList());
    listFiltered.forEach(s -> System.out.println(s));
  }

  public void filterObjectsWithoutFor() {
    List<Person> personList = Arrays.asList(
        new Person("leonel", Arrays.asList("Colombia 936", "calle chile")),
        new Person("VAne", Arrays.asList("Mendoza 1008", "calle chile"))
    );

    List<Person> personFiltered =
        personList.stream().filter(p -> p.getAddress().stream().anyMatch(address -> address.contains("Col"))).collect(Collectors.toList());
    personFiltered.forEach(s -> System.out.println(s.toString()));
  }

  public void iterateRangeInteger() {
    IntStream.range(0, 10)
        .forEach(idx -> System.out.println(idx));
  }

  public void iterateRangeDecreaseInteger() {
    //TODO ???
    IntStream.range(0, 10)
        .forEach(idx -> System.out.println(idx));
  }

  public void createArrayChild() {
    List<Person> personList = Arrays.asList(
        new Person("leonel", Arrays.asList("Colombia 936", "calle chile")),
        new Person("VAne", Arrays.asList("Mendoza 1008", "calle chile"))
    );

    Set<String> addresses = personList.stream().flatMap(person -> person.getAddress().stream()).collect(Collectors.toSet());
    System.out.println(
        addresses
    );
  }

  public void createArrayFromIdChild() {
    List<Person> personList = Arrays.asList(
        new Person("leonel", Arrays.asList("Colombia 936", "calle chile"), 10),
        new Person("leonel2", Arrays.asList("Colombia 936", "calle chile"), 10),
        new Person("VAne", Arrays.asList("Mendoza 1008", "calle chile"), 20)
    );

    List<City> cityList = Arrays.asList(
        new City("Rosario", 10),
        new City("Bs As", 20)
    );

    System.out.println(
        personList.stream()
            .filter(person -> person.getNumber() == 10)
            .map(person -> cityList.stream().filter(city -> city.getNumber() == person.getNumber()).collect(Collectors.toList()))
            .collect(Collectors.toList())
    );
  }

}
