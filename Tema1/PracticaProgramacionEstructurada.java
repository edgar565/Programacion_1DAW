import java.util.Scanner;

public class PracticaProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;
        int resultadoFinal = 0;
        System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
        int velocidad1 = scanner.nextInt();
        System.out.println("Dime el ataque del primer jugador entre 1 - 200");
        int ataque1 = scanner.nextInt();
        System.out.println("Dime la defensa del primer jugador entre 1 - 200");
        int defensa1 = scanner.nextInt();
        System.out.println("Dime el puntos de vida del primer jugador entre 1 - 200");
        int vida1 = scanner.nextInt();
        while ((velocidad1 + ataque1 + defensa1 + vida1 > 500) || ((velocidad1 > 200) || (velocidad1 < 1)) || ((ataque1 > 200) || (ataque1 < 1)) || ((defensa1 > 200) || (defensa1 < 1)) || ((vida1 > 200) || (vida1 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del primer jugador entre 1 - 200");
            velocidad1 = scanner.nextInt();
            System.out.println("Dime el ataque del primer jugador entre 1 - 200");
            ataque1 = scanner.nextInt();
            System.out.println("Dime la defensa del primer jugador entre 1 - 200");
            defensa1 = scanner.nextInt();
            System.out.println("Dime el puntos de vida del primer jugador entre 1 - 200");
            vida1 = scanner.nextInt();
        }
        System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
        int velocidad2 = scanner.nextInt();
        System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
        int ataque2 = scanner.nextInt();
        System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
        int defensa2 = scanner.nextInt();
        System.out.println("Dime el puntos de vida del segundo jugador entre 1 - 200");
        int vida2 = scanner.nextInt();
        while ((velocidad2 + ataque2 + defensa2 + vida2 > 500) || ((velocidad2 > 200) || (velocidad2 < 1)) || ((ataque2 > 200) || (ataque2 < 1)) || ((defensa2 > 200) || (defensa2 < 1)) || ((vida2 > 200) || (vida2 < 1))) {
            System.out.println("La suma de los valores no puede superar 500 y cada valor no puede superar 200, porfavor vuelva a intertarlo");
            System.out.println("Dime la velocidad del segundo jugador entre 1 - 200");
            velocidad2 = scanner.nextInt();
            System.out.println("Dime el ataque del segundo jugador entre 1 - 200");
            ataque2 = scanner.nextInt();
            System.out.println("Dime la defensa del segundo jugador entre 1 - 200");
            defensa2 = scanner.nextInt();
            System.out.println("Dime el puntos de vida del segundo jugador entre 1 - 200");
            vida2 = scanner.nextInt();
        }
        while (vida1 != 0 && vida2 != 0){
            if (velocidad1 >= velocidad2) {
                System.out.println("Jugador 1 ataca a jugador 2");
                ataque1 = (ataque1 + defensa2) - ataque1;
                defensa2 = ataque1 - defensa2;
                vida2 = vida2 - ataque1;
                System.out.println("Jugador 1 le quita = " + ataque1 + " de vida al jugador 2");
                System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                System.out.println("Jugador 2 = defensa: " +  resultado + " vida: " + vida2);
                System.out.println("JUGADOR 1 HA GANADO LA PARTIDA");
            }else {
                if (velocidad2 > velocidad1) {
                    System.out.println("Jugador 2 ataca a jugador 1");
                    defensa1 = ataque2 - defensa1;
                    vida1 =  - vida1;
                    System.out.println("Jugador 2 le quita = " + vida1 + " de vida al jugador 1");
                    System.out.println("Jugador 1 = defensa: " + defensa1 + " vida: " + vida1);
                    System.out.println("Jugador 2 = defensa: " + defensa2 + " vida: " + vida2);
                }
            }
        }
    }
}