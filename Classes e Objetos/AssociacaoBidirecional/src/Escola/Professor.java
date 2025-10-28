package Escola;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String titulacao;
    private ArrayList<DIsciplina> disciplinas = new ArrayList<>();



    public Professor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }
    public void atribuirDisciplina(DIsciplina disciplina){
        disciplinas.add(disciplina);
    }
    public int calcularCargaHoraria() {
        int total = 0;
        for (DIsciplina disciplina : disciplinas) {
            total += disciplina.getCargaHoraria();
        }
        return total;
    }
    public void exiirPerfil() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulo: " + titulacao);
        System.out.println("Carga Horaria: " + calcularCargaHoraria());

        System.out.println("Disciplinas: ");
        for  (DIsciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
}

