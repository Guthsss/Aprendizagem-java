package Banco;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    @Override
    public void sacar (double valor) {
        if (valor > getSaldo() + limiteChequeEspecial) {
            System.out.println("Saldo insuficiente");
        } else {
            super.sacar(valor);
        }
    }
    public void cobrarTarifaMensal() {
        setSaldo(getSaldo() - 20.0);
        System.out.println("Cobrando tarifa mensal");
    }
}
