package br.edu.fatecsjc.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ExecucaoPython {
    //receber problema, path
    //criar entidade resultado

    public String excutaPython(Problema problema) throws IOException {

        String path = "";

        if (problema.getProblem() == "A"){
            path = "./resorces/a-problem/";
        } else if (problema.getProblem() == "B"){
            path = "./resorces//b-problem/";
        } else {
            //
        }

        int indice = 1;
        boolean tem_arquivo = true;

        while(tem_arquivo){
            try{
                String entrada = "arqEntradaCasoTeste" + indice + ".txt";
                /*String saida = "arqSaidaCasoTeste" + indice + "_.txt";*/
                String command = "python " + path + "problema.py < " + entrada;
                Process p = Runtime.getRuntime().exec(command);

                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

                indice +=1;

                String resultado = in.readLine();

                return resultado;

            } catch (IOException io) {
                io.printStackTrace();
                tem_arquivo = false;
                return "ERRO";
            }
        }
        return "ERRO";
    }
}
