
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        //Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi
        //aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

        double n1, n2, n3, m;

        String aluno, status;

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

        if (m >= 7) {
            status = "Aprovado(a)";
        } else {
            status = "Reprovado(a)";
        }
        
        System.out.print("A média do aluno " + aluno + " é " + m + " e ele(a) está " + status);
    }
}

