package spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import com.cache.redis.app.spring.domain.ClientService;
import com.cache.redis.app.spring.domain.infrastructure.ClientRepositoryDecorator;
import com.cache.redis.app.spring.domain.model.Client;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientMapper;
import com.cache.redis.app.spring.service.ClientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = ClientServiceImpl.class)
@Slf4j
public class BasicRedisCacheOperationTest {

  @Autowired
  public ClientService clientService;

  @MockBean
  public ClientMapper clientMapper;

  @MockBean
  public ClientRepositoryDecorator clientRepositoryDecorator;

  @Test
  public void given_data_Client_when_initial_app_then_create_new_client() {

    assertTrue(true);
    clientService.clear();
    // Crear y persistir una persona
    Optional<Client> client = Optional.of(newPersona("1"));
    clientService.save(client.get());
    client = Optional.of(newPersona("2"));
    clientService.save(client.get());
    client = Optional.of(newPersona("3"));
    clientService.save(client.get());
    client = Optional.of(newPersona("4"));
    clientService.save(client.get());

    Mockito.when(clientRepositoryDecorator.findById(client.get().getId())).thenReturn(client);

    // Recuperar una persona por ID
    Client clientRecuperada = clientService.get(client.get().getId());
    log.info("Client getting: {}", clientRecuperada);
    assertEquals(4, clientRecuperada.getId());
  }

  private Client newPersona(String id) {
    Client client = Client.builder().build();
    client.setId(id);
    client.setName("Juan" + id);
    client.setYearOld(30);
    return client;
  }
}
