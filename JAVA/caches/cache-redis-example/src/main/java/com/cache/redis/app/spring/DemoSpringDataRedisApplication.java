package com.cache.redis.app.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Slf4j
@EnableRedisRepositories("com.cache.redis.app.spring.infrastructure.repository")
@EnableMongoRepositories("com.cache.redis.app.spring.infrastructure.repository")
@EnableMongoAuditing
@SpringBootApplication(scanBasePackages = "com.cache.redis.app")
public class DemoSpringDataRedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringDataRedisApplication.class, args);
  }
}
