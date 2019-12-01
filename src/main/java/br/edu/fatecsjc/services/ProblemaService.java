package br.edu.fatecsjc.services;

import br.edu.fatecsjc.models.ExecucaoPython;
import br.edu.fatecsjc.models.*;
import br.edu.fatecsjc.utils.DecodeBase64;
import io.javalin.http.Context;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProblemaService implements Serializable {
    private static Integer serialversionuid = 1;

    private List<Problema> problemas = new ArrayList<>();

    DecodeBase64 decodeBase64 = new DecodeBase64();
    EscritaArquivo escritaArquivo = new EscritaArquivo();
    ExecucaoPython execucaoPython = new ExecucaoPython();

    public ProblemaService() {
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void rodaMaratona(Problema problema) throws Exception {

        problemas.add(problema);

        escritaArquivo.gravar(decodeBase64.decode(problema.getSourcecode()), problema.getFilename());

        boolean validacaoSourcecode = execucaoPython.excutaPython(problema);

        System.out.println(validacaoSourcecode);

    }

    /*

    public String getDecodeBase64(Problema problema) {

        return DecodeBase64.decode(problema.getSourcecode());
    }

    public void setDecodeBase64(DecodeBase64 decodeBase64) {
        this.decodeBase64 = decodeBase64;
    }

    /*
    public void comparaResultado(Problema problema, Context context) throws Exception {



        ExecucaoPython execucaoPython = new ExecucaoPython();

        for (Problema p : problemas) {
            execucaoPython.excutaPython(problema);

            if (problema.getId().equals(Integer.valueOf(context.pathParam("id")))) {
                problema.setStatus(Status.toEnum(1));
                System.out.println("Vero");
            } else {
                problema.setStatus(Status.toEnum(2));
                System.out.println("falso");
            }

        }a
    }
     */
}