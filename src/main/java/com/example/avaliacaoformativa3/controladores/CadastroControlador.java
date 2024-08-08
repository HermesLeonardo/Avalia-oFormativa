package com.example.avaliacaoformativa3.controladores;


import com.example.avaliacaoformativa3.entidades.Carro;
import com.example.avaliacaoformativa3.entidades.Cliente;
import com.example.avaliacaoformativa3.entidades.Endereco;
import com.example.avaliacaoformativa3.repositorio.CadastroRepositorio;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
@ComponentScan


public class CadastroControlador {

    private CadastroRepositorio cadastroRepositorio;

    private Cliente cliente = new Cliente();
    private Carro carro = new Carro();
    private Endereco endereco = new Endereco();


    //Aqui chamamos o salvar que por sua vez chama o inserir na classe "CadastroRepositorio"
    public void salvar(){

        cadastroRepositorio.inserir(cliente, carro, endereco);


        Messages.addFlashGlobalInfo("Registro salvo com sucesso");


    }

}














