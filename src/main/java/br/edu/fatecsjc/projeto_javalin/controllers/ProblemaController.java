package br.edu.fatecsjc.projeto_javalin.controllers;

import br.edu.fatecsjc.projeto_javalin.models.Problema;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// final class para garantir que a mesma não pode ser herdada
public final class ProblemaController {

    private static Problema problema1 = new Problema("Arquivo1", "Problema 1", "Cod 1");
    private static Problema problema2 = new Problema("Arquivo2", "Problema 2", "Cod 2");
    private static Problema problema3 = new Problema("Arquivo3", "Problema 3", "Cod 3");

    private static List<Problema> problemas = new ArrayList<>(Arrays.asList(problema1, problema2, problema3));

    // construtor private para garantir que a classe não pode ser inicializada.
    private ProblemaController() {
    }

    // mostra um lista de objetos do tipo Problema convertidos para json
    public static void getProblemas(Context context) {
        context.json(problemas);
        // context.result(problemas.toString());
    }

    // Observações: os comentários serão posteriormente removidos.
    // o método json de context só é possível graças a dependência da biblioteca Jackson. Abrao  arquivo pom.xml e
    // experimente remover a dependência do Jackon (linhas 116 à 120). O Javalin irá retornar um erro expecífico.
    // Apenas por curiosidade: altere a chamada de context para context.result, comentando // context.json e
    // descomentando context.result(problemas.toString()) e rode o programa novamente.

    // Não esqueça de utilizar o POSTMAN.
}
