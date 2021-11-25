package com.example.newbreath.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static com.example.newbreath.NewbreathApplication.STRING_ARRAY;

@Getter
@Setter
@Entity
@Table(name = "tariffs")
public class Tariff {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "russian_name")
    private String russianName;

    @Column(name = "formula")
    private String formula;
}


