package Cliente;

public class Pedido {
    public String getTotal;
    private int numero;
    private double total;
    public Cliente cliente;

    public Pedido(int numero, double total) {
        this.numero = numero;
        this.total = total;
    }
    public void exibirResumo() {
        System.out.println("Num: " + this.numero + " - Total do pedido: " + this.total + "Nome: " + cliente.getNome());
    }
    public void aplicarDesconto(double porcentagem) {
        this.total -= ((porcentagem/100) * this.total);
    }

    public double getTotal() {return total;}
    public int getNumero() {return numero;}

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
