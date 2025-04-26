import java.util.Arrays;
import java.util.Scanner;

public class OrdemDeQuatroValores {
    public static void main(String[] args) {

        // Declaração das variáveis
        int i;
        double a, b, c;

        // Exibe as instruções para o usuário
        System.out.println("I = 1, escrever os três valores A, B e C em ordem crescente\n" +
            "I = 2, escrever os três valores A, B e C em ordem decrescente\n" +
            "I = 3, escrever os três valores A, B e C de forma que o maior valor fique entre os outros dois");

        try (Scanner scanner = new Scanner(System.in)) {
            // Lê o valor de I
            System.out.print("Digite um valor inteiro e positivo para I (1, 2 ou 3): ");
            i = scanner.nextInt();

            // Lê os valores de A, B e C
            System.out.print("Digite o valor de A: ");
            a = scanner.nextDouble();

            System.out.print("Digite o valor de B: ");
            b = scanner.nextDouble();

            System.out.print("Digite o valor de C: ");
            c = scanner.nextDouble();
        }

        // Verifica o valor de I e realiza a operação correspondente
        switch (i) {
            case 1:
                // Ordem crescente
                double[] valoresCrescentes = {a, b, c};
                Arrays.sort(valoresCrescentes); // Ordena os valores em ordem crescente
                System.out.println("Valores em ordem crescente: " + Arrays.toString(valoresCrescentes));
                break;

            case 2:
                // Ordem decrescente
                double[] valoresDecrescentes = {a, b, c};
                Arrays.sort(valoresDecrescentes); // Ordena em ordem crescente
                System.out.println("Valores em ordem decrescente: " +
                    valoresDecrescentes[2] + ", " + valoresDecrescentes[1] + ", " + valoresDecrescentes[0]);
                break;

            case 3:
                // Maior valor no meio
                double maior = Math.max(a, Math.max(b, c));
                double menor = Math.min(a, Math.min(b, c));
                double meio = a + b + c - maior - menor; // Soma total menos o maior e o menor
                System.out.println("Valores com o maior no meio: " + menor + ", " + maior + ", " + meio);
                break;

            default:
                // Valor inválido para I
                System.out.println("Valor inválido para I. Por favor, insira 1, 2 ou 3.");
                break;
        }
    }
}