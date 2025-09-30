package Aluno;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void atualizarNota(double nota) {
        this.nota += nota;
    }

    public void verificarAprovacao() {
        if (this.nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
    }
}