package com.lib.app.collections;

import java.util.Comparator;

public class SpecialComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }
}
