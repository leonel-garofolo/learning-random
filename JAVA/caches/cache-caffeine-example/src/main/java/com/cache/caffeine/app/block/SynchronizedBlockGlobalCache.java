package com.cache.caffeine.app.block;

import com.cache.caffeine.app.model.ID;
import com.cache.caffeine.app.utils.Utils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;

/**
 * Example of synchronized blocking all thread when it try to use the same resource
 * using specific block in method. It is not coordinate block between method
 * Important:
 *  - Don't guarantee the order of entry of threads
 *  - No Guarantee of Fairness: synchronized does not guarantee fairness.
 *    A thread may be repeatedly favored over other threads,
 *    which could lead to starvation in systems with high lock contention.
 *
 * @param <T> Object of domain
 */
@Slf4j
public class SynchronizedBlockGlobalCache<T extends ID> {

  private final Cache<String, T> cache;

  private final Object lock = new Object();

  public SynchronizedBlockGlobalCache() {
    cache = Caffeine.newBuilder().build();
  }

  /**
   * How use a Object in synchronized, so I block all thread
   */
  public void updateObject(String key, T newValue) {
    log.info("updateObject - waiting synchronized {} : {}", key, newValue);
    synchronized (lock) {
      // updated the object
      log.info("timer {} : {}", key, newValue);
      Utils.sleep(1000);
      log.info("update {} : {}", key, newValue);
      cache.put(key, newValue);
    }
  }

  public Object getObject(String key) {
    log.info("getObject - waiting synchronized {}", key);
    synchronized (lock) {
      log.info("getObject - getIfPresent {}", key);
      return cache.getIfPresent(key);
    }
  }
}
