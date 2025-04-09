
import java.util.Scanner;

public class TroqueValores {
    public static void main(String[] args) {

        // Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        int a, b, troque;

        try (Scanner valores = new Scanner(System.in)) {

            System.out.print("Digite o valor de A: ");
            a = valores.nextInt();

            System.out.print("Digite o valor de B: ");
            b = valores.nextInt();
        }

        troque = a;
        a = b;
        b = troque;

        System.out.println(a);
        System.out.println(b);
    }
}
