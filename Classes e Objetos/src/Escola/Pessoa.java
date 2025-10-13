package Escola;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }
    public void apresentar() {
        System.out.println("Meu nome é " + this.nome);
    }
    public String getNome() {
        return nome;
    }
}
