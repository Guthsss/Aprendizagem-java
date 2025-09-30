package Animal;

public class Principal {
    public static void main(String[] args) {
        Animal animal  = new Animal("Alberto", "Ovelha", 19, 19.2);
        Animal animal2 = new Animal("Leandro", "Capivara", 15, 90.2);

        animal.envelhecer();
        animal.exibirInfo();

        animal2.exibirInfo();
    }
}
