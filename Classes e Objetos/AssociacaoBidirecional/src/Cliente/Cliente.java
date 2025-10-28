package Cliente;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> listaDePedidos = new ArrayList<>();

    public Cliente(String nome, String cpf, ArrayList<Pedido> listaDePedidos) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    public void adicionarPedido(Pedido pedido) {
        listaDePedidos.add(pedido);
    }
    public void removerPedido(Pedido pedido) {
        pedido.setCliente(this);
        listaDePedidos.remove(pedido);
    }
    public void exibirPedido() {
        System.out.println("Nome: " + this.nome + "\nCPF: " + this.cpf);

        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : listaDePedidos) {
            System.out.println("Num: " + pedido.getNumero() + "\nTotal: " + pedido.getTotal());
        }
    }
}
