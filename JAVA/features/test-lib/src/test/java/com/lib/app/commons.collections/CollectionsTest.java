package com.lib.app.commons.collections;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

public class CollectionsTest {

  @Test
  public void collectionUtilsTest() {
    List<String> stringList = Arrays.asList("test1", "test2", "test3");
    Assert.assertTrue(CollectionUtils.isNotEmpty(stringList));
    Assert.assertTrue(CollectionUtils.isEmpty(Arrays.asList()));
  }

  @Test
  public void name() {

  }
}
