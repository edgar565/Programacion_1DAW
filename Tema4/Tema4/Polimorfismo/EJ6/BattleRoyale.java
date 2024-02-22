package Tema4.Polimorfismo.EJ6;

import Tema4.Polimorfismo.EJ5.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++){
            int num;
            if (i % 2 == 0) {
                 num= random.nextInt(0,3);
            } else {
                num = random.nextInt(0,3);
            }
            switch (num){
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
        while (combatientes.size() > 1) {
            Collections.shuffle(combatientes);
            for (int i = 0; i < combatientes.size() - 1; i++) {
                ICombatiente combatiente = combatientes.get(i);
                System.out.println("El combatiente: " + combatiente.getClass().getSimpleName());
                ICombatiente objetivo = combatientes.get(i + 1);
                System.out.println("Ataca a: " + objetivo.getClass().getSimpleName());
                if (combatiente.estaVivo()) {
                    Ataque ataque = combatiente.atacar();
                    objetivo.defender(ataque);
                    if (!objetivo.estaVivo()) {
                        System.out.println("El combatiente: " + combatiente.getClass().getSimpleName() + " es el vencedor de esta ronda");
                        combatientes.remove(objetivo);
                    }
                }
            }
        }
        ICombatiente ganador = combatientes.get(0);
        System.out.println("¡El vencedor del Battle Royale es: " + ganador.getClass().getSimpleName() + "!");
    }
}