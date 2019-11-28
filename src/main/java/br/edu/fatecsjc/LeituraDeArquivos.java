package br.edu.fatecsjc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {
	public static void LerArquivo(String arq) {
	//LEITURA DE ARQUIVOS
    File file = new File("O:\\FATEC\\4º Semestre\\LPll Nadalete(Terça e Quarta)\\Projetos\\projeto-javalin\\src\\main\\java\\br\\edu\\fatecsjc\\resources\\Mergulho\\"+arq);
    Scanner sc = null;
    try {
    	sc = new Scanner(file);
    	while(sc.hasNextLine()) {
    		System.out.println(sc.nextLine());
    	}
    }catch(IOException e) {
    	System.out.println("Error: "+e.getMessage());
    }finally {
    	if(sc!=null) {
    	sc.close();
    	}
    }
	}
}
