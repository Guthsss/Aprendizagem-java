public class MédiaIdades {
    public static void main(String[] args) {
        
        int ages[] = {50, 26, 28, 75, 48, 26, 87, 70}; // O array ages contém as idades: {20, 22, 18, 35, 48, 26, 87, 70}.

        float avg, sum = 0; // sum: Armazena a soma de todas as idades. avg: Armazena a média das idades.
        
        int length = ages.length; // int length = ages.length; obtém o número de elementos no array, que é 8.
        
        for (int age : ages) { // O loop for (int age : ages) percorre cada elemento do array ages.
          sum += age; // A cada iteração, o valor de age é somado à variável sum
        }
        
        avg = sum / length;  // A média é calculada dividindo a soma total (sum) pelo número de elementos (length):
        
        System.out.println("A média das udades é: " + avg);


        
        int anos[] = {20, 22, 18, 35, 48, 26, 87, 70}; // Armazena as idades na array

       
        int lengthh = anos.length; // Obtem o número de elementos da array 

        int lowestAge = anos[0]; //  // Criar uma variável para armazenar a menor idade e inicializá-la com o primeiro elemento do array

        for (int ano : anos) { // Percorrer os elementos do array para encontrar a menor idade
     
        if (lowestAge > ano) { // Verificar se o elemento atual é menor que o valor armazenado em 'lowestAge'
          
        lowestAge = ano; // Atualizar 'lowestAge' com o valor menor encontrado
        }
        }
        System.out.println("A menor idade é: " + lowestAge);
    }
}
