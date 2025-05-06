import java.util.Locale;
import java.util.Scanner;

public class MetodoCalculadora {
    
    static double x;
    static double y;
    static int i;
    static double resultado;

    static double divisao() {
        return (x / y);
    }
    static double multiplicacao() {
        return  (x * y);
    }
    static double soma() {
        return (x + y);
    }
    static double subtracao() {
        return (x - y);
    }
    static double potenciacao() {
        return Math.pow(x, y);
    }
    public static void main(String[] args) {

        System.out.println("1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Potenciação");
        
        try (Scanner calculadora = new Scanner(System.in)) {
            calculadora.useLocale(Locale.US); // Configura para que a entrada de dados seja com  o padrão Norte Americano

            System.out.print("\nEscolha a operação: ");
            i = calculadora.nextInt();

            System.out.print("\nDigite um valor para X: ");
            x = calculadora.nextDouble();
            
            System.out.print("Digite um valor para Y: ");
            y = calculadora.nextDouble();

            if (i == 1) {
                resultado = soma();
                System.out.println("\nSoma: " + resultado);
            } else if (i == 2) {
                resultado = subtracao();
                System.out.println("\nSubtração: " + resultado);
            } else if (i == 3) {
                resultado = multiplicacao();
                System.out.println("\nMultiplicação: " + resultado);
            } else if ((i == 4) && (y > 0)) {
                resultado = divisao();
                System.out.println("\nDivisão: " + resultado);
            } else if (i == 5) {
                resultado = potenciacao();
                System.out.println("\nPotenciação: " + resultado);
            } else {
                System.out.println("\nOperação iválida");
            }
        }
    }
}