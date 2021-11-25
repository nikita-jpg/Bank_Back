package com.example.newbreath.controllers;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Client;
import com.example.newbreath.models.TariffModel;
import com.example.newbreath.representations.TarifRepresentation;
import com.example.newbreath.services.AdminService;
import com.example.newbreath.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/admin")
@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @CrossOrigin
    @PostMapping(value = "")
    public Boolean checkAdmin(@RequestBody Admin admin){
        if(adminService.findAdmin(admin).size() == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
