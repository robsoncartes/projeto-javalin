package br.edu.fatecsjc.models;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {

    public static String leArquivo(String arquivo) throws IOException {


        // inicia conteúdo
        StringBuilder conteudo = new StringBuilder();

        File file = new File(arquivo);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                conteudo.append(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conteudo.toString();
    }
}