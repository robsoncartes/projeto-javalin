package br.edu.fatecsjc;

import br.edu.fatecsjc.controllers.ProblemaController;
import br.edu.fatecsjc.models.Problema;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        Problema problema1 = new Problema(1, "zerinho.py", "A", "Sourcecode 1");
        Problema problema2 = new Problema(1, "mergulho.py", "B", "Sourcecode 1");

        List<Problema> problemas = new ArrayList<>();
        problemas.add(problema1);
        problemas.add(problema2);

        Javalin app = Javalin.create().start(7001);

        app.get("/maratona", context -> {

            ProblemaController.getProblemas(problemas, context);
            System.out.println("Http status code: " + context.status());
        });

        app.get("/maratona/:special", context -> {

            ProblemaController.getSpecialProblem(problemas, context);
            System.out.println("Http status code: " + context.status());
        });

        app.post("/maratona", context -> {

            Problema problema = ProblemaController.inserir(context);
            problemas.add(problema);
            System.out.println("Http status code: " + context.status());
        });
    }
}
