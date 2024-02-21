package Tema4.Polimorfismo.EJ5;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

public class Combate {
    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        combatientes.add(new Mago(100));
        combatientes.add(new Berserker(100));
        combatientes.add(new Druida(50));



    }
}
