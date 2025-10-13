package Produtos;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }

    public void aplicarDesconto(double valor) {
        this.preco -= valor;
    }
    public void exibirDados () {
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Valor do Produto: " + this.preco);
    }
}
