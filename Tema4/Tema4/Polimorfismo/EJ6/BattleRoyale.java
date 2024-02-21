package Tema4.Polimorfismo.EJ6;

import Tema4.Polimorfismo.EJ5.*;

import java.util.ArrayList;
import java.util.Collections;

public class BattleRoyale {
    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            switch ((int) (Math.random() * 3)){
                case 0:
                    combatientes.add(new Mago(100));
                    break;
                case 1:
                    combatientes.add(new Berserker(100));
                    break;
                case 2:
                    combatientes.add(new Druida(100));
                    break;
            }
        }
        System.out.println("¡Comienza el Battle Royale!");

    }
}