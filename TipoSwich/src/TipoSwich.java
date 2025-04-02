import java.util.Scanner;

public class TipoSwich {
    public static void main(String[] args) {

        // Exemplo de switch case
        // O switch case é uma estrutura de controle que permite executar diferentes partes do código
        // com base no valor de uma variável. É uma alternativa ao uso de múltiplos if-else if.
        // A variável a ser avaliada deve ser do tipo byte, short, int, char, String ou enum.
        
        int dia; // Declaração da variável dia

        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite um número de 1 a 7: "); // Solicita ao usuário que digite um número de 1 a 7
        dia = scanner.nextInt(); // Lê o número digitado pelo usuário e armazena na variável dia
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira"); // No Caso de Quarta-feira, o código imprime "Quarta-feira" pois o valor de dia é 4
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido"); // Caso o valor de dia não corresponda a nenhum case, imprime "Dia inválido"
                break;
        }
    }
}