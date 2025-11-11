package Informatica;

public class Tecnico {
    private String nome;
    private Especialidade especialidade;

    public Tecnico(String nome, Especialidade especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void atenderPedido(Pedido pedido) {
        pedido.atualizarStatus(StatusPedido.CONCLUIDO);
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", especialidade=" + especialidade +
                '}';
    }
}
