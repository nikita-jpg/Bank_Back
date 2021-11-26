package com.example.newbreath.controllers;

import com.example.newbreath.models.Admin;
import com.example.newbreath.models.Tariff;
import com.example.newbreath.services.AdminService;
import com.example.newbreath.services.TariffService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    @CrossOrigin
    @PostMapping(value = "/setTariffs")
    public Boolean setTariffs(@RequestBody Map allParams){
        Admin admin = new Admin();
        admin.setLogin(String.valueOf(allParams.get("login")));
        admin.setPassword(String.valueOf(allParams.get("password")));

        if(adminService.findAdmin(admin).size() != 0){

            ArrayList<LinkedHashMap> tariffs = (ArrayList<LinkedHashMap>) allParams.get("tariffs");
            tariffService.saveTariffs(tariffs);
            return true;
        }
        else {
            return false;
        }
    }
}
