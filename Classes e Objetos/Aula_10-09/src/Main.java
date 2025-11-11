public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rafael", 20, "Atacante", "123.456.789-00", 10000);
        Jogador jogador2 = new Jogador("Pedro", 20, "Atacante", "123.456.789-00", 10000);
        Time time1 = new Time("1983");

        time1.escalarJogador(jogador1);
        time1.escalarJogador(jogador2);
        time1.escalarJogador(jogador1);
        time1.aumentarSalario(jogador1, 1234);
        time1.vertime();

        time1 = null;
        
    }
}