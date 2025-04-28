import java.util.Scanner;

public class DividirParDeImpar {
    public static void main(String[] args) {
        try (Scanner funcao = new Scanner(System.in)) {
            System.out.print("Digite os números separados por vírgula: ");
            String input = funcao.nextLine(); // Lê todos os números como uma única string
            
            String[] numeros = input.split(","); // Divide a string em partes usando a vírgula como separador

            System.out.println("Números pares:");
            for (String numero : numeros) {
                int valor = Integer.parseInt(numero.trim()); // Converte cada número para inteiro
                if (valor % 2 == 0) {
                    System.out.println(valor);
                }
            }
            System.out.println("Números ímpares:");
            for (String numero : numeros) {
                int valor = Integer.parseInt(numero.trim()); // Converte cada número para inteiro
                if (valor % 2 != 0) {
                    System.out.println(valor);
                }
            }
        }
    }
}