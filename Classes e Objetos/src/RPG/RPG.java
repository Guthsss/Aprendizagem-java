package RPG;

import java.util.Random;

public class RPG {
    Random gerador = new Random();
    private String nome;
    private int vida;
    private int defesa;
    private int magia;
    private int forca;
    private int mana;
    private int coordenada_x;
    private int coordenada_y;
    private int coordenada_z;

    public RPG(String nome, int vida, int mana, int coordenada_x, int coordenada_y, int coordenada_z) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.coordenada_z = coordenada_z;
    }
    public void atacar() {
        int dano = gerador.nextInt(0,20);
        if (dano > 10) {
            System.out.println("Ataque realizado!");
        } else {
            System.out.println("Errou ao atacar");
        }
    }
    public void defender() {
        int defesa_realizada = gerador.nextInt(0,20);
        if (defesa_realizada > 10) {
            System.out.println("Defesa realizada");
        } else {
            System.out.println("Errou ao defender -30 de vida");
        }
        this.vida -= 30;
    }
    public void magia() {
        int magia_realizada = gerador.nextInt(0,20);
        if (magia_realizada > 10) {
            System.out.println("Magia realizada - 20 de mana");
        } else {
            System.out.println("Errou ao usar magia");
        }
        this.mana -= 20;
    }
    public void movimentar(int coordenada_x, int coordenada_y, int coordenada_z) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.coordenada_z = coordenada_z;
    }
    public void mostrar_status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
    }
}
