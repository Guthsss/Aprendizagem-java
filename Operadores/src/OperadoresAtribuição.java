public class OperadoresAtribuição {
    public static void main(String[] args) {
        
        //      Uma lista de todos os operadores de atribuição:

        //      Operador	Exemplo	        Mesma coisa que
        //      =	        x = 5	        x = 5	
        //      +=	        x += 3	        x = x + 3	
        //      -=	        x -= 3	        x = x - 3	
        //      *=	        x *= 3	        x = x * 3	
        //      /=	        x /= 3	        x = x /3	
        //      %=	        x %= 3	        x = x % 3	
        //      &=	        x &= 3	        x = x e 3	
        //      |=	        x |= 3	        x = x | 3	
        //      ^=	        x ^= 3	        x = x ^ 3	
        //      >>=	        x >>= 3	        x = x >> 3	
        //      <<=	        x <<= 3	        x = x << 3

        // Para que cada operdador funcione, é necessário que a variável já tenha um valor atribuído.
        // Caso contrário, o compilador não irá compilar o código.

        // Exemplo de uso dos operadores de atribuição:

        int x = 10;
        int y = 5;
        System.out.println("Valor inicial de x: " + x); // 10
        System.out.println("Valor inicial de y: " + y); // 5

        // Atribuição simples
        x = 20;
        System.out.println("Valor de x após atribuição simples: " + x); // 20

        // Atribuição com adição
        x += 5; // x = x + 5
        System.out.println("Valor de x após adição: " + x); // 25

        // Atribuição com subtração
        x -= 10; // x = x - 10
        System.out.println("Valor de x após subtração: " + x); // 15

        // Atribuição com multiplicação
        x *= 2; // x = x * 2
        System.out.println("Valor de x após multiplicação: " + x); // 30

        // Atribuição com divisão
        x /= 3; // x = x / 3
        System.out.println("Valor de x após divisão: " + x); // 10

        // Atribuição com módulo
        x %= 3; // x = x % 3
        System.out.println("Valor de x após módulo: " + x); // 1



       

    }
}
