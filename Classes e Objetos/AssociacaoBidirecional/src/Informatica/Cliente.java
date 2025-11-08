package Informatica;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void consultarPedido(Pedido pedido) {
        System.out.println("Número do pedido: " + pedido.getNumero() + "Data: " + pedido.getData() + "Status: " + pedido.getStatus() + "Técnico: " + pedido.getTecnico());
    }
}
