public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        //   Operador	Nome	        Descrição	                             Exemplo	
        //      +	    Adição	        Soma dois valores	                     x + y	
        //      -	    Subtração	    Subtrai um valor de outro	             x - y	
        //      *	    Multiplicação	Multiplica dois valores	                 x * y	
        //      /	    Divisão	        Divide um valor por outro	             x / y	
        //      %	    Módulo	        Devolve o restante da divisão	         x % y	
        //      ++	    Incremento	    Aumenta o valor de uma variável em 1     ++x	
        //      --	    Diminuição      Diminui o valor de uma variável em 1     --x

        int x = 10;
        int y = 5;
        
        // Adição
        int soma = x + y;
        System.out.println("Soma: " + soma); // 15
        
        // Subtração
        int subtracao = x - y;
        System.out.println("Subtração: " + subtracao); // 5
        
        // Multiplicação
        int multiplicacao = x * y;
        System.out.println("Multiplicação: " + multiplicacao); // 50
        
        // Divisão
        int divisao = x / y;
        System.out.println("Divisão: " + divisao); // 2
        
        // Módulo
        int modulo = x % y;
        System.out.println("Módulo: " + modulo); // 0
        
        // Incremento
        x++;
        System.out.println("Incremento: " + x); // 11
        
        // Diminuição
        y--;
        System.out.println("Diminuição: " + y); // 4

        //Uma lista de todos os operadores de atribuição:

        //      Operador	Exemplo	        Mesma coisa que
        //      =	        x = 5	        x = 5	
        //      +=	        x += 3	        x = x + 3	
        //      -=	        x -= 3	        x = x - 3	
        //      *=	        x *= 3	        x = x * 3	
        //      /=	        x /= 3	        x = x /3	
        //      %=	        x%= 3	        x = x % 3	
        //      &=	        x &= 3	        x = x e 3	
        //      |=	        x |= 3	        x = x | 3	
        //      ^=	        x ^= 3	        x = x ^ 3	
        //      >>=	        x >>= 3	        x = x >> 3	
        //      <<=	        x <<= 3	        x = x << 3

        // Para que cada operdador funcione, é necessário que a variável já tenha um valor atribuído.
        // Caso contrário, o compilador não irá compilar o código.
    }
}
