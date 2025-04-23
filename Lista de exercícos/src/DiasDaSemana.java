import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {

        // Construa um algoritmo que leia um número inteiro de 1 a 7 e informe o dia da semana correspondente, sendo domingo o dia de número 1. Se o número não
        // corresponder a um dia da semana, mostre uma mensagem de erro.
        
        int dias;

        try (Scanner semana = new Scanner(System.in)) {
            System.out.println("Que dia da semana é hoje (Em número decimal): ");
            dias = semana.nextInt();
        }

        switch (dias) {

            case 1:
            System.out.println("Hoje é Domingo");
            break;

            case 2:
            System.out.println("Hoje é Segunda-feira");
            break;

            case 3:
            System.out.println("Hoje é Terça-feira");
            break;

            case 4:
            System.out.println("Hoje é Quarta-feira");
            break;

            case 5:
            System.out.println("Hoje é Quinta-feira");
            break;

            case 6:
            System.out.println("Sextou");
            break;

            case 7:
            System.out.println("Hoje é Sábado");
            break;

            default:
            System.out.println("Dia inválido");
            break;
        }
    }
}