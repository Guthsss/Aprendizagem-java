package AtividadeEmSala;

public class Cliente extends Pessoa {
    private TipoCliente tipo;

    public Cliente(String nome, String cpf, TipoCliente tipo) {
        super(nome, cpf);
        this.tipo = tipo;
    }
    public TipoCliente getTipo() {return tipo;}

    public double aplicarCashback (double valor) {
        if (tipo == TipoCliente.PRATA) {
            return 0.02;
        } else if (tipo == TipoCliente.OURO) {
            return 0.05;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " ,Cpf: " + this.getCpf() + " ,Tipo: " + tipo;
    }
}
