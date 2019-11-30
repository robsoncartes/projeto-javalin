package br.edu.fatecsjc;

import br.edu.fatecsjc.controllers.ProblemaController;
import io.javalin.Javalin;

public class MainApplication {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7001);

        new ProblemaController(app);
    }
}
