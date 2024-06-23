package com.cache.redis.app.redis.custom;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisManager extends RedisConnectionManager implements RedisOperation {

  private static RedisManager redisManager;

  private static String key;

  public static RedisManager getInstance(String redisKey) {
    key = redisKey;
    if (redisManager == null) {
      redisManager = new RedisManager();
    }
    return redisManager;
  }

  public void add(Object obj) {
    final Jedis jedis = getConnection();
    jedis.rpush(key, obj.toString());
  }

  @Override
  public boolean exist(Object obj) {
    final Jedis jedis = getConnection();
    return jedis.hexists(key, obj.toString());
  }

  @Override
  public void remove(Object obj) {
    final Jedis jedis = getConnection();
    jedis.hdel(key, obj.toString());
  }

  @Override
  public List<String> getAll() {
    final Jedis jedis = getConnection();
    return jedis.lrange(key, 0, -1);
  }

  @Override
  public long size() {
    final Jedis jedis = getConnection();
    return jedis.llen(key);
  }

}
