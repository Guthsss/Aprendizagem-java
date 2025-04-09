
import java.util.Scanner;

public class Pix {
    public static void main(String[] args) {

        // Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e
        // imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

        //Tabela de Código de Condições de Pagamento

        //1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        //2 - À Vista no cartão de crédito, recebe 10% de desconto
        //3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        //4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%.

        int formaDePagamento;
        double valorDoProduto;
        
        
        try (Scanner forma = new Scanner(System.in)) {

        System.out.print("Digite o valor do produto: ");
        valorDoProduto = forma.nextDouble();

        System.out.println("1 = À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 = À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 = Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 = Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%.");

        System.out.print("Escolha a forma de pagamento: ");
        formaDePagamento = forma.nextInt();
        }

        if (formaDePagamento == 1) {
            valorDoProduto = valorDoProduto - (0.15 * valorDoProduto);
            System.out.println("O valor total a ser pago é " + valorDoProduto); 
        } else if (formaDePagamento == 2) {
            valorDoProduto = valorDoProduto - (0.10 * valorDoProduto);
            System.out.println("O valor total a ser pago é " + valorDoProduto);
        } else if (formaDePagamento == 3) {
            System.out.println("O valor total a ser pago é " + valorDoProduto);
        } else if (formaDePagamento == 4) {
            valorDoProduto = valorDoProduto + (0.10 * valorDoProduto);
            System.out.println("O valor total a ser pago é " + valorDoProduto);
        }
    }
}