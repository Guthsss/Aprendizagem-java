
import java.util.Scanner;

public class Para {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("===");

        // Usando o Scanner para ler a entrada do usuário, para fazer uma contagem regressiva presonalizada

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();  // Correção aqui

            for (int j = n; j >= 0; j--) {  // Usado o for para contar de n até 1
                System.out.println(j);
            }
        }

        System.out.println("===");

        // Outro loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outro: " + i); 
    
        // Interior loop
        for (int j = 1; j <= 3; j++) {
            System.out.println(" Interior: " + j); 
        }
      }
    }
}


        