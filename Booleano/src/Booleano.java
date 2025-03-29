public class Booleano {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        System.out.println(x < y); // true
        System.out.println(x > y); // false
        System.out.println(x <= y); // true
        System.out.println(x >= y); // false
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x < y && x != y); // true
        System.out.println(x < y || x != y); // true
        System.out.println(!(x < y)); // false

        int idade = 46;
        int idadeMinima = 18;

        System.out.println(idade >= idadeMinima); // true
        System.out.println(idade < idadeMinima); // false
        System.out.println(idade == idadeMinima); // false
        System.out.println(idade != idadeMinima); // true
        System.out.println(idade <= idadeMinima); // false
        System.out.println(idade >= idadeMinima && idade != idadeMinima); // true
        System.out.println(idade >= idadeMinima || idade != idadeMinima); // true
        System.out.println(!(idade >= idadeMinima)); // false
        System.out.println(!(idade < idadeMinima)); // true
    }
}