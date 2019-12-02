package br.edu.fatecsjc.services;

import br.edu.fatecsjc.models.ExecucaoPython;
import br.edu.fatecsjc.models.*;
import br.edu.fatecsjc.utils.DecodeBase64;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProblemaService implements Serializable {

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

        String sourcecode = decodeBase64.decode(problema.getSourcecode());

        escritaArquivo.gravar(sourcecode, problema.getFilename());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        resultado.setId(getResultados().size()+1);
        resultado.setFilename(problema.getFilename());
        resultado.setProblem(problema.getProblem());
        resultado.setSourcecode(sourcecode);
        resultado.setStatus(execucaoPython.excutaPython(problema));
        resultado.setData(dtf.format(now));

        resultados.add(resultado);

        return resultado;
    }

    public Resultado buscarId(String id){
        for(Resultado resultado:resultados){
            if(resultado.getId()== Integer.parseInt(id)) return resultado;
        }

        return null;
    }

    public List<Resultado> buscarStatus(String status) {

        List<Resultado> resultadosEncontrados = new ArrayList<>();

        for(Resultado resultado:resultados){
            if(resultado.getStatus().equals(status.toUpperCase())) resultadosEncontrados.add(resultado);
        }

        return resultadosEncontrados;
    }

    public List<Resultado> buscarData(String data) {

        List<Resultado> resultadosEncontrados = new ArrayList<>();

        for(Resultado resultado:resultados){
            if(resultado.getData().contains(data)) resultadosEncontrados.add(resultado);
        }

        return resultadosEncontrados;
    }
}