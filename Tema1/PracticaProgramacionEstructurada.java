import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(1, 200);
        int aleatorioHabilidad = random.nextInt(1, 3);
        System.out.println("Elige el tipo de personaje=    1: Personalizado    2: Predeterminado ");
        int tipo = scanner.nextInt();
        int velocidad1 = 0;
        int ataque1 = 0;
        int defensa1 = 0;
        int vida1 = 0;
        int velocidad2 = 0;
        int ataque2 = 0;
        int defensa2 = 0;
        int vida2 = 0;
        int velocidad3 = 0;
        int ataque3 = 0;
        int defensa3 = 0;
        int vida3 = 0;
        int velocidad4 = 0;
        int ataque4 = 0;
        int defensa4 = 0;
        int vida4 = 0;
        switch (tipo) {
            case 1:
                System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
                velocidad1 = scanner.nextInt();
                System.out.println("Dime el ataque del primer jugador entre 1 - 200");
                ataque1 = scanner.nextInt();
                System.out.println("Dime la defensa del primer jugador entre 1 - 200");
                defensa1 = scanner.nextInt();
                System.out.println("Dime los puntos de vida del primer jugador entre 1 - 200");
                vida1 = scanner.nextInt();
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
                velocidad2 = scanner.nextInt();
                System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
                ataque2 = scanner.nextInt();
                System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
                defensa2 = scanner.nextInt();
                System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
                vida2 = scanner.nextInt();
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
            case 2:
                System.out.println("El primer jugador tiene estas caracteristicas:");
                System.out.println("La velocidad del primer jugador es de 100");
                velocidad3 = 100;
                System.out.println("El ataque del primer jugador es de 100");
                ataque3 = 100;
                System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
                defensa3 = 100;
                System.out.println("Dime los puntos de vida del segundo jugador entre 1 - 200");
                vida3 = 200;
                System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
                int habilidad3 = aleatorioHabilidad;
                System.out.println("El segundo jugador tiene estas caracteristicas:");
                System.out.println("La velocidad del segundo jugador es de 100");
                velocidad4 = 100;
                System.out.println("El ataque del segundo jugador es de 100");
                ataque4 = 100;
                System.out.println("La defensa del segundo jugador es de 100");
                defensa4 = 100;
                System.out.println("La vida del segundo jugador es de 200");
                vida4 = 200;
                System.out.println("Escoge una de estas tres habilidades: 1 FURIA, 2 DOBLE-DEFENSA o 3 AFILAR.");
                int habilidad4 = aleatorioHabilidad;
        }
        while (vida1 != 0 || vida2 != 0 || vida1 > 0 || vida2 > 0){

        }
    }
}








            /*
        while (vida1 != 0 || vida2 != 0 || vida1 > 0 || vida2 > 0) {
            System.out.println("RONDA 1");
            if (velocidad1 >= velocidad2) {
                System.out.println("Primera ronda: ");
                System.out.println("Jugador 1 ataca a jugador 2");
                System.out.println("Jugador 1 le quita = " + ataque1 + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                System.out.println("JUGADOR 1 HA GANADO LA PARTIDA");
            } else {
                if (velocidad2 > velocidad1) {
                    System.out.println("Jugador 2 ataca a jugador 1");
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
                System.out.println("Jugador 1 le quita = " + ataque1 + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                System.out.println("JUGADOR 1 HA GANADO LA PARTIDA");
            } else {
                if (velocidad2 > velocidad1) {
                    System.out.println("Jugador 2 ataca a jugador 1");
                    System.out.println("Jugador 2 le quita = " + ataque2 + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                    System.out.println("JUGADOR 2 HA GANADO LA PARTIDA");
                }
            }
        }
    }
}