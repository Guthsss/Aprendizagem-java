public class MetodoSoma {
    
    static int soma(int a, int b , int c, int d) {

        return ((a + b) + (a + b));
    }

    public static void main(String[] args) {
        
        int resultado = soma (40, 20, 10, 30);

        System.out.println("O resultado da soma é: " + resultado);
    }
}
