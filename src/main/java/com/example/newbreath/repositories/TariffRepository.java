package com.example.newbreath.repositories;

import com.example.newbreath.models.Client;
import com.example.newbreath.models.Tariff;
import org.springframework.data.repository.CrudRepository;

public interface TariffRepository  extends CrudRepository<Tariff, Integer> {
}
