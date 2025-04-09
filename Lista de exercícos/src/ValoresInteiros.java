
import java.util.Scanner;

public class ValoresInteiros {
    public static void main(String[] args) {
        
        // Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

        int x, y, resto, quociente;
        

        try (Scanner valores = new Scanner(System.in)) {

            System.out.print("Digite valor de X: ");
            x = valores.nextInt();

            System.out.print("Digite o valor de Y: ");
            y = valores.nextInt();

            quociente = x / y;

            resto = x % y;

            System.out.print("O quocinte dessa operação é: " + quociente);
            System.out.print(" e o resto é: " + resto);
        }
    }
}
