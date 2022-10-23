package com.java8.app.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.app.model.City;
import com.java8.app.model.Person;

public class FilterStream {
  private List<Person> personList = Arrays.asList(
      new Person("leonel", Arrays.asList("Colombia 936", "calle chile"), 10),
      new Person("leonel2", Arrays.asList("Colombia 936", "calle chile"), 10),
      new Person("VAne", Arrays.asList("Mendoza 1008", "calle chile"), 20)
  );

  private List<City> cityList = Arrays.asList(
      new City("Rosario", 10),
      new City("Bs As", 20)
  );

  public void filter(){
    System.out.println(
        personList.stream().filter(person -> person.getNumber() > 15).collect(Collectors.toList())
    );
  }

  public void firstElement(){
    System.out.println(
        personList.stream().findFirst().get()
    );
  }

  public void firstAny(){
    System.out.println(
        personList.stream().findAny().get()
    );
  }


}
