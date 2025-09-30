package Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario pessoa1 = new Funcionario("Gregory", "Júnior", 1400.56, true);

        pessoa1.exibirInfo();
        pessoa1.promover("Sênior", 4000.0);
        pessoa1.reajustarSalario(30);
        pessoa1.exibirInfo();
    }
}
