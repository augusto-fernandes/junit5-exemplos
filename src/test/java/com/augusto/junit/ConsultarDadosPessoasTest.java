package com.augusto.junit;

import com.augusto.junit.junit.BancoDeDados;
import com.augusto.junit.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoasTest{


    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Joao", LocalDateTime.of(2000,1,1 ,12,1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of(2000,1,1 ,12,1)));
    }
    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
