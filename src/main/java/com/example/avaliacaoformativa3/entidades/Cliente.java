package com.example.avaliacaoformativa3.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Entidades do cadastro da Pessoa
    private Integer CodigoPessoa;

    private String Nome;
    private Integer CPF;
    private LocalDate DadaNasc;

}
