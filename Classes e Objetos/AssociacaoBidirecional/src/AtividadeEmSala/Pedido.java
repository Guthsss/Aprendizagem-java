package AtividadeEmSala;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private StatusPedido status;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Cliente cliente;
    private Vendedor vendedor;
    private double descontoAcumulado;

    public Pedido(int id, StatusPedido status, ArrayList<Produto> produtos, Cliente cliente, Vendedor vendedor, double descontoAcumulado) {
        this.id = id;
        this.status = status;
        this.produtos = produtos;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.descontoAcumulado = descontoAcumulado;
    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
    public double calcularTotal(){
        double soma = 0;
        for(Produto produto: produtos){
            soma += produto.getPreco();
        }
        return soma;
    }
    public void aplicarDesconto(double percent){
        this.descontoAcumulado = (calcularTotal() * percent/100);
    }
    public void pagar () {
        this.status = StatusPedido.PAGO;

        if (this.vendedor != null) {
            System.out.println("Comissão do vendedor: R$" + this.vendedor.calcularComissao(this.calcularTotal()));
        }
    }
    public void calcelar () {
        this.status = StatusPedido.CANCELADO;
    }
    public void resumo () {
        System.out.println("Id: " + this.id);
        System.out.println("Status: " + this.status);
        System.out.println("Desconto: " + this.descontoAcumulado);
        System.out.println("Total: " + (calcularTotal() - this.descontoAcumulado));
        System.out.println("Vendedor: " + this.vendedor);
        System.out.println("Cliente: " + this.cliente);
    }
}
