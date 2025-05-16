/**
 * Uma classe simples que demonstra o uso de construtores com parâmetros.
 * <p>
 * A classe {@code ConstruindoParametros} armazena o nome e a idade de um modelo,
 * e fornece um construtor para inicializar esses campos.
 * </p>
 *
 * <p>
 * Exemplo de uso:
 * <pre>
 *     ConstruindoParametros obj = new ConstruindoParametros(34, "Jonas");
 *     System.out.println(obj.modelName + " tem " + obj.modelAge);
 * </pre>
 * </p>
 *
 * Campos:
 * <ul>
 *   <li>{@code modelName} - o nome do modelo</li>
 *   <li>{@code modelAge} - a idade do modelo</li>
 * </ul>
 *
 * Construtor:
 * <ul>
 *   <li>{@code ConstruindoParametros(int age, String name)} - inicializa a idade e o nome do modelo</li>
 * </ul>
 */
public class ConstruindoParametros {

    String modelName;
    String modelLName;
    int modelAge;


    public ConstruindoParametros (int age, String name, String lname) {
        modelAge = age;
        modelName = name;
        modelLName = lname;
    }
    public static void main(String[] args) {
        
        ConstruindoParametros newObj = new ConstruindoParametros(34, "Jonas", "Eduardo");
        System.out.println(newObj.modelName + " " + newObj.modelLName + " tem " + newObj.modelAge);
    }
}
