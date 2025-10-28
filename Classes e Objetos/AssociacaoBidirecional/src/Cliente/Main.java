package Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro", "1243432", null);
        Pedido pedido = new Pedido(1, 200);
        Pedido pedido2 = new Pedido(2, 200);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero, total do pedido: ");
        String numero = input.nextLine();
        String[] partes = numero.split("\\s*,\\s*");
        int numero1 = Integer.parseInt(partes[0]);
        double total = Double.parseDouble(partes[1]);
        input.close();
        cliente.exibirPedido();
    }
}
