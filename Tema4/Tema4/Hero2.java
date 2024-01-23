package Tema4;

import java.util.Random;

public class Hero2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Hero player = new Hero("Jugador1", 0, 100, 100, 0, 25, 30);
        int cantidadEnemigos = aleatorio.nextInt(1, 3);
        Hero[] enemigos = new Hero[cantidadEnemigos];
        for (int x = 0; x < enemigos.length; x++) {
            enemigos[x] = new Hero();
        }
        int salud;
        do {
            int oleadas = 0;
            do {
                System.out.println("Oleada: " + oleadas);
                for (int x = 0; x < enemigos.length; x++) {
                    player.attack(enemigos[x]);
                }
                for (int x = 0; x < enemigos.length; x++) {
                    enemigos[x].attack(player);
                }
                salud = enemigos.length;
                for (int x = 0; x < enemigos.length; x++) {
                    if (enemigos[x].getHealth() > 0){
                        salud--;
                    }else {
                        salud++;
                    }
                }
            }while (salud > 0);
            oleadas++;
        }while (player.getHealth() > 0);

    }
}