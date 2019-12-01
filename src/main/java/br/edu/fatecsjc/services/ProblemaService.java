package br.edu.fatecsjc.services;

import br.edu.fatecsjc.controllers.ProblemaController;
import br.edu.fatecsjc.models.ExecucaoPython;
import br.edu.fatecsjc.models.*;
import br.edu.fatecsjc.utils.DecodeBase64;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.javalin.http.Context;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProblemaService implements Serializable {
    private static Integer serialversionuid = 1;

    private List<Problema> problemas = new ArrayList<>();
    private List<Resultado> resultados = new ArrayList<>();

    DecodeBase64 decodeBase64 = new DecodeBase64();
    EscritaArquivo escritaArquivo = new EscritaArquivo();
    ExecucaoPython execucaoPython = new ExecucaoPython();

    public ProblemaService() {
    }

    public List<Problema> getProblemas() {
        return problemas;
    }
    public List<Resultado> getResultados() {return resultados; };

    public Resultado rodaMaratona(Problema problema) throws Exception {

        Resultado resultado = new Resultado();

        problemas.add(problema);

        escritaArquivo.gravar(decodeBase64.decode(problema.getSourcecode()), problema.getFilename());

        resultado.setId(problema.getId());
        resultado.setFilename(problema.getFilename());
        resultado.setProblem(problema.getProblem());
        resultado.setStatus(execucaoPython.excutaPython(problema));

        resultados.add(resultado);

        return resultado;

    }
}