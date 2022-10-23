package com.java8.app.collections;

import org.junit.Before;
import org.junit.Test;

public class StreamsFeaturesTest {

  private StreamsFeatures streamsFeatures;

  @Before
  public void init() {
    this.streamsFeatures = new StreamsFeatures();
  }

  @Test
  public void countDeclarativeVsImperativeTest() {
    this.streamsFeatures.countDeclarativeVsImperative();
  }

  @Test
  public void filterListTest() {
    this.streamsFeatures.filterList();
  }

  @Test
  public void filterObjectsWithoutForTest() {
    this.streamsFeatures.filterObjectsWithoutFor();
  }

  @Test
  public void iterateRangeIntegerTest() {
    this.streamsFeatures.iterateRangeInteger();
  }

  @Test
  public void iterateRangeDecrementIntegerTest() {
    this.streamsFeatures.iterateRangeDecreaseInteger();
  }

  @Test
  public void createArrayChildTest() {
    this.streamsFeatures.createArrayChild();
  }

  @Test
  public void createArrayFromIdChildTest() {
    this.streamsFeatures.createArrayFromIdChild();
  }

}
