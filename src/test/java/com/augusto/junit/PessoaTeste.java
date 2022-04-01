package com.augusto.junit;

import com.augusto.junit.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa Jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,0,
        0));
        Assertions.assertEquals(22, Jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa Jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,0, 0));
        Assertions.assertTrue(Jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
