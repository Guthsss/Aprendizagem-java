package Produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
    public void aumentarEstoque (int quantidade) {
        this.quantidade += quantidade;
    }
    public void diminuirEstoque (int quantidade) {
        this.quantidade -= quantidade;
    }
    public void atualizarPreco (double preco) {
        this.preco = preco;
    }
    public void calcularValorTotal () {
        System.out.println(preco * quantidade);
    }
    public void exibirInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Categoria: " + categoria);
    }
}
