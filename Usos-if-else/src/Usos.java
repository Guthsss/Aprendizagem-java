public class Usos {
    public static void main(String[] args) {
        
        if (20 > 10) {
            System.out.println("20 é maior que 10");
        } else {    // Observação: o else é opcional pois no caso está sendo utilizado apenas o if e o código está morto
            System.out.println("20 não é maior que 10");
        }

        int x = 50;
        int y = 20;
        if (x > y) {
            System.out.println("X é maior que Y");
        } else if (x < y) {
            System.out.println("X é menor que Y");
        } else {
            System.out.println("X é igual a Y");
        }

        int time = 20;
        String result = (time < 18) ? "Bom dia." : "Boa noite.";
        System.out.println(result);
    }
}


