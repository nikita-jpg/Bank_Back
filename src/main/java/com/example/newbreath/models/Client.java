package com.example.newbreath.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "familia")
    private String familia;

    @Column(name = "otchestvo")
    private String otchestvo;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

}
