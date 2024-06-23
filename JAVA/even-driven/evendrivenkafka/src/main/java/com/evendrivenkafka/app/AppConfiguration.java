package com.evendrivenkafka.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfiguration {

  @Bean
  public void initialize() {
    log.info("It's live");
  }
}
