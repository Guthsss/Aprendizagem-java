import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        
        int x, y;

            Scanner modulo = new Scanner(System.in);

            System.out.println("Digite X: ");
                x = modulo.nextInt();
            
            System.out.println("Digite Y: ");
                y = modulo.nextInt();

            modulo.close();

            System.out.println("X é " + (x % 2 == 0 ? "par" : "ímpar") + " e " + (x > 0 ? "positivo" : (x < 0 ? "negativo" : "zero"))); // Aqui temos que fazer deste jeito mais complicado, mas precisa ser feito para fazer o par/ímpar e negativo/positivo na mesma linha

            System.out.println("Y é " + (y % 2 == 0 ? "par" : "ímpar") + " e " + (x > 0 ? "positivo" : (y < 0 ? "negativo" : "zero"))); // Aqui a mesma coisa
    
            // Como também poderia ser feito com o uso do IF e ELSE mas aí não apareceria na mesma linha
            // O uso do ? e do : se deve porque um significa verdadeiro e o outro falso
            // Exemplo: (y % 2 == 0 ? "par" : "ímpar") se o resto da divisão for 0 é par, a sentença é verdadeira caso contrário é ímpar
      }
}

