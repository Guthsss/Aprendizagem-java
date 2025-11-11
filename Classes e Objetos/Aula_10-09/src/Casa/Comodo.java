package Casa;

public class Comodo {
    private String nome;
    private String cor;
    private double tamanho;

    public Comodo(String nome, String cor, double tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String getNome() {return nome;}
    public String getCor() {return cor;}
    public double getTamanho() {return tamanho;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCor(String cor) {this.cor = cor;}
    public void setTamanho(double tamanho) {this.tamanho = tamanho;}
}
