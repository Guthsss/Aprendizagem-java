
import java.util.Scanner;

public class anos {
    public static void main(String[] args) {
        int data, mes, ano;

        try (Scanner idade = new Scanner(System.in)) {
            System.out.print("Digite sua data de nascimento (dia/mes/ano): ");
            String entrada = idade.nextLine();

            String[] partes = entrada.split("/");

            data = Integer.parseInt(partes[0].trim());
            mes = Integer.parseInt(partes[1].trim());
            ano = Integer.parseInt(partes[2].trim());

            // Data atual fixa: 09/04/2025
            int diaAtual = 9;
            int mesAtual = 4;
            int anoAtual = 2025;

            // Converter tudo para dias
            int diasNascimento = (ano * 365) + (mes * 30) + data;
            int diasAtuais = (anoAtual * 365) + (mesAtual * 30) + diaAtual;

            int totalDiasVividos = diasAtuais - diasNascimento;

            int anosVividos = totalDiasVividos / 365;
            int mesesVividos = (totalDiasVividos % 365) / 30;
            int diasVividos = (totalDiasVividos % 365) % 30;

            System.out.println("Você viveu:");
            System.out.print(anosVividos + " anos");
            System.out.print(mesesVividos + " meses");
            System.out.print(diasVividos + " dias");
        }
    }
}

