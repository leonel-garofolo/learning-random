package com.evendrivenkafka.app.infraestructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotifierNewAccountConsumer {

  @KafkaListener(groupId = "test-group", topics = "test_topic")
  public void createDelivery(String message) {
    log.info("recieved something: {}", message);
  }

}
