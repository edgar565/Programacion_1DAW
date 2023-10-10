import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(1, 200);
        System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
        int velocidad1 = scanner.nextInt();
        System.out.println("Dime el ataque del primer jugador entre 1 - 200");
        int ataque1 = scanner.nextInt();
        System.out.println("Dime la defensa del primer jugador entre 1 - 200");
        int defensa1 = scanner.nextInt();
        System.out.println("Dime los puntos de vida del primer jugador entre 1 - 200");
        int vida1 = scanner.nextInt();
        System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
        int habilidad1 = scanner.nextInt();
        while ((velocidad1 + ataque1 + defensa1 + vida1 > 500) || ((velocidad1 > 200) || (velocidad1 < 1)) || ((ataque1 > 200) || (ataque1 < 1)) || ((defensa1 > 200) || (defensa1 < 1)) || ((vida1 > 200) || (vida1 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
            velocidad1 = scanner.nextInt();
            System.out.println("Dime el ataque del primer jugador entre 1 - 200");
            ataque1 = scanner.nextInt();
            System.out.println("Dime la defensa del primer jugador entre 1 - 200");
            defensa1 = scanner.nextInt();
            System.out.println("Dime los puntos de vida del primer jugador entre 1 - 200");
            vida1 = scanner.nextInt();
            System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
            habilidad1 = scanner.nextInt();
        }
        System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
        int velocidad2 = scanner.nextInt();
        System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
        int ataque2 = scanner.nextInt();
        System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
        int defensa2 = scanner.nextInt();
        System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
        int vida2 = scanner.nextInt();
        System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
        int habilidad2 = scanner.nextInt();
        while ((velocidad2 + ataque2 + defensa2 + vida2 > 500) || ((velocidad2 > 200) || (velocidad2 < 1)) || ((ataque2 > 200) || (ataque2 < 1)) || ((defensa2 > 200) || (defensa2 < 1)) || ((vida2 > 200) || (vida2 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
            velocidad2 = scanner.nextInt();
            System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
            ataque2 = scanner.nextInt();
            System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
            defensa2 = scanner.nextInt();
            System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
            vida2 = scanner.nextInt();
            System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
            habilidad2 = scanner.nextInt();
        }
        while (vida1 != 0 || vida2 != 0 || vida1 > 0 || vida2 > 0) {
            System.out.println("RONDA 1");
            if (velocidad1 >= velocidad2) {
                System.out.println("Primera ronda: ");
                System.out.println("Jugador 1 ataca a jugador 2");

                switch (habilidad1) {
                    case 1:
                        ataque1 = (((ataque1) / aleatorio) * 3) + aleatorio;
                        ataque1 = (ataque1 + (defensa2) / 2) - ataque1;
                        defensa2 = ataque1 - (defensa2 / 2);
                        vida2 = vida2 - ataque1;
                    case 2:
                        ataque1 = ((ataque1) / aleatorio) + aleatorio;
                        ataque1 = (ataque1 + (defensa2) * 2) - ataque1;
                        defensa2 = ataque1 - ((defensa2) * 2);
                        vida2 = vida2 - ataque1;
                    case 3:
                        ataque1 = ((ataque1) / aleatorio) + aleatorio;
                        ataque1 = (ataque1 + defensa2) - ataque1;
                        defensa2 = ataque1 - defensa2;
                        vida2 = vida2 - ataque1;
                }
                if (velocidad1 >= 100 && ataque1 >= 60) {
                    ataque1 = ((velocidad1 * aleatorio) / 3) + ataque1;
                } else {
                    ataque1 = ((velocidad1 / aleatorio) * 2) - ataque1;
                }
                System.out.println("Jugador 1 le quita = " + ataque1 + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                System.out.println("JUGADOR 1 HA GANADO LA PARTIDA");
            } else {
                if (velocidad2 > velocidad1) {
                    System.out.println("Jugador 2 ataca a jugador 1");
                    ataque2 = ((ataque2) / aleatorio) + aleatorio;
                    ataque2 = (ataque2 + defensa1) - ataque2;
                    defensa1 = ataque2 - defensa1;
                    vida1 = vida1 - ataque2;
                    System.out.println("Jugador 2 le quita = " + ataque2 + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                    System.out.println("JUGADOR 2 HA GANADO LA PARTIDA");
                }
            }
        }
        while (vida1 != 0 || vida2 != 0 || vida1 > 0 || vida2 > 0) {
            System.out.println("RONDA 2");
            if (velocidad1 >= velocidad2) {
                System.out.println("Primera ronda: ");
                System.out.println("Jugador 1 ataca a jugador 2");
                ataque1 = ((ataque1) / aleatorio) + aleatorio;
                ataque1 = (ataque1 + defensa2) - ataque1;
                defensa2 = ataque1 - defensa2;
                vida2 = vida2 - ataque1;
                System.out.println("Jugador 1 le quita = " + ataque1 + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                System.out.println("JUGADOR 1 HA GANADO LA PARTIDA");
            } else {
                if (velocidad2 > velocidad1) {
                    System.out.println("Jugador 2 ataca a jugador 1");
                    ataque2 = ((ataque2) / aleatorio) + aleatorio;
                    ataque2 = (ataque2 + defensa1) - ataque2;
                    defensa1 = ataque2 - defensa1;
                    vida1 = vida1 - ataque2;
                    System.out.println("Jugador 2 le quita = " + ataque2 + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                    System.out.println("JUGADOR 2 HA GANADO LA PARTIDA");
                }
            }
        }
    }
}