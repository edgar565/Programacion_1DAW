package Tema4.Polimorfismo.EJ5;

import java.util.ArrayList;

public class Combate {
    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        combatientes.add(new Mago(100));
        combatientes.add(new Berserker(100));
        combatientes.add(new Druida(50));
        System.out.println("¡Comienza la batalla!");
        while (algunoVivo(combatientes)) {
            for (ICombatiente combatiente : combatientes) {
                if (combatiente.estaVivo()) {
                    Ataque ataque = combatiente.atacar();
                    for (ICombatiente objetivo : combatientes) {
                        if (objetivo != combatiente && objetivo.estaVivo()) {
                            objetivo.defender(ataque);
                        }
                    }
                }
            }
        }
        System.out.println("¡La batalla ha terminado!");
    }
    private static boolean algunoVivo(ArrayList<ICombatiente> combatientes) {
        boolean vivo = false;
        for (ICombatiente combatiente : combatientes) {
            if (combatiente.estaVivo()) {
                vivo = true;
                break;
            }
        }
        return vivo;
    }
}