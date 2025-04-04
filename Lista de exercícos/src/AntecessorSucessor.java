
import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        
        //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        int x, ant, suc;

        try (Scanner numero = new Scanner(System.in)) {
                System.out.print("Digite um valor X: ");
                x = numero.nextInt();
        }
         
        ant = x - 1;
        suc = x + 1;

        System.out.println("O antecessor do número escolhido é " + ant); 
        System.out.println("O sucessor do número escolhido é " + suc);
    }
}
