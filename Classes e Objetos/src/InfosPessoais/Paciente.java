package InfosPessoais;

public class Paciente {
    private String nome;
    private PlanoSaude planoSaude;

    public Paciente(String nome, PlanoSaude planoSaude) {
        this.nome = nome;
        this.planoSaude = planoSaude;
    }

    public String getNome() {
        return nome;
    }
}
