import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (frase.indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);
        scanner.close();
    }
}