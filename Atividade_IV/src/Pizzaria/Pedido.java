package Pizzaria;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private double total;

    public Pedido(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void imprimirResumo() {
        System.out.println("Num Pedido: " + this.numero + "\nCliente: " + this.cliente.getNome() + "\nTotal: " + this.total);
    }
}
