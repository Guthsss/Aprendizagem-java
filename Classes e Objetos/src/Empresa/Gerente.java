package Empresa;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    public double calcularSalario () {
        return super.calcularSalario() + this.bonus;
    }
    public void aprovarProjeto (String nome) {
        System.out.println("Projeto " + nome + " aprovado!");
    }
    @Override
    public void trabalhar () {
        System.out.println("Gerente está gerenciando a equipe.");
    }
}
