import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        int p;
        char s;
        float a, i;

        try (Scanner imc = new Scanner(System.in)) {
            System.out.print("Digite seu sexo: ");
            s = imc.next().charAt(0);

            System.out.print("Digite seu peso (em kg): ");
            p = imc.nextInt();

            System.out.print("Digite sua altura (em metros): ");
            a = imc.nextFloat();

            i = p / (a * a); // Fórmula do IMC

            // Classificação do IMC
            
            if (i < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (i < 29.9) {
                System.out.println("Peso ideal (Parabéns)");
            } else if (i < 34.9) {
                System.out.println("Levemente acima do peso");
            } else if (i < 39.9) {
                System.out.println("Obesidade grau I");
            } else if (i < 40.0) {
                System.out.println("Obesidade grau II");
            } else {
                System.out.println("Obesidade grau III");
            }

            System.out.println("Seu IMC é: " + i);
        }
    }
}
