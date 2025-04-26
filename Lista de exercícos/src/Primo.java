import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        
        // Leia um número e diga se ele é primo ou não.

        int primo = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para ver se ele é primo ou não: ");
            primo = scanner.nextInt();
        }
        if (primo % 2 == 0) {
            System.out.println("Não é primo");
        } else if (primo % 2 == 1) {
            System.out.println("É primo");
        }
    }
}
