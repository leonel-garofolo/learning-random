package com.cache.caffeine.app.block;

import com.cache.caffeine.app.model.Product;
import com.cache.caffeine.app.utils.Utils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class AtomicCacheTest {

  @Test
  public void given_two_thread_then_block_second_thread_is_block_when_first_is_block_for_written() {
    AtomicCache<Product> synchronizedBlockGlobalCache = new AtomicCache<Product>();

    final Product newProduct1 = new Product(1L, "Product1", true);
    final Product newProduct2 = new Product(2L, "Product2", true);

    // Hilos que actualizan el recurso compartido
    Thread t1 = new Thread(() -> synchronizedBlockGlobalCache.updateObject(newProduct1.getId().toString(), newProduct1));
    Thread t2 = new Thread(() -> synchronizedBlockGlobalCache.updateObject(newProduct2.getId().toString(), newProduct2));

    t1.start();
    t2.start();

    Utils.sleep(10);

    // Hilos que leen el recurso compartido
    Thread t3 = new Thread(() -> log.info("Read resource 1: {}", synchronizedBlockGlobalCache.getObject(newProduct1.getId().toString())));
    Thread t4 = new Thread(() -> log.info("Read resource 2: {}", synchronizedBlockGlobalCache.getObject(newProduct2.getId().toString())));

    t3.start();
    t4.start();

    try {
      t1.join();
      t2.join();
      t3.join();
      t4.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}