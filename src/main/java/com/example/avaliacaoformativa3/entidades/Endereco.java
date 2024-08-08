package com.example.avaliacaoformativa3.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Entides para o cadastro do Endereço
    private Integer CodigoEndereco;

    private String Rua;
    private Integer NumeroCasa;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String CEP;
    private String Complemento;

}
