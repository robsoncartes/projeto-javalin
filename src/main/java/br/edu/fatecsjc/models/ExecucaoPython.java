package br.edu.fatecsjc.models;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;


public class ExecucaoPython {
    //receber problema, path
    //criar entidade resultado

    public String excutaPython(Problema problema) throws IOException {

        String programa = getResourcePath("/programa.py");
        String entrada = "";

        int indice = 1;

        if (problema.getProblem().toUpperCase() == "A"){
            entrada = getResourcePath("/a-problem/arqEntradaCasoTeste" + indice + ".txt");
        } else {
            entrada = getResourcePath("/b-problem/arqEntradaCasoTeste" + indice + ".txt");
        }

//        boolean tem_arquivo = true;

//        while(tem_arquivo){
            try{
                String command = "python3 " + programa + " < " + entrada;
                Process p = Runtime.getRuntime().exec(command);

                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

                indice +=1;

                String resultado = reader.readLine();

                return resultado;

            } catch (IOException io) {
                io.printStackTrace();
//                tem_arquivo = false;
                return "ERRO";
            }
  //      }
  //      return "ERRO";
    }

    private String getResourcePath(String relativePath){
        String programa = ExecucaoPython.class.getResource(relativePath).getPath();
        return programa;
    }
}
