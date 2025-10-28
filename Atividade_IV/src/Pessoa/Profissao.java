package Pessoa;

public enum Profissao {
    MEDICO("medico"), PROFESSOR("professor"), ENGENHEIRO("engenheiro"), ARTISTA("artista");

    private String profissao;

    Profissao(String profissao) {
        this.profissao = profissao;
    }
    public String getProfissao() {
        return profissao;
    }
}
