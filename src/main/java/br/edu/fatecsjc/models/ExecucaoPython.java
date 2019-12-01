package br.edu.fatecsjc.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExecucaoPython {

    //    public String excutaPython(Problema problema) throws IOException {
    public String excutaPython(Problema problema) throws Exception {
        //instancia LeituraArquivos

        //busca programa nos resources
        String programa = getResourcePath("/" + problema.getFilename());
        System.out.println(programa);

        //inicia strings de entrada e saida
        String entrada = "";
        String saidaEsperada = "";

        //flag para validacao dos casos de teste
        String valido = "SUCCESS";

        //construtor do processo que executará o comando
        ProcessBuilder processBuilder = new ProcessBuilder();

        //indice para busca de arquivos / inicia em 1
        int indice = 2;

        String resultado = "";

        String error = "";

        //enquanto hover arquivo (ie enquanto entrada nao retornar 'nulo'
        do {

            //define qual problema será executado e busca nos resources
            if (problema.getProblem().toUpperCase().equals("A")){
                entrada = getResourcePath("/a-problem/arqEntradaCasoTeste" + indice + ".txt");
                saidaEsperada = getResourcePath("/a-problem/arqSaidaEsperada" + indice + ".txt");
            } else {
                entrada = getResourcePath("/b-problem/arqEntradaCasoTeste" + indice + ".txt");
                saidaEsperada = getResourcePath("/b-problem/arqSaidaEsperada" + indice + ".txt");
            }

            if (entrada != null && saidaEsperada != null){

                //tenta executar o comando
                try {

                    String command = "python3 " + programa + " < " + entrada;

                    //comando para MAC
                    processBuilder.command("bash", "-c", command);

                    //comando para Windows deve ser esse:
                    //processBuilder.command("cmd.exe", "\c", command);
                    Process process = processBuilder.start();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                    String output;

                    while ((output = reader.readLine()) != null) {
                        resultado += output;
                    }

                    int exitCode = process.waitFor();
    //                teste de resultados e arquivo de saida esperada
    //                System.out.println(resultado);
    //                System.out.println(LeituraDeArquivos.leArquivo(saidaEsperada));

                    if (!resultado.equals(LeituraDeArquivos.leArquivo(saidaEsperada))) {
                        return "FAIL";
                    }

                    //reseta resultado
                    resultado = "";

                    //excecoes obrigatorias
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                indice +=1;
            }
        } while(entrada != null && saidaEsperada !=null);

        return valido;
   }

    private String getResourcePath(String relativePath) throws Exception {
        //tenta acessar o caminho indicado para o arquivo conforme indice
        try{
            String path = ExecucaoPython.class.getResource(relativePath).getPath();
            return path;
        //senao achar, retorna nulo
        } catch (Exception arquivoNaoEncontrado){
            return null;
        }
    }
}