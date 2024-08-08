package com.example.avaliacaoformativa3.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Entidades para o cadastro do carro
    private Integer CodigoCarro;

    private String Marca;
    private String Modelo;
    private LocalDate AnoFabricacao;
    private LocalDate AnoModelo;
    private Integer Valor;


}
