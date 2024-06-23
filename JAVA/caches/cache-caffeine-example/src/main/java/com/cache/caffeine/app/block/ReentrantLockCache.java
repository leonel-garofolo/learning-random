package com.cache.caffeine.app.block;

import com.cache.caffeine.app.model.ID;
import com.cache.caffeine.app.utils.Utils;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Example of synchronized blocking all thread when it try to use the same resource
 * using specific block in method. It is not coordinate block between method
 * Important, guarantee the order of entry of threads, it manager better than synchronized
 * @param <T> Object of domain
 */

@Slf4j
public class ReentrantLockCache<T extends ID> {
    private final Cache<String, Object> cache;

    // Sync thread that into in the threads pool
    private final Lock lock = new ReentrantLock(true);

    public ReentrantLockCache() {
        cache = Caffeine.newBuilder().build();
    }

    public void updateObject(String key, Object newValue) {
        log.info("updateObject - waiting synchronized {} : {}", key, newValue);
        lock.lock();
        try {
            log.info("timer {} : {}", key, newValue);
            Utils.sleep(1000);
            cache.put(key, newValue);
            log.info("update {} : {}", key, newValue);
        } finally {
            lock.unlock();
        }
    }

    public Object getObject(String key) {
        log.info("getObject - waiting synchronized {}", key);
        lock.lock();
        try {
            log.info("getObject - getIfPresent {}", key);
            return cache.getIfPresent(key);
        } finally {
            lock.unlock();
        }
    }
}
