package br.edu.fatecsjc.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ExecucaoPython {

    private Process p;

    public Process getP() {
        return p;
    }

    public void setP(Process p) {
        this.p = p;
    }

    public ExecucaoPython() {
    }

    public void excutaPython(int indice) throws IOException {
        String entrada = "arqEntradaCasoTeste" + indice + ".txt";
        String saida = "arqSaidaCasoTeste" + indice + ".txt";
        String command = "cmd.exe c/ python.py < " + entrada + " > " + saida;
        Process p = Runtime.getRuntime().exec(command);

        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String resultado = in.readLine();
    }
}
