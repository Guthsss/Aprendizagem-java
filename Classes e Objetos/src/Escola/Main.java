package Escola;

public class Main {
    public static void main(String[] args) {
        Professor objProfessor = new Professor("Élio", 39, 10000.0);
        Aluno objAluno = new Aluno("Gregory", 19);
        Pessoa objetoPessoa = new Pessoa("Pedro", 18);

        objetoPessoa.apresentar();
        objAluno.apresentar();
        objProfessor.apresentar();
    }
}
