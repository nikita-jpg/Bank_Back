package com.example.newbreath.services;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Client;
import com.example.newbreath.repositories.AdminRepository;
import com.example.newbreath.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> findAdmin(Admin admin) {
        return adminRepository.findByLoginAndPassword(admin.getLogin(),admin.getPassword());
    }
}
