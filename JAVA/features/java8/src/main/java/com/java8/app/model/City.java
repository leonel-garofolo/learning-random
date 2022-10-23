package com.java8.app.model;

public class City{
    private String name;

    private int number;

    public City(String name, int number) {
      this.name = name;
      this.number = number;
    }

    public String getName() {
      return name;
    }

    public int getNumber() {
      return number;
    }

    @Override
    public String toString() {
      return "City{" +
          "name='" + name + '\'' +
          ", number=" + number +
          '}';
    }
  }