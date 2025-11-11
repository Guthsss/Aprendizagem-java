import java.util.ArrayList;
import java.util.Random;

public class Time {
    private String nome;
    private String anoFundacao;
    private int vitorias;
    private int derrotas;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Time(String anoFundacao) {this.anoFundacao = anoFundacao;}
    public void escalarJogador(Jogador jogador) {
        if (listaJogadores.contains(jogador)){
            System.out.println("Jogador já está no time.");
        } else {
            this.listaJogadores.add(jogador);
        }
    }
    public void aumentarSalario(Jogador jogador, double valor) {
        if (listaJogadores.contains(jogador)) {
            jogador.setSalario(jogador.getSalario() + valor);
        } else {
            System.out.println("Jogador não está no time");
        }
    }
    public void jogar() {
        Random random = new Random();
        int valor = random.nextInt(0,1);
        if (valor == 0) {
            this.vitorias++;
        } else {
            this.derrotas++;
        }
    }
    public void vertime() {
        for (Jogador j : listaJogadores) {
            System.out.println(j.getNome() + " - " + j.getSalario());
        }
    }
}
