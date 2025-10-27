package InfosPessoais;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome + ", Matrícula: " + matricula);
    }
}
