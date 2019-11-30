package br.edu.fatecsjc.controllers;

import br.edu.fatecsjc.models.ExecucaoPython;
import br.edu.fatecsjc.models.Problema;
import br.edu.fatecsjc.services.ProblemaService;
import com.google.gson.Gson;
import io.javalin.Javalin;
import io.javalin.http.Context;

import java.util.List;

public final class ProblemaController {

    private ProblemaService problemaService;

    public ProblemaController(Javalin javalin) {
        problemaService = new ProblemaService();
        getProblemas(javalin);
        postProblema(javalin);
        //getProblemasById(javalin);
        comparar(javalin);
    }

    public void getProblemas(Javalin javalin) {

        javalin.get("/maratona", context -> {

            List<Problema> problemas = problemaService.getProblemas();
            context.json(problemas);

            System.out.println("Http status code: " + context.status());

        });
    }

    public void postProblema(Javalin javalin) {

        javalin.post("/maratona", context -> {

            Gson gson = new Gson();
            Problema problema = gson.fromJson(context.body(), Problema.class);

            System.out.println(problema.toString()); // remover depois
            problemaService.adicionar(problema);
            System.out.println("Http status code: " + context.status());
        });
    }

    /*
    public void getProblemasById(Javalin javalin) {
        javalin.get("/maratona/:id", context -> {

            System.out.println("Http status code: " + context.status());
        });
    }

     */


    public void comparar(Javalin javalin){

        javalin.get("/maratona/:id", context -> {

            List<Problema> problemas = problemaService.getProblemas();

            for (Problema problema : problemas){
                problemaService.comparaResultado(problemas, problema.getId(), context);
            }
        });
    }
}