package com.augusto.junit;

import org.junit.jupiter.api.*;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemDeTeste {

    @DisplayName("Teste que valida se o usuario foi criado")
   // @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);

    }

    @DisplayName("B")
   // @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
   // @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
   // @Order(2)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
