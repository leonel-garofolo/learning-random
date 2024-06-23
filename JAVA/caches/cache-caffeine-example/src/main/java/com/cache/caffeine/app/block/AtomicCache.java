package com.cache.caffeine.app.block;

import java.util.concurrent.ConcurrentMap;

import com.cache.caffeine.app.model.ID;
import com.cache.caffeine.app.utils.Utils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;

/**
 * If we used the atomic alternative, we lost the control when have a lot of thread reading the value.
 * If we want to use atomic, we have to add ReentrantReadWriteLock strategy to do a robust solution.
 * @param <T>
 */
@Slf4j
public class AtomicCache<T extends ID> {

  private final Cache<String, T> cache;

  public AtomicCache() {
    cache = Caffeine.newBuilder().build();
  }

  public void updateObject(String key, T newValue) {
    log.info("updateObject - waiting synchronized {} : {}", key, newValue);
    ConcurrentMap<String, T> map = cache.asMap();
    map.compute(key, (k, existingObject) -> {
      log.info("timer {} : {}", key, newValue);
      Utils.sleep(1000);
      log.info("update {} : {}", key, newValue);
      return newValue;
    });
  }

  public T getObject(String key) {
    log.info("getObject - getIfPresent {}", key);
    return cache.getIfPresent(key);
  }
}
