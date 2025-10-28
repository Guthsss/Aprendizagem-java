package AtividadeEmSala;

public class Cliente {
    private TipoCliente tipo;

    public Cliente(TipoCliente tipo) {
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
}
