package Jogo;

public enum Dificuldade {
    FACIL("facil"), NORMAL("normal"), DIFICIL("dificil"), INSANO("insano");

    private String dificuldade;

    Dificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
    public String getDificuldade() {
        return dificuldade;
    }
}
