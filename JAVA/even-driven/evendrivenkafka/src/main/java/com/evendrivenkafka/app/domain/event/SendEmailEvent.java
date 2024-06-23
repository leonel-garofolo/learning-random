package com.evendrivenkafka.app.domain.event;

import com.evendrivenkafka.app.domain.Account;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class SendEmailEvent extends ApplicationEvent {

  private Account account;

  public SendEmailEvent(Object source, Account account) {
    super(source);
    this.account = account;
  }
}
