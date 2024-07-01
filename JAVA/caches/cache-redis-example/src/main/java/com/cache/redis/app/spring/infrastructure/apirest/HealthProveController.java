package com.cache.redis.app.spring.infrastructure.apirest;

import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RestController
public class HealthProveController {

  @GetMapping()
  public ResponseEntity<String> info() {
    return ResponseEntity.ok("Application is live!");
  }
}
