package com.example.newbreath.services;

import com.example.newbreath.models.Client;
import org.springframework.stereotype.Service;
import com.example.newbreath.repositories.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void saveClient(Client message) {
        clientRepository.save(message);
    }
}
