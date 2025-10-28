package AtividadeEmSala;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        //<editor-fold desc="Inicializando variaveis Scanner">
        String nomeCliente = null;
        String cpfCliente = null;
        String nomeVendedor = null;
        String cpfVendedor = null;
        String matriculaVendedor = null;
        //</editor-fold>
        Produto produto = new Produto("123", "muito bom pra pele", 100);

        //<editor-fold desc="Scanner - Entrada de Dados">
        Scanner input = new Scanner(System.in);
        System.out.print("Informe nome e CPF do cliente: ");
        String linha1 = input.nextLine();
        String partes1[] = linha1.split("\\s*,\\s*");
        nomeCliente = partes1[0];
        cpfCliente = partes1[1];

        System.out.println("Informe nome, cpf e matrícula do vendedor: ");
        String linha2 = input.nextLine();
        String partes2[] = linha2.split("\\s*,\\s*");
        nomeVendedor = partes2[0];
        cpfVendedor = partes2[1];
        matriculaVendedor = partes2[2];

        input.close();
        //</editor-fold>
        Cliente cliente = new Cliente(nomeCliente, cpfCliente, TipoCliente.BRONZE);
        Vendedor vendedor = new Vendedor("Carlos", "124534322", "123");
        Pedido pedido = new Pedido(1, StatusPedido.ABERTO, produtos, cliente, vendedor, 0.0);
        pedido.adicionarProduto(produto);
        pedido.aplicarDesconto(12);
        pedido.pagar();
        pedido.resumo();

    }
}
