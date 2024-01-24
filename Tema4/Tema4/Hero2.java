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
        int oleadas = 0;
        do {
            int huir = aleatorio.nextInt(1,100);
            int escapadoEnemigo = 0;
            for (int x = 0; x < enemigos.length; x++) {
                if (huir < 10){
                    System.out.println("Lo has logrado has escapado");
                    escapadoEnemigo++;
                }
            }
            oleadas++;
            do {
                System.out.println("Oleada: " + oleadas);
                for (int x = 0; x < enemigos.length - escapadoEnemigo; x++) {
                    player.attack(enemigos[x]);
                }
                for (int x = 0; x < enemigos.length - escapadoEnemigo; x++) {
                    enemigos[x].attack(player);
                }
                salud = enemigos.length - escapadoEnemigo;
                for (int x = 0; x < enemigos.length - escapadoEnemigo; x++) {
                    if (enemigos[x].getHealth() > 0){
                        salud--;
                    }else {
                        salud++;
                    }
                }
            }while (salud > 0);
            int encontrarPocion = aleatorio.nextInt(1,100);
            if (encontrarPocion < 10){
                System.out.println("Has encontrado la poción, vas a recuperar la vida");
                player.health = player.getMaxHealth();
            }
            int descansar = aleatorio.nextInt(1,100);
            if (descansar < 1){
                System.out.println("Ja puedes descansar y recuperas la vida");
                player.health = player.getMaxHealth();
            }
        }while (player.getHealth() > 0);
        System.out.println("HAS SOBREVIVIDO: " + oleadas + " hordas");
    }
}