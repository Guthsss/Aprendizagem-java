package Aluno;

public class Principal {
    static void main(String[] args) {
        Aluno p1 = new Aluno("Gregory");
        Aluno p2 = new Aluno("Guilherme");

        p1.atualizarNota(7);
        p1.exibirInfo();
        p1.verificarAprovacao();

        p2.atualizarNota(5);
        p2.exibirInfo();
        p2.verificarAprovacao();
    }
}
