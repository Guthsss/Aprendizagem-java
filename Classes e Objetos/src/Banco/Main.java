package Banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Gregory", 1000);
        ContaBancaria conta2 = new ContaBancaria("Guilherme", 2000);

        conta1.depositar(1000);
        conta1.exibirInfo();

        conta2.depositar(2000);
        conta2.exibirInfo();

        conta1.sacar(100);
        conta1.exibirInfo();
    }
}
