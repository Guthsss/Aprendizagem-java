package Conta;

public class Conta {
    private String numero;
    private double saldo;
    public Conta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }
    public Conta(String numero) {
        this.numero = numero;
    }
    public void debitar(double valor) {
        this.saldo -= valor;
    }
    public void creditar(double valor) {
        this.saldo += valor;
    }
    public void transferir(Conta conta, double valor) {
        if  (this.saldo >= valor) {
            this.saldo -= valor;
            conta.saldo += valor;
            System.out.println("Seu saldo é de " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void consultar() {
        System.out.println("Seu saldo é de " + this.saldo);
    }
}
class Principal {
    public static void main(String[] args) {
        Conta obj = new Conta("1");
        Conta obj2 = new Conta("2");



        obj.creditar(10000);
        obj.consultar();

        obj.transferir(obj2, 1000);

        obj2.consultar();

        obj.consultar();
    }
}

