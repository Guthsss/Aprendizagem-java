package Banco;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void exibirInfo() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
