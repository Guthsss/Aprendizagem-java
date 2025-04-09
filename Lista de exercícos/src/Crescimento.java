
public class Crescimento {
    public static void main(String[] args) {

        //Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e
        //imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

        int anos = 0;
        double Francisco, Sara;

        Francisco = 1.50;
        Sara = 1.10;

        while (Sara <= Francisco) {
            Francisco += 0.02;
            Sara += 0.03;
            anos ++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Sara seja mais alta que Francisco");
    }
}
