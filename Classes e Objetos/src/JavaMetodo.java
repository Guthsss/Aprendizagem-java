public class JavaMetodo {
    // Método estático
    static void myStaticMethod() {
        System.out.print("Hello ");
    }

    // Método público
    public void myPublicMethod() {
        System.out.print("World");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Chama o método estático

        JavaMetodo myObj = new JavaMetodo(); // Criou um método JavaMetodo();
        myObj.myPublicMethod(); // Chama o método público por objeto;
    }
}