public class Matématica {
    public static void main(String[] args) {

        
        // O math.max(x, y) retorna o maior valor entre x e y

        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.max(-10.5, -20.5)); // -10.5


        // O math.min(x, y) retorna o menor valor entre x e y

        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.min(-10.5, -20.5)); // -20.5


        // O math.abs(x) retorna o valor absoluto de x

        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.abs(-10.5)); // 10.5
        System.out.println(Math.abs(-1510)); // 1510


        // O math.sqrt(x) retorna a raiz quadrada de x

        System.out.println(Math.sqrt(25)); // 5.0
        System.out.println(Math.sqrt(64)); // 8.0
        System.out.println(Math.sqrt(100)); // 10.0
        System.out.println(Math.sqrt(0)); // 0.0
        System.out.println(Math.sqrt(1)); // 1.0
        System.out.println(Math.sqrt(0.25)); // 0.5
        System.out.println(Math.sqrt(0.0625)); // 0.25


        // O math.cbrt(x) retorna a raiz cúbica de x

        System.out.println(Math.cbrt(27)); // 3.0
        System.out.println(Math.cbrt(64)); // 4.0
        System.out.println(Math.cbrt(125)); // 5.0
        System.out.println(Math.cbrt(0)); // 0.0
        System.out.println(Math.cbrt(1)); // 1.0


        // O math.pow(x, y) retorna x elevado a y

        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.pow(3, 2)); // 9.0
        System.out.println(Math.pow(4, 0.5)); // 2.0
        System.out.println(Math.pow(5, 2)); // 25.0


        // O math.log(x) retorna um número aleatório entre 0 e 1

        System.out.println(Math.random()); 
        System.out.println(Math.random()); 

        // Outro exemplo de uso do math.random()

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum); // 0 to 100
        
        int randomNum2 = (int)(Math.random() * 1001);  // 0 to 1000
        System.out.println(randomNum2); // 0 to 1000


        

    }
}
