public class Enquanto {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("===");

        int j = 0;

        do {
            System.out.println("HelloWorld");
            j++;
        } while (j < 3);

        System.out.println("===");

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
            System.out.println("Happy new year!");

        System.out.println("===");

        int k = 0;

        while (k <= 6) {
            
            if (k < 6) {
                System.out.println("Abacate");
                k ++;
            } else {
                System.out.println("Explodiu o abacate!");
            }
            k = k + 1;
        } // O loop deve continuar até k ser maior que 6, não igual a 6, esse final de {} é do while

        System.out.println("===");

        // Aqui temos o uso de arrays = matrizes, que são listas de valores
        // Exemplo de arrray para nomes de frutas
        // O array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, podendo ser inteiros, strings, etc.

        String[] frutas = {"Banana", "Maçã", "Laranja"}; // Array de frutas, com 3 elementos mas tenho a possibilidade de adicionar mais elementos, ou seja, o array é dinâmico, exemplo: "uva", "pera", "manga", etc.
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
        
    }
}