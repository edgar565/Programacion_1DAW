package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class wifiHotelesMatriz {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] hotel = new int[12][5];
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                hotel[i][j] = 0;
            }
        }
        datos(hotel);
    }

    public static void datos(int[][] hotel) {
        System.out.println("Dime el número de la planta de 1 a 12");
        int planta = (scanner.nextInt() - 1);
        while (planta < 1 || planta > 12) {
            System.out.println("Dime el número de la planta de 1 a 12");
            planta = (scanner.nextInt() - 1);
        }
        System.out.println("Dime el número de habitación de 1 a 5");
        int habitacion = (scanner.nextInt() - 1);
        while (habitacion < 1 || habitacion > 5) {
            System.out.println("Dimfalsee el número de habitaciónde 1 a 5");
            habitacion = (scanner.nextInt() - 1);
        }
        System.out.println("Dime la potencia del router de 1 a 6");
        int potenciaRouter = (scanner.nextInt());
        while (potenciaRouter < 1 || potenciaRouter > 6) {
            System.out.println("Dime la potencia del routerde 1 a 6");
            potenciaRouter = (scanner.nextInt());
        }
        cobertura(hotel, planta, habitacion, potenciaRouter);
    }

    public static void cobertura(int[][] hotel, int planta, int habitacion, int potenciaRouter) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                if (i == planta && j == habitacion) {
                    hotel[i][j] = potenciaRouter;
                } else if ((i == planta && j == habitacion - 1) || (i == planta && j == habitacion + 1)) {
                    hotel[i][j] = potenciaRouter - 1;
                } else if ((i == planta && j == habitacion - 2) || (i == planta && j == habitacion + 2)) {
                    hotel[i][j] = potenciaRouter - 2;
                } else if ((i == planta - 1 && j == habitacion) || (i == planta + 1 && j == habitacion)) {
                    hotel[i][j] = potenciaRouter - 1;
                } else if ((i == planta - 1 && j == habitacion + 1) || (i == planta + 1 && j == habitacion + 1) || (i == planta + 1 && j == habitacion - 1) || (i == planta - 1 && j == habitacion - 1)) {
                    hotel[i][j] = potenciaRouter - 2;
                } else if ((i == planta - 2 && j == habitacion) || (i == planta + 2 && j == habitacion)) {
                    hotel[i][j] = potenciaRouter - 2;
                }
            }
        }
        matriz(hotel);
    }

    public static void matriz(int[][] hotel) {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[0].length; j++) {
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }
    }
}