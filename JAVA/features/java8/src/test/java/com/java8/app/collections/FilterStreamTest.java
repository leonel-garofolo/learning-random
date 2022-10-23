package com.java8.app.collections;

import org.junit.Test;

public class FilterStreamTest {

  final FilterStream filterStream = new FilterStream();

  @Test
  public void filterTest(){
    filterStream.filter();
  }

  @Test
  public void firstElement(){
    filterStream.firstElement();
  }

  @Test
  public void firstAny(){
    filterStream.firstAny();
  }


}
