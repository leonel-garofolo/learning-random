package com.cache.redis.app.spring.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.util.Converter;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Slf4j
@Configuration
@EnableMongoRepositories(basePackages = "com.delivery.authenticator.infrastructure.jpa")
public class MongoConfiguration extends AbstractMongoClientConfiguration {

  private static final String PACKAGE_MODEL = "com.delivery.authenticator.infrastructure.dao";

  private final List<Converter<?, ?>> converters = new ArrayList<>();

  @Value("${spring.data.mongodb.host}")
  private String host;

  @Value("${spring.data.mongodb.port}")
  private int port;

  @Value("${spring.data.mongodb.database}")
  private String database;

  @Value("${spring.data.mongodb.username}")
  private String username;

  @Value("${spring.data.mongodb.password}")
  private String password;

  @Override
  public MongoClient mongoClient() {
    final String connectionString = "mongodb://" + username + ":" + password + "@" + host + ":" + port + "/?retryWrites=true&w=majority";
    log.info("MongoDB connection string: {}", connectionString);
    return MongoClients.create(connectionString);
  }

  @Override
  protected String getDatabaseName() {
    return database;
  }

  @Override
  public Collection<String> getMappingBasePackages() {
    return Collections.singleton(PACKAGE_MODEL);
  }

  @Bean
  public MongoTemplate mongoTemplate() throws Exception {
    return new MongoTemplate(mongoClient(), getDatabaseName());
  }
}