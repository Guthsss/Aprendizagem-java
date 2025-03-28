public class OperadosLógicos {
    public static void main(String[] args) {
        
//      Operador	Nome	       Descrição	                                                       Exemplo	
//      && 	        Lógico e	   Retorna verdadeiro se ambas as afirmações forem verdadeiras	       x < 5 e x < 10	
//      || 	        Lógico o       Retorna verdadeiro se uma das afirmações for verdadeira	           x < 5 || x < 4	
//      !	        Lógico não     Reverter o resultado, devolve false se o resultado for verdadeiro   !(x < 5 e x < 10)

        int x = 10;
        int y = 5;
        
        // Operador lógico E (&&)
        if (x < 15 && y > 3) {
            System.out.println("Ambas as condições são verdadeiras.");
        } else {
            System.out.println("Pelo menos uma condição é falsa.");
        }
        
        // Operador lógico OU (||)
        if (x < 5 || y > 3) {
            System.out.println("Pelo menos uma condição é verdadeira.");
        } else {
            System.out.println("Ambas as condições são falsas.");
        }
        
        // Operador lógico NÃO (!)
        if (!(x < 5 && y > 3)) {
            System.out.println("A negação da condição é verdadeira.");
        } else {
            System.out.println("A negação da condição é falsa.");
        }
    }
}
