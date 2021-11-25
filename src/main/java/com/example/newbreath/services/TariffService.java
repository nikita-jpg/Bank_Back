package com.example.newbreath.services;

import com.example.newbreath.models.Client;
import com.example.newbreath.models.Tariff;
import com.example.newbreath.repositories.ClientRepository;
import com.example.newbreath.repositories.TariffRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
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

    public void saveTariffs(ArrayList<LinkedHashMap> tariffs) {
        tariffRepository.deleteAll();
        for(int i=0;i<tariffs.size();i++){
            Tariff tariff = new Tariff();
            tariff.setRussianName((String) tariffs.get(i).get("russianName"));
            tariff.setFormula((String) tariffs.get(i).get("formula"));
            tariffRepository.save(tariff);
        }
    }
}
