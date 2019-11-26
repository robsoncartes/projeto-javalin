package br.edu.fatecsjc;

import br.edu.fatecsjc.controllers.ProblemaController;
import br.edu.fatecsjc.models.Problema;
import br.edu.fatecsjc.utils.DecodeBase64;
import io.javalin.Javalin;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApplication {

    public static <bytes> void main(String[] args) {

        //ExecucaoPython execucaoPython = new ExecucaoPython("a", "b");
        //ExecucaoPython execucaoPython1 = new ExecucaoPython();
        // ExecucaoPython execucaoPython2 = new ExecucaoPython();

        /*
        execucaoPython1.setEntrada_teste(problema1.getSourcecode());
        execucaoPython2.setEntrada_teste(problema2.getSourcecode());
        problema1.setSourcecode(execucaoPython1.getEntrada_teste());
        problema2.setSourcecode(execucaoPython2.getEntrada_teste());
         */

        DecodeBase64 decodeBase64 = new DecodeBase64();

        Problema problema1 = new Problema(1, "zerinho.txt", "A", "BABACA");
        Problema problema2 = new Problema(2, "mergulho.txt", "B", "ABCDEF");

        List<Problema> problemas = new ArrayList<>(Arrays.asList(problema1, problema2));

        BufferedWriter bfw = null;

        try {

            for (Problema problema : problemas) {
                String path = "arquivos_py/";
                decodeBase64.setByteArray(problema.getSourcecode());
                File file = new File(path + problema.getFilename());
                byte[] bytes = decodeBase64.getByteArray();
                String stringDecoded = new String(bytes);
                problema.setSourcecode(stringDecoded);

                if (!file.exists())
                    file.createNewFile();

                Writer writer = new FileWriter(file);
                bfw = new BufferedWriter(writer);
                bfw.write(Arrays.toString(bytes));

                bfw.close();

            }

            Javalin app = Javalin.create().start(7001);

            app.get("/maratona", context -> {

                ProblemaController.getProblemas(problemas, context);
                System.out.println("Http status code: " + context.status());
            });

            app.get("/maratona/:special", context -> {

                ProblemaController.getSpecialProblem(problemas, context);
                System.out.println("Http status code: " + context.status());
            });

            app.post("/maratona", context -> {

                Problema problema = ProblemaController.inserir(context);
                problemas.add(problema);
                System.out.println("Http status code: " + context.status());
            });

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                if (bfw != null)
                    bfw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
