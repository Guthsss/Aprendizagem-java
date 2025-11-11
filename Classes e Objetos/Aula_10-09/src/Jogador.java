public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private String cpf;
    private double salario;

    public Jogador(String nome, int idade, String posicao, String cpf, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public String getPosicao() {return posicao;}
    public void setPosicao(String posicao) {this.posicao = posicao;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}
