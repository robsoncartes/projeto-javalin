package br.edu.fatecsjc.models;

import java.util.Objects;

public class Problema {

    private String filename;
    private String problem;
    private String sourcecode;

    public Problema() {
    }

//    public Problema(String filename, String problem) {
//        this.filename = filename;
//        this.problem = problem;
//    }
//
//    public Problema(String filename, String problem, String sourcecode) {
//        this.filename = filename;
//        this.problem = problem;
//        this.sourcecode = sourcecode;
//    }

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
    public String toString() {
        return "Filename: " + filename + "\tProblem: " + problem + "\tSourcecode: " + sourcecode;
    }
}
