package br.edu.fatecsjc.services;

import br.edu.fatecsjc.models.ExecucaoPython;
import br.edu.fatecsjc.models.Problema;
import br.edu.fatecsjc.models.enums.Status;
import io.javalin.http.Context;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProblemaService {

    private List<Problema> problemas = new ArrayList<>();

    public ProblemaService() {
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void adicionar(Problema problema) {

        problemas.add(problema);
    }


    public void comparaResultado(List<Problema> problemas, Integer indice, Context context) throws IOException {

        ExecucaoPython execucaoPython = new ExecucaoPython();


        for (Problema problema : problemas) {
            execucaoPython.excutaPython(indice);

            if (problema.getId().equals(Integer.valueOf(context.pathParam("id")))) {
                problema.setStatus(Status.toEnum(1));
                System.out.println("Vero");
            } else{
                problema.setStatus(Status.toEnum(2));
                System.out.println("falso");
            }

        }
    }
}