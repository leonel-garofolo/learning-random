package com.cache.redis.app.redis.custom;

import java.util.List;

public interface RedisOperation {

  void add(Object obj);

  boolean exist(Object obj);

  void remove(Object obj);

  List<String> getAll();

  long size();

}
