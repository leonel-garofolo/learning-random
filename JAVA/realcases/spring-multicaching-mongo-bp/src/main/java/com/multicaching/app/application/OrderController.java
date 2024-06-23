package com.multicaching.app.application;

import java.util.ArrayList;
import java.util.List;

import com.multicaching.app.application.dto.OrderDTO;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@NoArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

  //@Autowired
  //private ClientService clientService;

  @GetMapping("/all")
  public List<OrderDTO> findAll() {
    log.info("findAll");
    //TODO
    return new ArrayList<>();
  }

}
