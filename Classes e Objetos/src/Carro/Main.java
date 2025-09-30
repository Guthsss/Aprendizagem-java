package Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", "LaFerrari", 2019, 90.2, true);
        Carro carro2 = new Carro("Lamborghini", "Aventador", 2020, 102.2, true);

        carro.exibirInfo();
        carro2.acelerar(200);
        carro2.exibirInfo();
        carro2.desligado();
        carro2.exibirInfo();
    }
}
