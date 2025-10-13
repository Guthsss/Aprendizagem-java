package Empresa;

public class Progamador extends Funcionario{
    private String linguagem;
    private int horasExtras;
    private double valorHoraExtra;

    public Progamador(String nome, double salarioBase, String linguagem, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
    public double calcularSalario() {
        return super.calcularSalario() + (this.valorHoraExtra * this.horasExtras);
    }
    public void codificar () {
        System.out.println("Codificando com " + this.linguagem);
    }
    @Override
    public void trabalhar () {
        System.out.println("Programador está desenvolvendo novas funcionalidades");
    }
}
