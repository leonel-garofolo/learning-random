package com.cache.caffeine.app.utils;

public class Utils {

  public static void sleep(long milis) {
    try {
      Thread.sleep(milis);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
