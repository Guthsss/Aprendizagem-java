package Empresa;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        super();
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public double calcularSalario() {
        return this.salarioBase;
    }
    public void exibirDados() {
        System.out.println(this.nome + " - " + this.salarioBase);
    }
    public void trabalhar () {
        System.out.println("Funcionário está trabalhando");
    }
}
