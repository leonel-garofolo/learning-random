package com.evendrivenkafka.app.infraestructure.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class KafkaConfiguration {

  @Bean
  public void setup(){
    log.info("Kafka configuration");
  }

  /** if need the topic is created in kafka, you can do it by configuration bean
  @Bean
  public NewTopic topic() {
    return TopicBuilder.name("topic1")
        .partitions(10)
        .replicas(1)
        .build();
  }
  */

}
