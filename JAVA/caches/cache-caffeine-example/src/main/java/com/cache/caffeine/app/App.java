package com.cache.caffeine.app;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

  private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    MiServicioDeCache servicioDeCache = new MiServicioDeCache();

    List<String> keys = new ArrayList<>();
    // Almacenar datos en caché
    for (int i = 0; i < 10; i++) {
      String key = "clave"+i;
      LOGGER.info(key);
      servicioDeCache.save(key, "Hola"+i);
      keys.add(key);
      LOGGER.info("size: {}", servicioDeCache.size());
      //LOGGER.info("valores del mapa: {}", servicioDeCache.findAll(keys));
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
