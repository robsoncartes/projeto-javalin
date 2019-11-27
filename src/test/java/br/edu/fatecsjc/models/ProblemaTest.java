package br.edu.fatecsjc.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProblemaTest {

    private Problema problema;

    @BeforeEach
    void setup() {

        problema = new Problema();
    }

    @Test
    void isSameObjectTest() {

        problema.setId(1);
        assertSame(problema.getId(), 1);
    }

    @Test
    void groupedProblemAssertionsTest() {
        problema.setId(1);
        problema.setFilename("Filename1");
        problema.setProblem("Problema1");
        problema.setSourcecode("Source1");
        assertAll("problema",
                () -> assertEquals(1, problema.getId()),
                () -> assertEquals("Filename1", problema.getFilename()),
                () -> assertEquals("Problema1", problema.getProblem()),
                () -> assertEquals("Source1", problema.getSourcecode())
        );
    }
}
