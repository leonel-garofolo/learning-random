package com.cache.caffeine.app;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

public class MiServicioDeCache {

  private final LoadingCache<String, String> cache = Caffeine.newBuilder()
      .maximumSize(3) // Tamaño máximo de la caché
      .expireAfterWrite(10, TimeUnit.SECONDS) // Tiempo de expiración después de escribir
      .build(key -> cargarDatosDeBaseDeDatos(key)); // Función para cargar datos si no están en caché

  public String get(String clave) {
    return cache.getIfPresent(clave);
  }

  public void save(String key, String value) {
    cache.put(key, value);
  }

  public Map<String, String> findAll(List<String> keys) {
    return cache.getAll(keys);
  }

  public long size() {
    return cache.estimatedSize();
  }

  private String cargarDatosDeBaseDeDatos(String clave) {
    cache.put(clave, "test");
    // Lógica para cargar datos desde la base de datos
    return "Datos cargados para la clave: " + clave;
  }

}
