package com.example.newbreath.services;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Client;
import com.example.newbreath.repositories.AdminRepository;
import com.example.newbreath.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void findAdmin(Admin admin) {
        adminRepository.findByLoginAndPassword(admin.getLogin(),admin.getPassword());
    }
}
