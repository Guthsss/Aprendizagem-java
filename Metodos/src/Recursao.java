public class Recursao {
    public static void main(String[] args) {
        int result = sum(10); // Chama o método recursivo sum com o valor inicial 10
        System.out.println(result); // Exibe o resultado no console
      }
      public static int sum(int k) {
        if (k > 0) { // Condição base: verifica se k é maior que 0
          return k + sum(k - 1); // Chama o método sum novamente com k - 1
        } else {
    
          return 0; // Caso base: quando k <= 0, retorna 0
        }
    }
}
    
