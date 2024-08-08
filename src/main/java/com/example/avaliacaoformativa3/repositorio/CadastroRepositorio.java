package com.example.avaliacaoformativa3.repositorio;

import com.example.avaliacaoformativa3.entidades.Carro;
import com.example.avaliacaoformativa3.entidades.Cliente;
import com.example.avaliacaoformativa3.entidades.Endereco;
import org.springframework.stereotype.Component;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
@Component


//parte responsavel por realizar o cadastro diretamente no banco de dados
public class CadastroRepositorio {

    @PersistenceContext
    private  EntityManager entityManager;

    @Transactional

    public void  inserir(Cliente cliente, Carro carro, Endereco endereco){
            entityManager.persist(cliente);
            entityManager.persist(endereco);
            entityManager.persist(carro);

    }


}
