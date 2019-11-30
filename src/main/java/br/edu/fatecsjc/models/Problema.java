package br.edu.fatecsjc.models;

import java.util.Objects;

public class Problema {

    private Integer id;
    private String filename;
    private String problem;
    private String sourcecode;

    public Problema() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return id.equals(problema.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Id: " + id + "\tFilename: " + filename + "\tProblem: " + problem + "\tSourcecode: " + sourcecode;
    }
}