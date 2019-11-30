package br.edu.fatecsjc.services;

import br.edu.fatecsjc.models.Problema;

import java.util.ArrayList;
import java.util.List;

public class ProblemaService {

    List<Problema> problemas = new ArrayList<>();

    public ProblemaService() {
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void adicionar(Problema problema) {

        problemas.add(problema);
    }
}