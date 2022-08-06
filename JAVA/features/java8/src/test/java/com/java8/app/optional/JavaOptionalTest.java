package com.java8.app.optional;

import org.junit.Assert;
import org.junit.Test;

public class JavaOptionalTest {

  @Test
  public void preventNullPointExceptionWithOptional() {
    Assert.assertFalse(new JavaOptional().preventNullPointExceptionWithOptional());
  }
}