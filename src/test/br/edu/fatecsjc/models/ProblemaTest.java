package br.edu.fatecsjc.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProblemaTest {

    private Problema problema;

    // o método setup instancia um objeto que ser quer testar (Problema). Isso facilita,
    // quando a classe que se quer testar tem muitos métodos de test em que cada um deles é
    // necessário instanciar um objeto do mesmo tipo.
    // Em resumo: antes de executar test1, test2, teste n... instancie um objeto.

    @BeforeEach
    void setup() {

        problema = new Problema();
    }

    @Test // todos testes no Junit devem ser marcados com a anotação @Test
    void isSameObjectTest() {

        problema.setId(1);
        assertSame(problema.getId(), 1);
    }

    // Por convenção o nome do teste deve ser descritivo seguido de Test.
    // Exemplo: somarDoisNumerosInteirosTest

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
