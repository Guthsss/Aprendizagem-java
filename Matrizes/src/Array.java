

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

        String[] marcas = {"LG", "NVIDEA", "AMD", "GEFORCE", "ASUS"}; // Usando um loop "for" tradicional
        System.out.println(marcas.length);
        for (int i = 0; i < marcas.length; i ++) { // Aqui podemos alterar até onde o for percorrera se colocarmos que ele precisa ser < 4 por exemplo ele mostrara até "Geforce" ou podemos colocar <= aí irá mostrar até "Asus"
            System.out.println(marcas[i]); // Como também podemos usar i< marcas.length que seria 5 pois é o número de termos dentro da array
        }

        System.out.println("===");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // Usando um loop for-each (mais simples e legível)
        for (String i : cars) {
        System.out.println(i); // Aqui ele aparecera todos os elementos em cada linha, para junta-los apensa precisa remover o print>ln<.
        }
    }
}
