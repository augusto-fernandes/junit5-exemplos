package com.augusto.junit;

import com.augusto.junit.junit.Pessoa;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTeste {

    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 50, 50};
        int[] segundoLancamento = {10, 20, 30, 50, 50};

       assertArrayEquals(primeiroLancamento, segundoLancamento);
       // Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

       assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}