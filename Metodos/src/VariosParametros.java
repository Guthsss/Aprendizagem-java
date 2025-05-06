

public class VariosParametros {
    
    static void meuMetodo(String nome, String sobrenome, int idade) {  // Este método recebe um nome, sobrenome e idade, e imprime uma mensagem formatada.
        System.out.println(nome + " " + sobrenome + " tem " + idade + " anos.");
    }

    public static void main(String[] args) {
        meuMetodo("Fulano", "da Silva", 29); // Fulano da Silva tem 29 anos.
        meuMetodo("Alberto", "Gilicon", 45); // Alberto Gilicon tem 45 anos.

        // Observe que quando você está trabalhando com vários parâmetros, a chamada do método deve ter o mesmo número de argumentos que existem parâmetros, e os argumentos devem ser passados na mesma ordem.


    }
}
