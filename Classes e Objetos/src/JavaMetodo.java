public class JavaMetodo {
    /**
     * A static method that prints a predefined message to the standard output.
     * This method can be called without creating an instance of the class.
     */
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
        myStaticMethod(); // Chama o método estático;

        JavaMetodo myObj = new JavaMetodo(); // Criou um método JavaMetodo();
        myObj.myPublicMethod(); // Chama o método público por objeto;
    }
}