package AtividadeEmSala;

public class Vendedor extends Pessoa {
    private String matricula;

    public String getMatricula() {return matricula;
    }

    public Vendedor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;


    }
}
