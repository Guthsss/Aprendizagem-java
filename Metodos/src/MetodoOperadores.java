import java.util.Scanner;

public class MetodoOperadores {

    static double a;
    static double b;

    static double multiplicacao() {

        return (a * b);
    }

    static double divisao() {

        return (a / b);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Atriabua um valor para A: ");
            a = scanner.nextDouble();

            System.out.print("Atribua um valor a B: ");
            b = scanner.nextDouble();
        }

        double resultado1 = multiplicacao();
        System.out.println("O resultado da multiplicação é: " + resultado1);


        if (b > 0) {
        double resultado2 = divisao();
        System.out.println("O resultado da multiplicação é: " + resultado2);
        } else {
            System.out.println("O divisor não pode ser zero ou número negativo");
        }
        
    }
}