package com.cache.redis.app.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cache.redis.app.spring.domain.model.Client;
import com.cache.redis.app.spring.domain.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {EmbededRedisTestConfiguration.class})
@Slf4j
public class BasicRedisCacheOperationIT {

  @Autowired
  public ClientService clientService;

  @Test
  @DisplayName(
      "GIVEN get data clients " +
          "WHEN reset and save news client " +
          "THEN push entity in Redis cache"
  )
  public void given_data_Client_when_initial_app_then_create_new_client() {
    assertTrue(true);
    clientService.clear();
    // Crear y persistir una persona
    Client client = newPersona(1L);
    clientService.save(client);
    client = newPersona(2L);
    clientService.save(client);
    client = newPersona(3L);
    clientService.save(client);
    client = newPersona(4L);
    clientService.save(client);

    // Get a client by ID
    Client clientRecuperada = clientService.get(client.getId());
    log.info("Client getting: {}", clientRecuperada);
    assertEquals(4, clientRecuperada.getId());

    clientService.clear();
    assertNull(clientService.get(client.getId()));
  }

  private Client newPersona(Long id) {
    return Client.builder()
        .id(id)
        .name("Juan" + id)
        .yearOld(30)
        .build();
  }
}
