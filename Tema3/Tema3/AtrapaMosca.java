package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AtrapaMosca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int posicionMosca = random.nextInt(1, 15);
        int[] mosca = new int[15];
        mosca[posicionMosca] = 1;
        System.out.println(Arrays.toString(mosca));
        System.out.println(posicionMosca);
        System.out.println("Dime una posición entre 1 y 15");
        int posicion = scanner.nextInt();
        while (posicion < 1 || posicion > 15){
            System.out.println("Incorrecto, dime una posición entre 1 y 15");
            posicion = scanner.nextInt();
        }
        if (posicionMosca == posicion - 1){
            System.out.println(
                    "  _   _    _    ____       _  _____ ____      _    ____   _    ____   ___    _        _      __  __  ___  ____   ____    _    \n" +
                    " | | | |  / \\  / ___|     / \\|_   _|  _ \\    / \\  |  _ \\ / \\  |  _ \\ / _ \\  | |      / \\    |  \\/  |/ _ \\/ ___| / ___|  / \\   \n" +
                    " | |_| | / _ \\ \\___ \\    / _ \\ | | | |_) |  / _ \\ | |_) / _ \\ | | | | | | | | |     / _ \\   | |\\/| | | | \\___ \\| |     / _ \\  \n" +
                    " |  _  |/ ___ \\ ___) |  / ___ \\| | |  _ <  / ___ \\|  __/ ___ \\| |_| | |_| | | |___ / ___ \\  | |  | | |_| |___) | |___ / ___ \\ \n" +
                    " |_| |_/_/   \\_\\____/  /_/   \\_\\_| |_| \\_\\/_/   \\_\\_| /_/   \\_\\____/ \\___/  |_____/_/   \\_\\ |_|  |_|\\___/|____/ \\____/_/   \\_\\\n");
        } else {
            while ((posicion - 2) || (posicion + 1))

            }
        }
    }
}
