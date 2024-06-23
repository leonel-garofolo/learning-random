package com.evendrivenkafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AppSpringKafka {

  public static void main(String[] args) {
    SpringApplication.run(AppSpringKafka.class, args);
  }
}
