package br.edu.fatecsjc.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {

    public void gravar(String sourceCode, String filename) throws IOException {

        String path = "target/classes/";

        File arquivo = new File(path + filename);

        if (!arquivo.exists()) {
            // arquivo.createNewFile();

            FileWriter writer = new FileWriter(arquivo);
            writer.write(sourceCode);
            writer.close();
        }
    }
}
