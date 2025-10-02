package RPG;

public class Main {
    public static void main(String[] args) {
        RPG rpg = new RPG("Gregory", 100, 200, 130, 400, 120);

        rpg.mostrar_status();
        rpg.atacar();
        rpg.defender();
        rpg.mostrar_status();
    }
}
