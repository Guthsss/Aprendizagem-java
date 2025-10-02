package Controle_Remoto;

public class Main {
    public static void main(String[] args) {
        Controle_Remoto c = new Controle_Remoto(20, true);

        c.exibirInfo();
        c.aumentarVolume(20);
        c.exibirInfo();
    }
}
