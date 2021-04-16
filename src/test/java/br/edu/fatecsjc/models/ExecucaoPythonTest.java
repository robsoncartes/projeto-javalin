package br.edu.fatecsjc.models;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExecucaoPythonTest {

    @Test
    public void testaResultadoA() throws Exception {
        ExecucaoPython cut = new ExecucaoPython();
        Problema problema = new Problema();
        problema.setProblem("A");
        problema.setFilename("lololo.py");
        problema.setSourcecode("ZGVmIGdldF92ZW5jZWRvcihpbmRleCk6CiAgICBpZiBpbmRleCA9PSAwOgogICAgICAgIHJldHVybiAiQSIKICAgIGVsaWYgaW5kZXggPT0gMToKICAgICAgICByZXR1cm4gIkIiCiAgICBlbGlmIGluZGV4ID09IDI6CiAgICAgICAgcmV0dXJuICJDIgoKbnVtZXJvc190ZXh0byA9IGlucHV0KCkKCm51bWVyb3MgPSBudW1lcm9zX3RleHRvLnNwbGl0KCIgIikKCm5fMCA9IG51bWVyb3MuY291bnQoIjAiKQpuXzEgPSBudW1lcm9zLmNvdW50KCIxIikKCmlmIG5fMCA9PSAxOgogICAgcHJpbnQgKGdldF92ZW5jZWRvcihudW1lcm9zLmluZGV4KCIwIikpKQplbGlmIG5fMSA9PSAxOgogICAgcHJpbnQgKGdldF92ZW5jZWRvcihudW1lcm9zLmluZGV4KCIxIikpKQplbHNlOgogICAgcHJpbnQgKCIqIik=");

        System.out.println(problema.getSourcecode());
        Assertions.assertEquals("SUCCESS", cut.excutaPython(problema));
    }
}
