package br.edu.fatecsjc.models;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ExecucaoPythonTest {
    private ExecucaoPython cut;

    @Test
    public void testaResultado() throws Exception {
        cut = new ExecucaoPython();
        Problema problema = new Problema();
        problema.setProblem("B");
        Assertions.assertEquals(true, cut.excutaPython(problema));
    }
}
