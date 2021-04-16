package br.edu.fatecsjc.models;

import org.junit.jupiter.api.Test;

class EscritaArquivoTest {

    @Test
    public void testaArquivoSaida() throws Exception {
        EscritaArquivo cut = new EscritaArquivo();
        Problema problema = new Problema();
        problema.setFilename("CRIA-SAPORRA2.py");
        cut.gravar("sourcecode", problema.getFilename());
    }
}