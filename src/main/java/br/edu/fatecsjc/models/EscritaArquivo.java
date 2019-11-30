package br.edu.fatecsjc.models;

import java.io.*;

public class EscritaArquivo {

    public void gravar(String sourceCode, String filename) throws IOException {
//        String sourceCode = problema.getSourcecode();

        String path = "src/main/resources/";

        File arquivo = new File(path + filename);

        if (!arquivo.exists()) {
            arquivo.createNewFile();

            FileWriter writer = new FileWriter(arquivo);
            writer.write(sourceCode);
            writer.close();
        }
    }
}
