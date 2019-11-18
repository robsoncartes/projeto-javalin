package br.edu.fatecsjc.projeto_javalin;

import br.edu.fatecsjc.projeto_javalin.controllers.ProblemaController;
import io.javalin.Javalin;

public class MainApplication {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7001);
        app.get("/problemas", ProblemaController::getProblemas);
    }
}
