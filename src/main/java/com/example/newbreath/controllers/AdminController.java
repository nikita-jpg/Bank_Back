package com.example.newbreath.controllers;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Client;
import com.example.newbreath.models.Tariff;
import com.example.newbreath.representations.TarifRepresentation;
import com.example.newbreath.services.AdminService;
import com.example.newbreath.services.ClientService;
import com.example.newbreath.services.TariffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/admin")
@RestController
public class AdminController {

    private final AdminService adminService;
    private final TariffService tariffService;

    public AdminController(AdminService adminService, TariffService tariffService) {
        this.adminService = adminService;
        this.tariffService = tariffService;
    }

    @CrossOrigin
    @PostMapping(value = "")
    public Boolean checkAdmin(@RequestBody Admin admin){
        List<Admin> list = adminService.findAdmin(admin);
        if(adminService.findAdmin(admin).size() == 0){
            return false;
        }
        else {
            return true;
        }
    }

    @CrossOrigin
    @PostMapping(value = "/getTariffs")
    public List<Tariff> getTariffs(@RequestBody Admin admin){
        if(adminService.findAdmin(admin).size() != 0){
            return tariffService.getTariffs();
        }
        else {
            return null;
        }
    }
}
