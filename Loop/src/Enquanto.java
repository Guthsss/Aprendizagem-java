public class Enquanto {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //

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
        }   
    }
}