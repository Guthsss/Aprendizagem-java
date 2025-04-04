
import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        
        //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e
        //imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

        int m, s, q; // Pode também ser usado o "float" ou o "double" no lugar do "int" para dar o resultado em número quebrado

        try (Scanner salario = new Scanner(System.in)) {

            System.out.print("Digite o valor do salário mínimo: ");
            m = salario.nextInt();

            System.out.print("Digite seu salário: ");
            s = salario.nextInt();
        }

            q = s / m;

            System.out.println("Você ganha " + q + " salário mínimos");
        }
    }

