package com.cache.redis.app.spring.infrastructure.apirest;

import java.util.List;
import java.util.Optional;

import com.cache.redis.app.spring.domain.application.CreateNewClientUserCase;
import com.cache.redis.app.spring.domain.application.FindAllClientUserCase;
import com.cache.redis.app.spring.domain.application.FindClientByIdUserCase;
import com.cache.redis.app.spring.domain.application.RemoveClientUserCase;
import com.cache.redis.app.spring.domain.application.UpdateClientUserCase;
import com.cache.redis.app.spring.domain.model.Client;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientDTO;
import com.cache.redis.app.spring.infrastructure.repository.client.ClientMapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@NoArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

  @Autowired
  private ClientMapper clientMapper;

  @Autowired
  private CreateNewClientUserCase createNewClientUserCase;

  @Autowired
  private UpdateClientUserCase updateClientUserCase;

  @Autowired
  private RemoveClientUserCase removeClientUserCase;

  @Autowired
  private FindClientByIdUserCase findClientByIdUserCase;

  @Autowired
  private FindAllClientUserCase findAllClientUserCase;

  @PostMapping
  public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO) {
    if (clientDTO == null) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ClientDTO is null");
    }

    if (clientDTO.getId() == null) {
      final Client clientSaved = createNewClientUserCase.handle(clientMapper.asClient(clientDTO));
      clientDTO = clientMapper.asClientDTO(clientSaved);
    } else {
      updateClientUserCase.handle(clientMapper.asClient(clientDTO));
    }

    return ResponseEntity.ok(clientDTO);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Boolean> delete(@PathVariable String id) {
    if (id == null) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID is null");
    }
    return ResponseEntity.ok(removeClientUserCase.handle(id));
  }

  @GetMapping
  public ResponseEntity<List<ClientDTO>> findAll() {
    final List<Client> allClients = findAllClientUserCase.handle(null);
    final List<ClientDTO> allDtoClients = clientMapper.asAllClientDTO(allClients);
    return ResponseEntity.ok(allDtoClients);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ClientDTO> findById(@PathVariable String id) {
    Optional<Client> findClient = findClientByIdUserCase.handle(id);
    if (findClient.isPresent()) {
      final ClientDTO clientDTO = clientMapper.asClientDTO(findClient.get());
      return ResponseEntity.ok(clientDTO);
    }
    return ResponseEntity.ok(null);
  }
}
