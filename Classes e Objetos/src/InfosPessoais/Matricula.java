package InfosPessoais;

public class Matricula {
    private int numero;
    private Aluno aluno;
    private Curso curso;
    private boolean status;

    public Matricula(int numero, Aluno aluno, Curso curso, boolean status) {
        this.numero = numero;
        this.aluno = aluno;
        this.curso = curso;
        this.status = status;
    }

    public void gerarComprovante() {
        System.out.println("Comprovante: Matricula nº " + numero + ", aluno: " + aluno + ", curso: " + curso.descrever());
    }

    public void mudarStatus() {
        this.status = !this.status;
    }
}
