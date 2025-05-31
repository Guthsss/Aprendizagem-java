public class Main {
    public static void main(String[] args) {
        // Example 1: ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = new int[3];
            numbers[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        }

        // Example 3: NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        }

        // Example 4: Custom Exception
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        // Example 5: Multiple catch blocks
        try {
            int[] arr = new int[5];
            arr[10] = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic error: " + e.getMessage());
        }

        // Example 6: Try-with-resources
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

/*Tratamento de exceções
E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução try permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução catch permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução finally permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave try e catch vêm em pares:
 */
