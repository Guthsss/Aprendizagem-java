import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        String email, senha, nickname;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu e-mail: ");
            email = scanner.next();

            System.out.print("Digite seu nickname: ");
            nickname = scanner.next();

            System.out.print("Digite sua senha: ");
            senha = scanner.next();
        
            boolean logado = false;

            while (!logado) {
                System.out.print("Digite seu e-mail ou nickname: ");
                String loginInput = scanner.next();

                System.out.print("Digite sua senha: ");
                String senhaInput = scanner.next();

                if ((loginInput.equals(email) || loginInput.equals(nickname)) && senhaInput.equals(senha)) {
                    System.out.println("Login realizado com sucesso!");
                    logado = true; 
                } else {
                    System.out.println("E-mail/Nickname ou senha incorretos. Tente novamente.");
                }
            }
        }
    }
}
