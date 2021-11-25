package com.example.newbreath.repositories;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
    List<Admin> findByLoginAndPassword(String name, String password);
}
