package br.edu.fatecsjc;

import br.edu.fatecsjc.controllers.ProblemaController;
import io.javalin.Javalin;

public class MainApplication {

    public static void main(String[] args) {
    	String arq = "input1.txt";
    	LeituraDeArquivos.LerArquivo(arq);
    	
    	
    	Javalin app = Javalin.create().start(7001);

        ProblemaController controler = new ProblemaController(app);
        controler.getProblemas(app);
        controler.getProblemasById(app);
        controler.postProblema(app);   
        
       
        

    }
}
