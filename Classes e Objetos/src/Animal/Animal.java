package Animal;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }
    public void alimentar (double quantidade) {
        this.peso += quantidade;
    }
    public void envelhecer () {
        this.idade += 1;
    }
    public void emitirSom () {
        System.out.println("O animal está imitando som");

    }
    public void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}