public class InverterString {
    public static void main(String[] args) {
        
        String nome = "Gregory";
        String sobrenome = "Guths";
        String a;

        a = nome;
        nome = sobrenome;
        sobrenome = a;

        System.out.println(sobrenome + " " + nome);
    }
}
