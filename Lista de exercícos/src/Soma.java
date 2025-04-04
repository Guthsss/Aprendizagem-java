import java.util.Scanner;
public class Soma {
    public static void main(String[] args) throws Exception {
        
    //Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

    int x, y, z, resultado;
    
    Scanner soma = new Scanner(System.in); 

    System.out.println("Digite um número X: ");
        x = soma.nextInt();

    System.out.println("Digite um número Y: ");
        y = soma.nextInt();

    System.out.println("Digite um número Z: ");
        z = soma.nextInt();

    soma.close();

    resultado = x + y;

    System.out.println("A soma dos números X e Y é: " + z);

    if (resultado < z) {
        System.out.println("Número Z é maior que a soma de X e Y");
    } else if (resultado > z) {
        System.out.println("Número Z é menor que a soma de X e Y");
    } else {
        System.out.println("Número Z é igual que a soma de X e Y");
    }
    }
}
    