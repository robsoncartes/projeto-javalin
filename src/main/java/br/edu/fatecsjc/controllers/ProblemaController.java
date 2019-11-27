package br.edu.fatecsjc.controllers;

import br.edu.fatecsjc.services.ProblemaService;
import io.javalin.Javalin;

public final class ProblemaController {

    private ProblemaService problemaService;

    public ProblemaController(Javalin javalin) {
        problemaService = new ProblemaService();
        getProblemas(javalin);
    }

    public void getProblemas(Javalin javalin) {

        javalin.get("/maratona", context -> {

            context.json(problemaService);
            System.out.println("Http status code: " + context.status());

        });

    }

    public void getProblemasById(Javalin javalin) {
        javalin.get("/maratona/:id", context -> {

            System.out.println("Http status code: " + context.status());
        });

    }

    public void postProblema(Javalin javalin) {

        javalin.post("/maratona", context -> {

            System.out.println("Http status code: " + context.status());
        });
    }
}