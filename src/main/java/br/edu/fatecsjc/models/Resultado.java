package br.edu.fatecsjc.models;

public class Resultado {

    private int id;
    private String filename;
    private String problem;
    private String sourcecode;
    private String status;
    private String data;

    public Resultado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return "Resultado{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", problem='" + problem + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
