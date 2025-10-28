import java.util.Scanner;

public class Pedido {
    private Tamanho tamanhoPizza;
    public Pedido(Tamanho tamanho) {
        this.tamanhoPizza = tamanho;
    }
    public void FazerPedido() {
        switch (tamanhoPizza) {
            case Tamanho.tamanho.Pequeno -> System.out.println("Pizza pequena - 25$");
            case Tamanho.tamanho.Medio -> System.out.println("Pizza media - 35$");
            case Tamanho.tamanho.Grande -> System.out.println("Pizza media - 50$");
            case Tamanho.tamanho.Extra_Grande -> System.out.println("Pizza extra grande - 75$");
            default -> System.out.println("Insira um tamanho válido");
        }
    }
}
