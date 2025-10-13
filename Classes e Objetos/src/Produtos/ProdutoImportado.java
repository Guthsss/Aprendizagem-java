package Produtos;

public class ProdutoImportado extends Produto{
    private double taxaImportacao;
    private String paisOrigem;

    public ProdutoImportado(String nome, double preco, double taxaImportacao, String paisOrigem) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
        this.paisOrigem = paisOrigem;
    }

    public double CalcularPrecoFinal() {
        return getPreco() + taxaImportacao;
    }
    public void exibirDados () {
        System.out.println("Nome" + getNome());
        System.out.println("Valor Final" + CalcularPrecoFinal());
        System.out.println("Pais de origem" + this.paisOrigem);
    }
    public void verificarAutenticador () {
        System.out.println("Produto autenticado com selo internacional");
    }
}
