package br.edu.fatecsjc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravaçãoNoArquivo {
	
	public static void Gravar() {
		String[] lines = new String[] {"kleber","Maria","Robson","Otavio","Matheus","Henrique"};
		String path ="O:\\FATEC\\4º Semestre\\LPll Nadalete(Terça e Quarta)\\Projetos\\projeto-javalin\\src\\main\\java\\br\\edu\\fatecsjc\\resources\\Mergulho\\output4.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
