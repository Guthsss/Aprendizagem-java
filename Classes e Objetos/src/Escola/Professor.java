package Escola;

public class Professor extends Pessoa{
    private double salario;
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    public void ensinar() {
        System.out.println("Eu ensino!");
    }
    public double getSalario() {
        return salario;
    }
    @Override
    public void apresentar() {
        System.out.println("Meu nome é " + getNome() + "Sou professor");
    }
}
