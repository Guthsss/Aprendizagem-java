package Funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cargo, double salario, boolean ativo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }
    public void promover (String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }
    public void demitir () {
        if (ativo) {
            this.ativo = false;
        } else {
            System.out.println("O funcionário não é ativo");
        }
    }
    public void reajustarSalario (double percentual) {
        this.salario += this.salario * (percentual/100);
    }
    public void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);
    }
}
