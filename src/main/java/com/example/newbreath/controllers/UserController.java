package com.example.newbreath.controllers;

import com.example.newbreath.models.Client;
import com.example.newbreath.models.Tariff;
import com.example.newbreath.services.TariffService;
import org.springframework.web.bind.annotation.*;
import com.example.newbreath.services.ClientService;

import java.util.List;

@RequestMapping(value = "/")
@RestController
public class UserController {

    private final ClientService clientService;
    private final TariffService tariffService;

    public UserController(ClientService clientService, TariffService tariffService) {
        this.clientService = clientService;
        this.tariffService = tariffService;
    }

    @CrossOrigin
    @GetMapping(value = "/getTariffs")
    public List<Tariff> getTariffs(){
        return tariffService.getTariffs();
    }

    @CrossOrigin
    @PostMapping(value = "")
    public Client addUser(@RequestBody Client client){
        clientService.saveClient(client);
        return client;
    }

}
