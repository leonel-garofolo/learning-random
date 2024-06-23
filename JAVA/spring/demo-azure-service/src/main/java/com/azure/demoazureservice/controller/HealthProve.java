package com.azure.demoazureservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthProve {


  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public void getHealthProve(){
    System.out.println("Test health prove");
  }

}
