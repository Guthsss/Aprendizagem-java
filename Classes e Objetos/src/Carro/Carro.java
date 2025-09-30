package Carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    private Boolean ligado;
    public Carro(String marca, String modelo, int ano, double velocidade, Boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }
    public void Ligado() {
        this.ligado = true;
    }
    public void dessligado() {
        this.ligado = false;
        this.velocidade = 0.0;
    }
    public void acelerar(int valor) {
        if (this.ligado == true) {
            this.velocidade += valor;
        } else {
            System.out.println("Ligue o motor");
        }
    }
    public void frear(int valor) {
        if (velocidade < valor) {
            this.velocidade = 0.0;
        } else {
            this.velocidade = velocidade - valor;
        }
    }
    public void exibirInfo() {
        System.out.printf("Marca: %s\nModelo: %s\nAno: %d\nVelocidade: %.2f\nLigado: %b");
    }
}
