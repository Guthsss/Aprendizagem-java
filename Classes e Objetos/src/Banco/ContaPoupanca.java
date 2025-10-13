package Banco;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public void rendimento() {
        setSaldo( getSaldo() + (getSaldo() * taxaRendimento/100.0));
    }
    public void exibirSaldo() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa de rendimento: " + this.taxaRendimento);
    }
}
