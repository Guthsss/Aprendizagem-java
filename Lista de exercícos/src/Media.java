
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        double n1, n2, n3, m;

        String aluno;

        try (Scanner media = new Scanner(System.in)) {

            System.out.print("Digite o nome do aluno: ");
            aluno = media.nextLine();

            System.out.print("Digite a primeira nota: ");
            n1 = media.nextInt();

            System.out.print("Digite a segunda nota: ");
            n2 = media.nextInt();

            System.out.print("Digite a terceira nota: ");
            n3 = media.nextInt();
        }
        
        m = (n1 + n2 + n3) / 3;

        System.out.print("A média do aluno " + aluno + " é " + m);
    }
}

