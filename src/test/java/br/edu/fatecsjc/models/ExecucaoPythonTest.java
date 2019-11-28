package br.edu.fatecsjc.models;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ExecucaoPythonTest {
    private ExecucaoPython cut;

    @Test
    public void testaResultado() throws IOException {
        cut = new ExecucaoPython();
//ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
        Problema problema = new Problema();
        problema.setProblem("A");
        Assertions.assertEquals("ABC", cut.excutaPython(problema));
    }
}
