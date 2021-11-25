package com.example.newbreath.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class Admin {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Id
    @Column(name = "login")
    private String login;

    @Id
    @Column(name = "password")
    private String password;
}
