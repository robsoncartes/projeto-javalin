package br.edu.fatecsjc.models;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {

    public static String leArquivo(String arquivo) throws IOException{
        //LEITURA DE ARQUIVOS

        //inicia conteudo
        String conteudo = "";

        File file = new File(arquivo);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                conteudo += sc.nextLine();
            }
        }catch(IOException e) {
            System.out.println("Error: "+e.getMessage());
        }finally {
            if(sc!=null) {
                sc.close();
            }
        }
        return conteudo;
    }

}