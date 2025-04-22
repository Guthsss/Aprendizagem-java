
public class Array {
    public static void main(String[] args) {

        String[] nomes = {"Gregory ", "Guilherme", "Alastor", "Kaique", "Pedro"}; 
        System.out.print(nomes[0]); // O código  imprime o primeiro elemento do array nomes, que é "Gregory ". 
        nomes[0] = "Guths"; // Após isso, o valor do índice 0 do array é alterado para "Guths", e o novo valor é impresso na linha seguinte.
        System.out.println(nomes[0]);
        
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(num[1] + num[3]); // Aqui é efetuado as soma do segundo valor e quarto valor da array (lembrando que a array começa em 0).
        num[0] = 7; // Aqui eu altero o valor da array [0] de 1 para 7.
        System.out.println(num[0] - num[2]); // É efetuado a subtrção da array[0] que foi alterada e a array[2].

        System.out.println("===");

        String[] marcas = {"LG", "NVIDEA", "AMD", "GEFORCE", "ASUS"}; // Usando um loop "for" tradicional.
        System.out.println(marcas.length); // Mostra quantos termos a array possui.
        for (int i = 0; i < marcas.length; i ++) { // Aqui podemos alterar até onde o for percorrera se colocarmos que ele precisa ser < 4 por exemplo ele mostrara até "Geforce" ou podemos colocar <= aí irá mostrar até "Asus"
            System.out.println(marcas[i]); // Como também podemos usar i< marcas.length que seria 5 pois é o número de termos dentro da array.
        }

        System.out.println("===");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // Usando um loop for-each (mais simples e legível).
        for (String i : cars) {
        System.out.println(i); // Aqui ele aparecera todos os elementos em cada linha, para junta-los apensa precisa remover o print>ln<.
        }

        System.out.println("===");
    
        // Arrays bidimencionais

        int[][] bidimencionais = {{1, 3, 5}, {8, 10, 11}};
        System.out.println(bidimencionais[0][2]); // 0 seria a primeira array com termos e 2 seria o terceiro termo da primeira array.

        bidimencionais[0][1] = 9; // Podemos mudar os termos da array, um exempo foi que mudei de 3 para 9.
        System.out.println(bidimencionais[0][1]);

        System.out.println("===");

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) { // myNumbers.length retorna o número de linhas na matriz (neste caso, 2).
        for (int j = 0; j < myNumbers[i].length; ++j) { // myNumbers[i].length retorna o número de colunas na linha i.
        System.out.println(myNumbers[i][j]);

        System.out.println("===");

        // Como também podemos usar este jeito, que é considerado mais fácil de ler e escrever.

        int[][] meusNumeros = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : meusNumeros) { // Loop externo percorre as linha da array.
          for (int p : row) { // Loop interno percorre os elementos de cada linha;
            System.out.println(p);
          }
        }
      }
    }
  }
}
