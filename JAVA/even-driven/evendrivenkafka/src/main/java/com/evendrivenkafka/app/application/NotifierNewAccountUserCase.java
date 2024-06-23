package com.evendrivenkafka.app.application;

import com.evendrivenkafka.app.domain.Account;
import com.evendrivenkafka.app.domain.event.SendEmailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class NotifierNewAccountUserCase {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public boolean sendEmail() {
    final Account account = new Account();
    account.setName("Leonel");
    account.setUsername("leonel_garofolo");
    account.setEmail("garofolo.leonel@gmail.com");
    SendEmailEvent sendEmailEvent = new SendEmailEvent(this, account);
    applicationEventPublisher.publishEvent(sendEmailEvent);
    return true;
  }
}
