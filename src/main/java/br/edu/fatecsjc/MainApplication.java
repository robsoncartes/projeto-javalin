package br.edu.fatecsjc;

import br.edu.fatecsjc.controllers.ProblemaController;
import io.javalin.Javalin;

public class MainApplication {

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7001);

        // app.get("/problemas", ProblemaController::getProblemas);
        app.get("/problemas", context -> ProblemaController.getProblemas(context));
        // Lembre-se de acessar a end-point (rota) pela url "http://localhost:7001/problemas". É a única que temos no
        // momento pelo navegador ou preferencialmente pelo POSTMAN. É só um teste. Depois deveremos ter '/maratona' conforme
        // o enunciado do problema.
        // Observação: caso algum serviço ou programa já esteja utilizando a parta 7001, você deverá receber um erro
        // dizendo que a porta já está sendo utilizada por outra aplicação. Portanto, basta alterar por uma porta que
        // que não esteja em uso. Exemplo: Javalin.create().start(7002);

        app.get("/problemas/:special", ProblemaController::getSpecialProblem);
        app.post("/problemas", context -> ProblemaController.inserir(context));

    }
}
