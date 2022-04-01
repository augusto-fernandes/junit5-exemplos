package com.augusto.junit;

import com.augusto.junit.junit.Conta;
import com.augusto.junit.junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
       Conta contaOrigem = new Conta("1234567", 0);
       Conta contaDestino = new Conta("12347", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

         Assertions.assertThrows(IllegalArgumentException.class, ()->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino, -1)) ;

         //espera que nao tenha exceções
         Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
