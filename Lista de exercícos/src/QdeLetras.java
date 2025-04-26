
import java.util.Scanner;

public class QdeLetras {
    public static void main(String[] args) {
        
        try (Scanner letras = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = letras.next();
            System.out.println(palavra.length());
        }
    }
}
