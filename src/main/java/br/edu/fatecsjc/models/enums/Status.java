package br.edu.fatecsjc.models.enums;

public enum Status {

    SUCCESS(1, "Success"),
    FAIL(2, "Fail");

    private int codigo;
    private String descricao;

    Status(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Status toEnum(Integer codigo) {

        for (Status stats : Status.values()) {
            if (codigo.equals(stats.codigo))
                return stats;
        }

        throw new IllegalArgumentException("Status inválido. Código: " + codigo);
    }
}
