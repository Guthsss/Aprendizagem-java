package Informatica;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        nome = input.nextLine();

        input.close();
        Cliente cliente1 = new Cliente(nome, "Rua 10 de setembro");
        Tecnico tecnico = new Tecnico("Roberto", Especialidade.ELETRICA);
        Pedido pedido = new Pedido(123, LocalDate.now(), StatusPedido.AGUARDANDO, tecnico);
    }
}
