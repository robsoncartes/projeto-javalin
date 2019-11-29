package br.edu.fatecsjc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivos {
	public static void LerArquivo(String arq) {
	//LEITURA DE ARQUIVOS
    String path ="O:\\FATEC\\4º Semestre\\LPll Nadalete(Terça e Quarta)\\Projetos\\projeto-javalin\\src\\main\\java\\br\\edu\\fatecsjc\\resources\\Mergulho\\"; 
	File file = new File(path+arq);
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
