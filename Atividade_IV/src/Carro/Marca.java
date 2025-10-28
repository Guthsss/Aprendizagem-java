package Carro;

public enum Marca {
    TOYOTA("toyota"), HONDA("honda"), FORD("ford"), FIAT("fiat");

    private String marca;

    Marca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
}
