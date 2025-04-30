public class MetodoOperadores {
    
    static double operadores (double a, double b, double c, double d) {

        return ((a * b) / (c - d));
    }
    static int operadores1 (int x, int y, int z) {

        return ((x) *  (y + z));
    }

    public static void main(String[] args) {
        
        double resuldado = operadores(2, 30, 100, 60);

        System.out.println("O resultado da multiplicação é " + resuldado);

        int resultado1 = operadores1(20, 2, 3);

        System.out.println("O resultado da soma é " + resultado1);
    }
}
