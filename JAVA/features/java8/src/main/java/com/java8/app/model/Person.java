package com.java8.app.model;

import java.util.List;

public class Person{
    private String name;

    private int number;
    private List<String> address;

    public Person(String name, List<String> address) {
      this.name = name;
      this.address = address;
    }

    public Person(String name, List<String> address, int number) {
      this.name = name;
      this.address = address;
      this.number = number;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<String> getAddress() {
      return address;
    }

    public void setAddress(List<String> address) {
      this.address = address;
    }

    public int getNumber() {
      return number;
    }

    @Override
    public String toString() {
      return name;
    }
  }