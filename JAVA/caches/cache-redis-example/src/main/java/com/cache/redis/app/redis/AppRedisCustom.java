package com.cache.redis.app.redis;

import java.util.List;
import java.util.stream.Collectors;

import com.cache.redis.app.redis.custom.RedisConnectionManager;
import com.cache.redis.app.redis.custom.RedisManager;
import com.cache.redis.app.redis.model.Article;

/**
 * Hello world!
 */
public class AppRedisCustom {

  public static void main(String[] args) {
    final RedisManager redisMyList = RedisManager.getInstance("redisMyList");
    redisMyList.add("Elemento1");
    redisMyList.add("Elemento2");
    redisMyList.add("Elemento3");

    // Obtener todos los elementos de la lista
    List<String> elementos = redisMyList.getAll();
    System.out.println("Elementos en la lista: " + elementos);

    // Obtener la longitud de la lista
    System.out.println("Longitud de la lista: " + redisMyList.size());

    List<String> elementosFiltrados = redisMyList.getAll()
        .stream()
        .filter(valor -> valor.equals("Elemento3"))
        .collect(Collectors.toList());

    System.out.println("Longitud de la lista: " + elementosFiltrados);

    final RedisManager redisNewList = RedisManager.getInstance("redisNewList");
    redisMyList.add("Elemento4");
    redisMyList.add("Elemento5");
    redisMyList.add("Elemento6");

    System.out.println("new List: " + redisNewList.getAll());

    // Close the connection
    RedisConnectionManager.closeConnection();
  }

  private static Article newArticle() {
    return new Article(1, "Article1");
  }
}
