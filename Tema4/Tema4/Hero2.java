package Tema4;

import java.util.Random;

public class Hero2 {
    public static Hero enemigo1;
    public static Hero enemigo2;
    public static Hero enemigo3;
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Hero player = new Hero("Jugador1",0,100,100,0,25,30);
        int cantidadEnemigos = aleatorio.nextInt(1,3);
        while (cantidadEnemigos > 0){
            enemigo1 = new Hero();
            cantidadEnemigos--;
            if (cantidadEnemigos == 2){
                enemigo2 = new Hero();
                cantidadEnemigos--;
            }
            if (cantidadEnemigos == 1){
                enemigo3 = new Hero();
                cantidadEnemigos--;
            }
        }
        while(player.health > 0 || (enemigo1.health > 0 && enemigo2.health > 0 && enemigo3.health > 0)){
            player.attack(player,enemigo1);
            enemigo1.attack(enemigo1,player);
            enemigo2.attack(enemigo2,player);
            enemigo3.attack(enemigo3,player);
        }
    }
}