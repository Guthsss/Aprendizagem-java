
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ordens {
    
    // Faça um programa que lê quatro valores: I, A, B e C, onde I é um número inteiro e positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os valores lidos e:
    // Se I = 1, escrever os três valores A, B e C em ordem crescente;
    // Se I = 2, escrever os três valores A, B e C em ordem decrescente;
    // Se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
    // Se I não for um dos três valores acima, dar uma mensagem indicando isto.

    static int i;
    static double x;
    static double y;
    static double z;

    static void ordemCrescente() {
       Double[] numeros = {x, y ,z}; // Cria uma array.
       Arrays.sort(numeros); // Faz uma ordem crescente dos valores.
       System.out.println("\nOrdem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]); // Faz um sysout para ser usado futuramente no switch case.
    }
    static void ordemDecrescente() {
        Double[] numeros1 = {x, y, z};
        Arrays.sort(numeros1, Collections.reverseOrder()); // Reverte a ordem da array.
        System.out.println("\nOrdem decrescente: " + numeros1[0] + ", " + numeros1[1] + ", " + numeros1[2]);
    }
    static void maiorNoMeio() {
        Double[] numeros = {x, y, z};
        Arrays.sort(numeros);
        System.out.println("\nMaior no meio: " + numeros[0] + ", " + numeros[2] + ", " + numeros[1] );
    }

    public static void main(String[] args) {

        
        try (Scanner ordem = new Scanner(System.in)) {

            System.out.println("I = 1, escrever os três valores A, B e C em ordem crescente\nI = 2, escrever os três valores A, B e C em ordem decrescente;\r\nI = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois");

            System.out.print("\nI: ");
            i = ordem.nextInt();

            System.out.print("\nDigite valor de X: ");
            x = ordem.nextDouble();

            System.out.print("Digite valor de Y: ");
            y = ordem.nextDouble();

            System.out.print("Digite valor de Z: ");
            z = ordem.nextDouble();

            switch (i) {
                case 1:
                ordemCrescente();
                break;
                case 2:
                ordemDecrescente();
                break;
                case 3:
                maiorNoMeio();
                break;
                default:
                System.out.println("Valor inválido"); 
                break;
            }  
        }
    }
}
