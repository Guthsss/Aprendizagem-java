

public class VariosParametros {
    
    static void meuMetodo(String nome, String sobrenome, int idade) {  // Este método recebe um nome, sobrenome e idade, e imprime uma mensagem formatada.
        System.out.println(nome + " " + sobrenome + " tem " + idade + " anos.");
    }
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
      
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        meuMetodo("Fulano", "da Silva", 29); // Fulano da Silva tem 29 anos.
        meuMetodo("Alberto", "Gilicon", 45); // Alberto Gilicon tem 45 anos.

        // Observe que quando você está trabalhando com vários parâmetros, a chamada do método deve ter o mesmo número de argumentos que existem parâmetros, e os argumentos devem ser passados na mesma ordem.

        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1); // Soma de 8 + 5.
        System.out.println("double: " + myNum2); // Soma de 4.3 + 6.23.
      }
    }

    // Escopo Java.

    // Um bloco de código pode existir por si só ou pode pertencer a um if, while ou for declaração. No caso de for extratos, variáveis declaradas no próprio extrato também estão disponíveis dentro do escopo do bloco.
