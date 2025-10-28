package Escola;

public class Main {
    public static void main(String[] args) {
        DIsciplina dIsciplina = new DIsciplina("Engenharia de Software", 12);
        Professor professor = new Professor("Élio", "Mestrado");

        dIsciplina.setProfessor(professor);
        professor.atribuirDisciplina(dIsciplina);

        professor.calcularCargaHoraria();
        professor.exiirPerfil();
    }
}
