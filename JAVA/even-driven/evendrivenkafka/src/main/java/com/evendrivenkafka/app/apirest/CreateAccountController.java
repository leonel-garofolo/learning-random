package com.evendrivenkafka.app.apirest;

import com.evendrivenkafka.app.application.NotifierNewAccountUserCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/account")
public class CreateAccountController {

  @Autowired
  private NotifierNewAccountUserCase notifierNewAccountUserCase;

  @PostMapping("/create")
  public void create() {
    notifierNewAccountUserCase.sendEmail();
  }
}
