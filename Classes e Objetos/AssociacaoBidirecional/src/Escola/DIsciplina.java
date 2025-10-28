package Escola;

import java.util.ArrayList;

public class DIsciplina {
    private String nome;
    private double cargaHoraria;
    private Professor professor;

    public DIsciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void exibirEmenta() {
        System.out.println("Ementa do Disciplina");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horaria: " + cargaHoraria);
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getCargaHoraria() {return cargaHoraria;}

    public String getNome() {return nome;}
}
