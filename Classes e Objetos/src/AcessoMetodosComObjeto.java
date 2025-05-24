/**
 * AcessoMetodosComObjeto demonstra como acessar métodos de uma classe usando um objeto.
 * 
 * Métodos:
 * - MyMethod(): Exibe uma mensagem indicando que a velocidade do carro será mostrada.
 * - MyMethod1(int Speed): Exibe o valor da velocidade passada como argumento.
 * 
 * No método main, um objeto da classe é criado e ambos os métodos são chamados para mostrar
 * como acessar métodos de instância.
 */
public class AcessoMetodosComObjeto {
    
    public void MyMethod() {
        System.out.print("A velocidade do carro em movimento é: ");
    }
    public void MyMethod1(int Speed) {
        System.out.println(Speed);
    }
    public static void main(String[] args) {
        AcessoMetodosComObjeto myObj = new AcessoMetodosComObjeto();

        myObj.MyMethod();
        myObj.MyMethod1(200);
        
    }
}