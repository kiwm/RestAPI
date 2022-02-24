package com.RestAPI.TestAPI.controller;

import com.RestAPI.TestAPI.model.Client;
import com.RestAPI.TestAPI.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Client add(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}
