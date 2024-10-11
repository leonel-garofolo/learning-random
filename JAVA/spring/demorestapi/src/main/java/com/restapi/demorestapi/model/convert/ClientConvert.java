package com.restapi.demorestapi.model.convert;

import com.restapi.demorestapi.api.dto.ClientRequest;
import com.restapi.demorestapi.api.dto.ClientResponse;
import com.restapi.demorestapi.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientConvert {

    List<ClientResponse> asClientsResponse(List<Client> clients);

    ClientResponse asClientResponse(Client client);

    Client asClient(ClientRequest clientRequest);
}
