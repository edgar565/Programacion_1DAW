package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtrapaMoscaArray {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int posicion = 0;
    public static void main(String[] args){
        int posicionMosca = random.nextInt(1, 15);
        int[] mosca = new int[15];
        mosca[posicionMosca] = 1;
        System.out.println(Arrays.toString(mosca));
        System.out.println("Dime una posición entre 1 y 15");
        juego(posicionMosca, mosca);
    }
    public static int posicionJugador(){
        posicion = scanner.nextInt();
        while (posicion < 1 || posicion > 15){
            System.out.println("Incorrecto, dime una posición entre 1 y 15");
            posicion = scanner.nextInt();
        }

        return posicion;
    }
    public static void juego(int posicionMosca, int[] mosca){
        boolean victoria = false;
        while (!victoria) {
            posicionJugador();
            if (posicionMosca == posicion){
                victoria = true;
                ascii();
            } else if (posicion == posicionMosca - 1 || posicion == posicionMosca + 1) {
                mosca[posicionMosca] = 0;
                posicionMosca = random.nextInt(1, 15);
                mosca[posicionMosca] = 1;
                System.out.println("Estás cerca");
            } else {
                System.out.println("Esta muy lejos");
            }
        }
    }
    public static void ascii() {
        System.out.println(
                        "  _   _    _    ____       _  _____ ____      _    ____   _    ____   ___    _        _      __  __  ___  ____   ____    _    \n" +
                        " | | | |  / \\  / ___|     / \\|_   _|  _ \\    / \\  |  _ \\ / \\  |  _ \\ / _ \\  | |      / \\    |  \\/  |/ _ \\/ ___| / ___|  / \\   \n" +
                        " | |_| | / _ \\ \\___ \\    / _ \\ | | | |_) |  / _ \\ | |_) / _ \\ | | | | | | | | |     / _ \\   | |\\/| | | | \\___ \\| |     / _ \\  \n" +
                        " |  _  |/ ___ \\ ___) |  / ___ \\| | |  _ <  / ___ \\|  __/ ___ \\| |_| | |_| | | |___ / ___ \\  | |  | | |_| |___) | |___ / ___ \\ \n" +
                        " |_| |_/_/   \\_\\____/  /_/   \\_\\_| |_| \\_\\/_/   \\_\\_| /_/   \\_\\____/ \\___/  |_____/_/   \\_\\ |_|  |_|\\___/|____/ \\____/_/   \\_\\\n");

    }
}
