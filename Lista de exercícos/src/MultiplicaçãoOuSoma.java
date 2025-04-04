
import java.util.Scanner;

public class MultiplicaçãoOuSoma {
    public static void main(String[] args) {

        // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário deverá
        // multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
        
        int x, y, z = 0, soma;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor X: ");
        x = entrada.nextInt();

        System.out.print("Digite um valor Y: ");
        y = entrada.nextInt();

        entrada.close();

        if (y == x) {
            soma = x + y;
        } else {
            soma = x * y;
        }
        
        z = soma;

        System.out.print("Resultado: " + z);
    }
}
