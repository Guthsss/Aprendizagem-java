package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private Profissao profissao;

    public Pessoa(String nome, int idade, Profissao profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", profissao=" + profissao + '}';
    }
}
