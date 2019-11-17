package br.edu.fatecsjc.projeto_javalin;

import io.javalin.Javalin;

public class MainApplication {

    private static String helloWorld = "Hello World";

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7001);
        app.get("/hello", ctx -> ctx.result(helloWorld));
    }
}
