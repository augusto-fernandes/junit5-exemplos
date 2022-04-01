package com.augusto.junit.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static  final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizou a conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        //insere pessoas no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //insere pessoas no DB
        LOGGER.info("Removeu dados");
    }
}
