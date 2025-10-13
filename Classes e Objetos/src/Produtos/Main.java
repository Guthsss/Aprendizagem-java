package Produtos;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 1000);
        ProdutoImportado p2 = new ProdutoImportado("Computador", 2000, 0.5, "Brasil");
        ProdutoNacional p3 = new ProdutoNacional("GPU", 2300, 22);

        p1.exibirDados();
        p1.aplicarDesconto(2);
        p1.exibirDados();
    }
}
