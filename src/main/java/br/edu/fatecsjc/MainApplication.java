package br.edu.fatecsjc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.edu.fatecsjc.controllers.ProblemaController;
import io.javalin.Javalin;

public class MainApplication {

    public static void main(String[] args) {
    	String arq = "input1.txt";
    	String arq2 = "input2.txt";
    	LeituraDeArquivos.LerArquivo(arq);
    	LeituraDeArquivosFileReader.LerArquivoFileReader(arq2);
    	GravaçãoNoArquivo.Gravar();
 
    	
    	
    	
    	Javalin app = Javalin.create().start(7001);

        ProblemaController controler = new ProblemaController(app);
        controler.getProblemas(app);
        controler.getProblemasById(app);
        controler.postProblema(app);   
        
       
        

    }
}
