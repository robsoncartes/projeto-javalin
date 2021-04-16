package br.edu.fatecsjc.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ExecucaoPython {

    public String excutaPython(Problema problema) {
        // instancia LeituraArquivos

        // busca programa nos resources
        String programa = getResourcePath("/" + problema.getFilename());

        // inicia strings de entrada e saida
        String entrada;
        String saidaEsperada;

        // flag para validação dos casos de teste
        String valido = "SUCCESS";

        // construtor do processo que executará o comando
        ProcessBuilder processBuilder = new ProcessBuilder();

        // índice para busca de arquivos / inicia em 1
        int indice = 1;
        StringBuilder resultado = new StringBuilder();

        // enquanto hover arquivo (ie enquanto entrada nao retornar 'nulo'
        do {

            // define qual problema será executado e busca nos resources
            if (problema.getProblem().equalsIgnoreCase("A")) {
                entrada = getResourcePath("/a-problem/arqEntradaCasoTeste" + indice + ".txt");
                saidaEsperada = getResourcePath("/a-problem/arqSaidaEsperada" + indice + ".txt");
            } else {
                entrada = getResourcePath("/b-problem/arqEntradaCasoTeste" + indice + ".txt");
                saidaEsperada = getResourcePath("/b-problem/arqSaidaEsperada" + indice + ".txt");
            }

            if (entrada != null && saidaEsperada != null) {

                // tenta executar o comando
                try {

                    String command = "python3 " + programa + " < " + entrada;

                    // comando para MAC
                    // processBuilder.command("bash", "-c", command);

                    // comando para Windows deve ser esse:
                    processBuilder.command("cmd.exe", "\\c", command);
                    Process process = processBuilder.start();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                    String output;

                    while ((output = reader.readLine()) != null) {
                        resultado.append(output);
                    }

                    process.waitFor();

                    // teste de resultados e arquivo de saida esperada

                    if (!resultado.toString().equals(LeituraDeArquivos.leArquivo(saidaEsperada))) {
                        return "FAIL";
                    }

                    // reseta resultado
                    resultado = new StringBuilder();

                    // exceções obrigatórias
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

                indice += 1;
            }
        } while (entrada != null && saidaEsperada != null);

        return valido;
    }

    private String getResourcePath(String relativePath) {

        // tenta acessar o caminho indicado para o arquivo conforme índice

        try {
            return Objects.requireNonNull(ExecucaoPython.class.getResource(relativePath)).getPath();
            // senão achar, retorna nulo
        } catch (Exception arquivoNaoEncontrado) {
            return null;
        }
    }
}