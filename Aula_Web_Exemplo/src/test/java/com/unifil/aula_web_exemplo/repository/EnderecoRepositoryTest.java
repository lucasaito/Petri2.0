package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Endereco;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A ANOTAÇÃO DataJpaTest IRÁ INDICAR AO SPRING QUE A CLASSE TESTE
 * QUE ESTÁ SENDO CADASTRADO, SERÁ REALIZADO EM INTERFACES JPA DO SISTEMA.
 */
@DataJpaTest
/**
 * ANOTAÇÃO QUE IRÁ INDICAR QUAL ARQUIVO DE CONFIGURAÇÃO ELE DEVERÁ ACESSAR
 */
@ActiveProfiles("test")
class EnderecoRepositoryTest {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void findAll() {
        this.criarEndereco();

        List<Endereco> enderecos = enderecoRepository.findAll();
        assertEquals(1, enderecos.size());
        assertEquals("Londrina", enderecos.get(0).getCidade());
    }

    @Test
    public void findByCidade() {

        this.criarEndereco();

        Endereco endereco = enderecoRepository.findByCidade("Londrina");
        assertNotNull(endereco);
        assertEquals("Londrina", endereco.getCidade());

    }

    private void criarEndereco(){
        Endereco endereco = new Endereco();
        endereco.setCidade("Londrina");
        endereco.setRua("Rua 1");
        endereco.setBairro("Bairro 1");
        endereco.setEstado("PR");

        this.entityManager.persist(endereco);
    }
}