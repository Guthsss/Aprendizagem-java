public class TiposString {
    public static void main(String[] args) {
        
        // Definindo uma string
        String nome = "João da Silva";
        System.out.println("Nome: " + nome);



        // Definindo uma string com caixa alta e caixa baixa

        String nomeCaixa = "Gregory";
        System.out.println("Nome em caixa alta: " + nomeCaixa.toUpperCase());
        System.out.println("Nome em caixa baixa: " + nomeCaixa.toLowerCase());



        // Definindo uma string para dizer onde está a palavra "locate"
        // A função indexOf retorna a posição da primeira ocorrência da palavra "locate"

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7



        // Deifinindo uma string usando concatenação

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // Ou Podemos usar o método concat()

        System.out.println(firstName.concat(lastName)); // mas aqui não tem espaço entre os nomes
        System.out.println(firstName.concat(" ").concat(lastName)); // aqui tem espaço entre os nomes



        // Definindo uma string, somando as duas variáveis e atribuindo a uma nova variável
        // Aqui ele não soma os números, ele concatena eles, ou seja, ele transforma os números em string e depois concatena

        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)

        System.out.println(z); // Outputs 1020 // aqui ele concatena os dois números, mas não soma eles

        // Como também podemos fazer assim:

        String w = "10";
        int h = 20;
        String i = h + w;  // z will be 1020 (a String)
        
        System.out.println(i); // Outputs 2010 // aqui ele soma os dois números, mas não concatena eles



        String texto = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        System.out.println("Texto: " + texto); // Outputs We are the so-called "Vikings" from the north.
        // Aqui ele usa a barra invertida para escapar as aspas duplas, ou seja, ele não considera as aspas duplas como o fim da string, mas sim como parte da string

        // Outro exemplo mas com aspas simples

        String textinho = "It\'s alright.";
        System.out.println("Texto: " + textinho); // Outputs It's alright.
        // Aqui ele usa a barra invertida para escapar as aspas simples, ou seja, ele não considera as aspas simples como o fim da string, mas sim como parte da string

        // Outro exemplo mas com barra invertida

        String textinho2 = "The character \\ is called backslash.";
        System.out.println("Texto: " + textinho2); // Outputs The character \ is called backslash.
        // Aqui ele usa a barra invertida para escapar a barra invertida, ou seja, ele não considera a barra invertida como o fim da string, mas sim como parte da string

        //      \n	    Nova Linha	
        //      \r	    Carruagem Retorno	
        //      \t	    Tabulação	
        //      \b	    Backspace	
        //      \f	    Forma Alimentação












    }
}

