package com.cache.redis.app.spring.infrastructure.repository.client;

import java.util.List;

import com.cache.redis.app.spring.domain.model.Client;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {

  ClientDao asClientDao(Client client);

  Client asClient(ClientDao clientDao);

  ClientCache asClientCache(ClientDao clientDao);

  ClientCache asClientCache(Client client);

  Client asClient(ClientCache clientCache);

  List<Client> asClient(List<ClientCache> clientCache);

  Client asClient(ClientDTO clientDTO);

  ClientDTO asClientDTO(Client client);

  List<ClientDTO> asAllClientDTO(List<Client> client);

}
