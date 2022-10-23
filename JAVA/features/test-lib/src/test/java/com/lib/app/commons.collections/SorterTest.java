package com.lib.app.commons.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SorterTest {

  private static Logger LOGGER = LoggerFactory.getLogger(SorterTest.class);

  @Test
  public void alphabeticComparator() {
    List<String> nameList = Arrays.asList("Leonel", "Esteban", "Garofolo");
    Collections.sort(nameList);
    LOGGER.debug(nameList.toString());

    Assert.assertEquals("Esteban", nameList.get(0));
  }
}
