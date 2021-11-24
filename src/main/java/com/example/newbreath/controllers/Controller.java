package com.example.newbreath.controllers;

import com.example.newbreath.models.Client;
import com.example.newbreath.models.TariffModel;
import org.springframework.web.bind.annotation.*;
import com.example.newbreath.repositories.ClientRepository;
import com.example.newbreath.representations.TarifRepresentation;
import com.example.newbreath.services.ClientService;

@RequestMapping(value = "/")
@RestController
public class Controller {

    private final ClientService clientService;

    public Controller(ClientService clientService) {
        this.clientService = clientService;
    }

//    @RequestParam(value = "tarifServerName") String tarifServerName
    @CrossOrigin
    @GetMapping(value = "")
    public String getFirstPage(){
        Client client = new Client();
        client.setName("ds");
        clientService.saveMessage(client);
        return "1561";
//        TariffModel tariffModelModel = new TariffModel();
//        TarifRepresentation tarifRepresentation = new TarifRepresentation();
//        int tarifNumber = tariffModelModel.getTariffNumber(tarifServerName);
//        if(tarifNumber == -1){
//            return "0";
//        }else {
//            String ret = tarifRepresentation.getMathExpression(tarifNumber);
//            return ret;
//        }
    }

}
