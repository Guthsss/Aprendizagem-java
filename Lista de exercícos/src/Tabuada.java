import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int x;
        
        try (Scanner tabuada = new Scanner(System.in)) {

            System.out.print("Digite um número: ");
            x = tabuada.nextInt();
        }

        if (x > 0) {
            for (int i = 1; i <= 10; i++) {
                int z = (x * i);
                System.out.println(z);
            }
        }
    }
}