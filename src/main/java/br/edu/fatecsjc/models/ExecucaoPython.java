package br.edu.fatecsjc.models;

import java.io.IOException;

public class ExecucaoPython {

    private Process p;

    private String entrada_teste;

    private String saida_teste;

    public ExecucaoPython(String entrada_teste, String saida_teste) throws IOException {
        setEntrada_teste(entrada_teste);
        setSaida_teste(saida_teste);
        p = Runtime.getRuntime().exec(this.getCommand(this.entrada_teste, this.saida_teste));

    }

    public String getEntrada_teste() {
        return entrada_teste;
    }

    public void setEntrada_teste(String entrada_teste) {
        this.entrada_teste = entrada_teste;
    }

    public String getSaida_teste() {
        return saida_teste;
    }

    public void setSaida_teste(String saida_teste) {
        this.saida_teste = saida_teste;
    }

    public String getCommand(String entrada_teste, String saida_teste) {
        return "python < " + entrada_teste + "> " + saida_teste;
    }


//    private String run = "python < " + entrada_teste + "> " + saida_teste;

//    private System.out.println(String run);

}
