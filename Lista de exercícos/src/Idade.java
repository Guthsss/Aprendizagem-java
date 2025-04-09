
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        //Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

        String nome;
        int idade;
        
        try (Scanner dados = new Scanner(System.in)) {

            System.out.print("Digite seu nome: ");
            nome = dados.next();

            System.out.print("Digite sua idade: ");
            idade = dados.nextInt();
        }

        if (idade < 18) {
            System.out.println("Seu nome é " + nome + " e você é menor de idade");
        } else {
            System.out.println("Seu nome é " + nome + " e você é maior de idade");
        }        
    }
}
