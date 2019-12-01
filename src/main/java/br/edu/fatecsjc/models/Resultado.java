package br.edu.fatecsjc.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Resultado {

    private int id;
    private String filename;
    private String problem;
    private String status;
    private Date data;

    public Resultado() {
    }

    public Resultado(int id, String filename, String problem, String status, Date data) {
        setId(id);
        setFilename(filename);
        setProblem(problem);
        setStatus(status);
        setData(data);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

//    public String getFormattedData() {
//        String strDateFormat = "dd/MM/yyyy hh:mm:ss";
//        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//        return dateFormat.format(this.data);
//    }

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
