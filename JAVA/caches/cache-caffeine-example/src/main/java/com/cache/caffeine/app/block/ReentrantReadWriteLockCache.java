package com.cache.caffeine.app.block;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.cache.caffeine.app.model.ID;
import com.cache.caffeine.app.utils.Utils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReentrantReadWriteLockCache<T extends ID> {

  private final Cache<String, Object> cache;

  private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

  public ReentrantReadWriteLockCache() {
    cache = Caffeine.newBuilder().build();
  }

  public void updateObject(String key, Object newValue) {
    log.info("updateObject - waiting synchronized {} : {}", key, newValue);
    lock.writeLock().lock();
    try {
      log.info("timer {} : {}", key, newValue);
      Utils.sleep(1000);
      cache.put(key, newValue);
      log.info("update {} : {}", key, newValue);
    } finally {
      lock.writeLock().unlock();
    }
  }

  public Object getObject(String key) {
    log.info("getObject - waiting synchronized {}", key);
    lock.readLock().lock();
    try {
      log.info("getObject - getIfPresent {}", key);
      return cache.getIfPresent(key);
    } finally {
      lock.readLock().unlock();
    }
  }
}
