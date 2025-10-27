package InfosPessoais;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void atualizarEndereco(Endereco novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String obterCep() {
        return endereco.getCep();
    }
}
