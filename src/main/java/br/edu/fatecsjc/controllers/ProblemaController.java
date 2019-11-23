package br.edu.fatecsjc.controllers;

import br.edu.fatecsjc.models.Problema;
import com.google.gson.Gson;
import io.javalin.http.Context;

import java.util.List;

// final class para garantir que a mesma não pode ser herdada
public final class ProblemaController {

    private static List<Problema> problemas;

    // construtor private para garantir que a classe não pode ser inicializada.
    private ProblemaController() {
    }

    private ProblemaController(List<Problema> problemas) {
        ProblemaController.problemas = problemas;
    }

    // mostra um lista de objetos do tipo Problema convertidos para json
    public static void getProblemas(List<Problema> problemas, Context context) {
        context.json(problemas);
    }

    public static void getSpecialProblem(List<Problema> problemas, Context context) {

        for (Problema problema : problemas) {
            String fileName = problema.getFilename();
            if (fileName.contains(context.pathParam("special"))) {
                context.json(problema);
                return;
            }
        }

        context.status(404).result("Arquivo não encontrado.");

    }

    public static Problema inserir(Context context) {

        Gson gson = new Gson();

        return gson.fromJson(context.body(), Problema.class);
    }
}
