package br.edu.fatecsjc.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProblemaTest {

    private Problema problema;

    // o método setup instancia um ou mais objetos para o qual deseja-se testar (Problema). Isso facilita, quando a classe a ser
    // testada tem muitos métodos de test. Geralmente há necessidade de instanciar esse objeto dentro do corpo do método.
    // Felizmente, com o setup, você faz isso uma vez só, e assim, setar os atributos da classe instanciada no setup.
    //
    // Geralmente testes não possuem mais de um assertion.
    // Em resumo: antes de executar test1, test2, teste n... setup instancia um objeto que poderá ser utilizado em todos
    // métodos de testes quais forem necessário o objeto em si.

    @BeforeEach
    void setup() {

        problema = new Problema();
    }

    @Test
        // todos testes no Junit devem ser marcados com a anotação @Test
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
