package com.augusto.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {
    @Test
    // @EnabledOnOs(OS.MAC)//roda apenas no sistema operacional declarado
   // @EnabledIfEnvironmentVariable(named = "USER", matches = "augusto")
    @EnabledOnJre(JAVA_17) // roda apenas no java 17
    void validarAlgoSomenteNoUsuarioAugusto(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
