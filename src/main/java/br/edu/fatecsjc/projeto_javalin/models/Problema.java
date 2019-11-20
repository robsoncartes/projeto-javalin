package br.edu.fatecsjc.projeto_javalin.models;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode
@ToString
public class Problema {

    @Getter
    @Setter
    private String filename;

    @Getter
    @Setter
    private String problem;

    @Getter
    @Setter
    private String sourcecode;

}
