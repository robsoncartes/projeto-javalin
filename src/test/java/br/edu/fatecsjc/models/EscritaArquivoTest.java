package br.edu.fatecsjc.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscritaArquivoTest {
    private EscritaArquivo cut;

    @Test
    public void testaArquivoSaida() throws Exception {
        cut = new EscritaArquivo();
        Problema problema = new Problema();
        problema.setFilename("CRIA-SAPORRA2.py");
        cut.gravar("sourcecode",problema.getFilename());
//        Assertions.assertEquals("bla", cut.gravar(problema));
    }
}