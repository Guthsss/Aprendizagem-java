import java.util.Scanner;
public class Estacoes {
    public static void main(String[] args) {
        
        // Crie um algoritmo chamado Estacoes. Este algoritmo deve ler uma data e armazenar na variável mes um número entre 1 e 12,
        // correspondendo a um dos meses do ano. No final, você deve imprimir uma mensagem.

        int estacoes = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite em que mês está: ");
            estacoes = scanner.nextInt();
        }

        switch (estacoes) {

            case 1:
            case 2:
            case 3:
            System.out.println("Você está no verão"); // Seria o mês Janeiro, Fevereiro, Março.
            break;

            case 4:
            case 5:
            case 6:
            System.out.println("Você está no Outono"); // Abril e assim por diante.
            break;

            case 7:
            case 8:
            case 9:
            System.out.println("Você está no Inverno"); 
            break;

            case 10:
            case 11:
            case 12:
            System.out.println("Você está no Primavera"); 
            break;

            default:
            System.out.println("Mês inválido");
            break;
        }
    }
}
