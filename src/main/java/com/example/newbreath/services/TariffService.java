package com.example.newbreath.services;

import com.example.newbreath.models.Client;
import com.example.newbreath.models.Tariff;
import com.example.newbreath.repositories.ClientRepository;
import com.example.newbreath.repositories.TariffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffService {
    private final TariffRepository tariffRepository;

    public TariffService(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }

    public List<Tariff> getTariffs(){
        return (List<Tariff>) tariffRepository.findAll();
    }

//    public void saveClient(Client message) {
//        clientRepository.save(message);
//    }
}
