package br.edu.fatecsjc.projeto_javalin;

import java.io.IOException;

public class ExecucaoPython {

    private Process p;

    public ExecucaoPython() throws IOException {
        p = Runtime.getRuntime().exec("/c/Users/Aluno/AppData/Local/Programs/Python/Python37-32/python",
                new String[]{"/c/Users/Aluno/projeto-javalin/arquivos_py/hello.py"});

    }

/*    StringWriter writer = new StringWriter(); //ouput will be stored here

    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptContext context = new SimpleScriptContext();

    context.setWriter(writer); //configures output redirection
    ScriptEngine engine = manager.getEngineByName("python");
    engine.eval(new FileReader("projeto-javelin/arquivos_py/hello.py"), context);
    System.out.println(writer.toString());
    
    String cmd = "python/";
    String py = "file";
    String run = "python  " +cmd+ py + ".py";
    System.out.println(run);
    //Runtime.getRuntime().exec(run);

    Process p = Runtime.getRuntime().exec("python  file.py");
    */
}
