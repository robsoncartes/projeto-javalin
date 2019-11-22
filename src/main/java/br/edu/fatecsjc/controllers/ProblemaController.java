package br.edu.fatecsjc.controllers;

import br.edu.fatecsjc.models.Problema;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// final class para garantir que a mesma não pode ser herdada
public final class ProblemaController {

    private static Problema problema1 = new Problema(1, "Arquivo1", "Problema 1", "Cod 1");
    private static Problema problema2 = new Problema(2, "Arquivo2", "Problema 2", "Cod 2");

    private static List<Problema> problemas = new ArrayList<>(Arrays.asList(problema1, problema2));

    // construtor private para garantir que a classe não pode ser inicializada.
    private ProblemaController() {
    }

    // mostra um lista de objetos do tipo Problema convertidos para json
    public static void getProblemas(Context context) {
        context.json(problemas);
        // context.result(problemas.toString());
    }

    // Observações: os comentários serão posteriormente removidos.
    // o método (função) json de context só é possível graças a dependência da biblioteca Jackson adicionada ao arquivo
    // 'pom.xml'. Abrao  arquivo pom.xml e experimente remover a dependência do Jackon (linhas 116 à 120). O Javalin
    // irá retornar um erro expecífico. Apenas por curiosidade: altere a chamada de context para context.result,
    // comentando // context.json e descomentando context.result(problemas.toString()) e rode o programa novamente.
    // Não esqueça de utilizar o POSTMAN.

    public static void getSpecialProblem(Context context) {

        for (Problema problema : problemas) {
            String fileName = problema.getFilename();
            if (fileName.contains(context.pathParam("special"))) {
                context.json(problema);
                return;
            }
        }

        context.status(404).result("Arquivo não encontrado.");

    }

    public static Context inserir(Context context) {

        String problema = context.body();
        System.out.println(problema);

        return context;
    }
}
