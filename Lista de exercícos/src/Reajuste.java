import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        
        //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        int v;
        double r;

        try (Scanner reajuste = new Scanner(System.in)) {
            System.out.print("Digite um valor X: ");
            v = reajuste.nextInt();
        }

        r = v + v * (5.0/100); // Aqui foi preciso o uso de 2 "v" porque o primeiro v adiciona a "r" e o segundo só é multiplicado por 0.05 assim ficando 5, então 100 + 5 = 105 ou 210 entre outros valores

        System.out.println("O valor X com um reajuste de 5% é: " + r);
    }
}
