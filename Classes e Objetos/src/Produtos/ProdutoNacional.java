package Produtos;

public class ProdutoNacional extends Produto{
    private double descontoGoverno;

    public ProdutoNacional(String nome, double preco, double taxaRendimento) {
        super(nome, preco);
        this.descontoGoverno = taxaRendimento;
    }
    public double calcularPrecoFinal () {
       return getPreco() - (descontoGoverno/100.0);
    }
    public void exibirDados () {
        System.out.println("Nome" + getNome());
        System.out.println("Valor do desconto: " + descontoGoverno + "%");
        System.out.println("Valor Final" + calcularPrecoFinal());
    }
    public void promocaoEspecial () {
        System.out.println("Produto nacional em promoção");
    }
}
