package Casa;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua Alvaro", "Green");
        casa.adicionarComodo("Quarto", "Red", 12);
        casa.adicionarComodo("Sala", "Purple", 15);
        casa.mostrarComodos();
    }
}
