package br.edu.fatecsjc.controllers;

import br.edu.fatecsjc.models.Problema;
import br.edu.fatecsjc.models.Resultado;
import br.edu.fatecsjc.services.ProblemaService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.javalin.Javalin;
import io.javalin.http.*;
import java.util.List;

public final class ProblemaController {

    private ProblemaService problemaService;

    public ProblemaController(Javalin javalin) {
        problemaService = new ProblemaService();
        getProblemas(javalin);
        postProblema(javalin);
        getResultados(javalin);
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

//            Resultado resultado = new Resultado();

            System.out.println(problema.toString()); // remover depois
            Resultado resultado = problemaService.rodaMaratona(problema);
            System.out.println("Http status code: " + context.status());

            context.json(resultado);

            for (Resultado r : problemaService.getResultados()){
                System.out.println(r.toString());
            }
        });
    }

    public void getResultados(Javalin javalin) {

        javalin.get("/resultados", context -> {

            List<Resultado> resultados = problemaService.getResultados();
            context.json(resultados);

            System.out.println("Http status code: " + context.status());

        });
    }

}