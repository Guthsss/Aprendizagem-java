
/**
 * Uma classe demonstrando múltiplas classes em um único arquivo.
 * <p>
 * A classe {@code MultiplasClasses} fornece métodos para imprimir um rótulo e um nome de usuário.
 * </p>
 */

/**
 * Imprime um rótulo indicando que a saída seguinte é um nome.
 */

/**
 * Imprime o nome de usuário fornecido na saída padrão.
 *
 * @param x o nome de usuário a ser impresso
 */

/**
 * O ponto de entrada do programa.
 * <p>
 * Demonstra o uso da {@code MultiplasClasses} imprimindo um rótulo e um nome de usuário.
 * </p>
 *
 * @param args os argumentos da linha de comando
 */
public class MultiplasClasses {

    public void Mymethod() {
        System.out.print("Meu nome é: ");
    }

    public void Username(String x) {
        System.out.println(x);
    }
}

class second {

    public static void main(String[] args) {

        MultiplasClasses myObj = new MultiplasClasses();

        myObj.Mymethod();
        myObj.Username("Cristovão");

    }
}
