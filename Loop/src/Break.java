public class Break {
    public static void main(String[] args) {
        
        for (int i = 0; i <=10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        int i = 0;

        System.out.println("===");

        while (i < 10) {
            System.out.println(i);
            i ++;
            if (i == 4) {
                break;
            }            
        }
    }
}
