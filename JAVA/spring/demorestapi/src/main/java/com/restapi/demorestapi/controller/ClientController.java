package com.restapi.demorestapi.controller;


import com.restapi.demorestapi.api.ClientsApi;
import com.restapi.demorestapi.api.dto.ClientRequest;
import com.restapi.demorestapi.api.dto.ClientResponse;
import com.restapi.demorestapi.model.convert.ClientConvert;
import com.restapi.demorestapi.service.ClientService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ClientController implements ClientsApi {

    ClientService clientService;
    ClientConvert clientConvert;

    @Override
    public ResponseEntity<List<ClientResponse>> findAllClient() {
        return ResponseEntity.ok(clientConvert.asClientsResponse(clientService.findAll()));
    }

    @Override
    public ResponseEntity<ClientResponse> findClient(@PathVariable String id) {
        return clientService.findById(id)
                .map(client -> ResponseEntity.ok(clientConvert.asClientResponse(client)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Void> createClient(ClientRequest clientRequest) {
        clientService.save(clientConvert.asClient(clientRequest));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> deleteClient(String id) {
        var client = clientService.findById(id);
        if (client.isPresent()) {
            clientService.delete(client.get());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
