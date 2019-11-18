package br.edu.fatecsjc.projeto_javalin.models;

import java.util.Objects;

public class Problema {

    private String filename;
    private String problem;
    private String sourcecode;

    public Problema(String filename, String problem, String sourcecode) {
        this.filename = filename;
        this.problem = problem;
        this.sourcecode = sourcecode;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Problema)) return false;
        Problema problema = (Problema) o;
        return filename.equals(problema.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename);
    }
}
