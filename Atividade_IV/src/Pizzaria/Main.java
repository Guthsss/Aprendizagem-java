package Pizzaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        Cliente c1 = new Cliente(nome, cpf);
        Pedido p1 = new Pedido(213, c1, 200);

        p1.imprimirResumo();
    }
}
