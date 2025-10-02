package Controle_Remoto;

public class Controle_Remoto {
    private int volume;
    private boolean ligado;

    public Controle_Remoto(int volume, boolean ligado) {
        this.volume = volume;
        this.ligado = ligado;
    }
    public void aumentarVolume(int volume) {
        this.volume += volume;
    }
    public void diminurvolume(int volume) {
        this.volume -= volume;
    }
    public void ligar(boolean ligado) {
        if (this.ligado == false) {
            this.ligado = true;
        } else {
            System.out.println("Já está ligado!");
        }
    }
    public void desligar(int ligado) {
        if (this.ligado == true) {
            this.ligado = false;
        } else {
            System.out.println("Já está desligado!");
        }
    }
    public void exibirInfo() {
        System.out.println("Volume: " + this.volume);
        System.out.println("Ligado: " + this.ligado);
    }
}
