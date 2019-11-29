package br.edu.fatecsjc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivosFileReader {
	
	public static void LerArquivoFileReader(String arq) {
		
		String path ="O:\\FATEC\\4º Semestre\\LPll Nadalete(Terça e Quarta)\\Projetos\\projeto-javalin\\src\\main\\java\\br\\edu\\fatecsjc\\resources\\Mergulho\\"; 
		try(BufferedReader br = new BufferedReader(new FileReader(path+arq))) {
			String line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		}catch(IOException e){
			System.out.println("Error: "+e.getMessage());
		}
		}
}
