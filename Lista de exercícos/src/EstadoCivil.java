
import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[] args) {

        // Faça um algoritmo que leia a primeira letra do estado civil de uma pessoa e mostre uma mensagem com a sua descrição (Solteiro, Casado, Viúvo, Divorciado). 
        // Mostre uma mensagem de erro, se necessário.
        
        char estadoCivil;

        try (Scanner civil = new Scanner(System.in)) {
            System.out.print("Digite a character inicial do seu estado civil");
            estadoCivil = civil.next().toUpperCase().charAt(0); // charAt(0) pega o primeiro caractere dessa String, que será armazenado na variável estadoCivil.
            // o "toUpperCase()" é usado para obrigar a pessoa a escrever em caixa alta dentro do Scanner.
        }

        switch (estadoCivil) {

            case 'S':
            System.out.println("Você está Solteiro(a)");
            break;

            case 'C':
            System.out.println("Você está Casado(a)");
            break;

            case 'V':
            System.out.println("Você é Viúvo(a)");
            break;

            case 'D':
            System.out.println("Você é Divorciado(a)"); 
            break;
        }
    }
}