package br.edu.fatecsjc.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeituraDeArquivosTest {

    @Test
    public void testaLeitura() throws Exception {

        String arquivo = "/Users/mariaclara1985/Documents/3_fatec_bd/3SEM/LPII/projeto_javalin/projeto-javalin/target/test-classes/a-problem/arqSaidaEsperada1.txt";
        Assertions.assertEquals("C", LeituraDeArquivos.leArquivo(arquivo));
    }
}