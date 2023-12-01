package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class AtrapaMoscaMatriz {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] tablero = new int[4][4];
        int moscaX = random.nextInt(0,3); ;
        int moscaY = random.nextInt(0,3);
        tablero[moscaX][moscaY] = 1;
        System.out.println(moscaX);
        System.out.println(moscaY);
        boolean resultado = false;
        while (resultado == false){
            System.out.println("Dime la posición para la X: (0 - 3)");
            int x = scanner.nextInt();
            System.out.println("Dime una posición para la Y: (0 - 3)");
            int y = scanner.nextInt();
            if (tablero[x][y] == 1){
                matriz(tablero);
                ascii();
                resultado = true;
            } else {
                boolean adyacente = false;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (x + i >= 0 && x + i < 4 && y + j >= 0 && y + j < 4 && tablero[x + i][y + j] == 1) {
                            adyacente = true;
                            System.out.println("Has estado cerca");
                        }
                    }
                }
                if (adyacente == true) {
                    int nuevaMoscaX = random.nextInt(0, 3);
                    int nuevaMoscaY = random.nextInt(0, 3);
                    tablero[moscaX][moscaY] = 0;
                    tablero[nuevaMoscaX][nuevaMoscaY] = 1;
                }
            }
        }
    }
    public static void matriz(int[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
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