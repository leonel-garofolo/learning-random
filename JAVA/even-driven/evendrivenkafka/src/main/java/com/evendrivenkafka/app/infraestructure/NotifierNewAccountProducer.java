package com.evendrivenkafka.app.infraestructure;

import com.evendrivenkafka.app.domain.event.SendEmailEvent;
import com.evendrivenkafka.app.infraestructure.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotifierNewAccountProducer {

  @Autowired
  private KafkaProducer kafkaProducer;

  @EventListener
  public void createDelivery(SendEmailEvent sendEmailEvent) {
    log.info("recieved internal event: {}", sendEmailEvent.getAccount());
    kafkaProducer.enviarMensaje("hola " + sendEmailEvent.getAccount(), "test_topic");
  }
}
