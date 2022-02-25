package com.RestAPI.TestAPI.controller;

import com.RestAPI.TestAPI.model.Client;
import com.RestAPI.TestAPI.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> list() {
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client add(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @DeleteMapping
    public void remove(@RequestBody Client client) {
        clientRepository.delete(client);
    }

    @PutMapping
    public void update(@RequestBody Client client) {
        if(clientRepository.existsById(client.getId())){
            clientRepository.save(client);
        }
    }
}
