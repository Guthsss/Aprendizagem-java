
import java.util.Scanner;

public class Pescador {
    public static void main(String[] args) {
        
        // João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
        // Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
        // João precisa que você faça algoritmo que leia a variável P (peso de peixes) e verifique se há excesso. 
        // Se houver, gravar na variável e (Excesso) e na variável M o valor da multa que João deverá pagar.
        // Caso contrário mostrar tais variáveis com o conteúdo ZERO

        double peso, excesso, multa;

        try (Scanner pescador = new Scanner(System.in)) {

            System.out.print("Digite o peso dos peixes: ");
            peso = pescador.nextDouble();
        }

        if (peso > 50.0) {
            excesso = peso - 50.0;
            multa = excesso * 4.0;
            System.out.println("Foi trazido " + peso + "(kg) e o excesso foi de " + excesso + " e a valor pago da multa será de " + multa);
        } else {
            excesso = 0.0;
            multa = 0.0;
            System.out.println("Foi trazido " + peso + "(kg) e não teve excesso e também não teve multa");
        }
    }
}