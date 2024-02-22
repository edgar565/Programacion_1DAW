package Tema4.Polimorfismo.EJ5;

import java.util.ArrayList;
import java.util.Random;

public class Combate {
    public static void main(String[] args) {
        ArrayList<ICombatiente> combatientes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 2; i++){
            int num = random.nextInt(0,3);
            if (num == 0){
                num = num + 1;
            }else if (num == 3){
                num = num - 1;
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
        System.out.println("¡Comienza la batalla!");
        ICombatiente combatiente = combatientes.get(0);
        System.out.println("El combatiente: " + combatiente.getClass().getSimpleName());
        ICombatiente objetivo = combatientes.get(1);
        System.out.println("Ataca a: " + objetivo.getClass().getSimpleName());
        if (!objetivo.estaVivo()) {
            System.out.println("El combatiente: " + combatiente.getClass().getSimpleName() + " es el vencedor de esta ronda");
            combatientes.remove(objetivo);
        }
        System.out.println("¡La batalla ha terminado!");
    }
}