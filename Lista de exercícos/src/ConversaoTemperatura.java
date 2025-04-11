
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Double temp1, temp2, temp3;
        int opcao;
        
        try (Scanner temperatura = new Scanner(System.in)) {

            System.out.println("1 - Celcius");
            System.out.println("2 - fahrenheit");
            System.out.println("3 - Kelvin");

            System.out.print("Digite qual temperatura deseja converter: ");
            opcao = temperatura.nextInt();
            
            if (opcao == 1) {

                System.out.print("Digite a temperatura: ");
                temp1 = temperatura.nextDouble();

                temp2 = (temp1 * 1.8) + 32;
                System.out.println("Fahrenheit: " + temp2);

                temp3 = (temp1 + 273);
                System.out.println("Kelvin: " + temp3);

            } else if (opcao == 2) {

                System.out.print("Digite a temperatura: ");
                temp1 = temperatura.nextDouble();

                temp2 = (temp1- 32) / 1.8;
                System.out.println("Celcius: " + temp2);

                temp3 = (temp1 - 32) * (5/9) + 273;
                System.out.println("Kelvin: " + temp3);

            } else if (opcao == 3) {

                System.out.print("Digite a temperatura: ");
                temp1 = temperatura.nextDouble();

                temp2 = temp1 - 273;
                System.out.println("Celcius: " + temp2);

                temp3 = ((temp1 - 273) * 1.8) + 32;
                System.out.println("Fahrenheit: " + temp3);

            } else {
                
                System.out.println("Opção iválida");
            } 
        }
    }
}