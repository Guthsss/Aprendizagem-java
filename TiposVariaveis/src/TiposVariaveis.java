
import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {


        // Tipos de dados primitivos em Java

        //Tipo de dados	  Descrição
        //byte	          Armazena números inteiros de -128 a 127
        //short	          Armazena números inteiros de -32.768 a 32.767
        //int	          Armazena números inteiros de -2.147.483.648 a 2.147.483.647
        //long	          Armazena números inteiros de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        //float	          Armazena números fracionários. Suficiente para armazenar de 6 a 7 dígitos decimais//É preciso o uso do sufixo f ou F no final do número
        //double	      Armazena números fracionários. Suficiente para armazenar de 15 a 16 dígitos decimais////É preciso o uso do sufixo d ou D no final do número
        //String	      Armazena uma sequência de caracteres. É uma classe, não um tipo primitivo
        //boolean	      Armazena valores verdadeiros ou falsos
        //char	          Armazena um único caractere/letra ou valores ASCII

        // Definindo uma variável do tipo inteiro
        int idade = 30;
        System.out.println("Idade: " + idade);

        // Definindo uma variável do tipo double
        double altura = 1.75;
        System.out.println("Altura: " + altura);

        // Definindo uma variável do tipo char
        char letra = 'A';
        System.out.println("Letra: " + letra);

        // Definindo uma variável do tipo boolean
        boolean ativo = true;
        System.out.println("Ativo: " + ativo);

        // Definindo uma variável do tipo String
        String nome = "João";
        System.out.println("Nome: " + nome);

        // Definindo uma variável do tipo int
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);
        // Ou podemos fazer assim:
        int k= 1, o = 4, j = 70;
        System.out.println(k * o * j);

        // Definindo uma variável do tipo boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // Definindo um tipo Scanner
        // O Scanner é uma classe que permite ler a entrada do usuário
        String user;
        try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite seu nome: "); // Solicita ao usuário que digite seu nomeGg
        user = scan.next(); // Lê a próxima linha de entrada
        System.out.println("Olá " + user + "!");
        }

        // Você pode usar o try-with-resources para garantir que o Scanner seja fechado automaticamente
        // mas pode usar o close() também, no caso aqui seria scan.close(); que é o nome que dei para o Scanner

       


        





        
    }
}
