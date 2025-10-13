package Escola;

public class Aluno extends Pessoa{
    private String curso;
    public Aluno(String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }
    public void estudar() {
        System.out.println("Estou estudando!");
    }
    public String getCurso() {
        return curso;
    }
    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + getNome() + " Sou aluno do curso " + this.curso);
    }
}
