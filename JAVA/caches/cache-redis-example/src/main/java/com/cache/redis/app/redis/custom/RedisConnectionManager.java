package com.cache.redis.app.redis.custom;

import redis.clients.jedis.Jedis;

public abstract class RedisConnectionManager {

  private static Jedis jedis;

  static {
    // Aquí inicializas la conexión al iniciar la aplicación
    String redisHost = "localhost";
    int redisPort = 6379;
    String redisPassword = "eYVX7EwVmmxKPCDmwMtyKVge8oLd2t81"; // O deja en blanco si no hay contraseña

    jedis = new Jedis(redisHost, redisPort);
    if (!redisPassword.isEmpty()) {
      jedis.auth(redisPassword);
    }

    // Puedes agregar más configuraciones según sea necesario
  }

  public static Jedis getConnection() {
    return jedis;
  }

  public static void closeConnection() {
    jedis.close();
  }
}