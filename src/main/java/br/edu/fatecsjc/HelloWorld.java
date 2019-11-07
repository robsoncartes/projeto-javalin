package br.edu.fatecsjc;

import io.javalin.Javalin;

public class HelloWorld {

    private static String helloWord = "Hello World!";

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7000);
        app.get("/hello", ctx -> ctx.result(helloWord));
    }
}
