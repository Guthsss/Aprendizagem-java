package Casa;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private String cor;
    private ArrayList<Comodo> listaComodos = new ArrayList<>();

    public Casa(String endereco, String cor) {
        this.endereco = endereco;
        this.cor = cor;
    }
    public void adicionarComodo(String nome, String cor, double tamanho) {
        Comodo novoComodo = new Comodo(nome, cor, tamanho);
        this.listaComodos.add(novoComodo);
    }
    public void mostrarComodos() {
        for (Comodo c : this.listaComodos) {
            System.out.println(c.getNome() + " - " +  c.getCor() + " - " +  c.getTamanho());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCor() {
        return cor;
    }
}
