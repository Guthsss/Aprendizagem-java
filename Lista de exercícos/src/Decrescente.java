import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args) {
        // Algoritmo para ler três valores diferentes e imprimir em ordem decrescente

        int x, y, z;

        try (Scanner d = new Scanner(System.in)) {
            System.out.print("Digite valor de X: ");
            x = d.nextInt();

            System.out.print("Digite valor de Y: ");
            y = d.nextInt();

            System.out.print("Digite valor de Z: ");
            z = d.nextInt();
        }

        // Ordenação decrescente

        if (x < y) {        
            int temp = x;   // Guardamos o valor de x.
            x = y;          // Sobrescrevemos x com y.
            y = temp;       // Atribuímos a y o valor original de x (que estava salvo em temp).
        }

        if (x < z) {
            int temp = x;
            x = z;
            z = temp;
        }

        if (y < z) {
            int temp = y;
            y = z;
            z = temp;
        }

        System.out.println("Valores em ordem decrescente: " + x + " > " + y + " > " + z);
    }
}