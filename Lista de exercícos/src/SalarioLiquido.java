
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        
        // Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de
        // aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

        double aula, salario;
        int lecionadas, inss;


        try (Scanner professor = new Scanner(System.in)) {

            System.out.print("Digite o valor da hora aula: ");
            aula = professor.nextDouble();

            System.out.print("Digite o número de aula lecionadas no mês: ");
            lecionadas = professor.nextInt();

            System.out.print("Digite o percentual de desconto do INSS: ");
            inss = professor.nextInt();
            
            salario = aula * lecionadas;
            salario = salario - (salario * (inss/100.0));

            System.out.println("O salário líquido final é: R$" + salario);
        }
    }
}