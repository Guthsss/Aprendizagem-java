package Aluno;

public enum Periodo {
    MATUTINO("matutino"), VESPERTINO("vespertino"), NOTURNO("noturno"), INTEGRAL("integral");

    private String periodo;

    Periodo(String periodo) {
        this.periodo = periodo;
    }
    public String getPeriodo() {
        return periodo;
    }
}
