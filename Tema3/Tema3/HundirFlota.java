package Tema3;

import com.sun.source.tree.WhileLoopTree;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class HundirFlota {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int dificultad = 0;
    static int intentos, barcos;
    static int lanchas = 0, acorazados = 0, portaaviones = 0, buques = 0;
    static String[][] tablero, tableroVisible;
    public static void main(String[] args) {
        tablero = new String[][]{{"", " 1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"G", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"H", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"I", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"J", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        tableroVisible = new String[][]{{"", " 1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"G", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"H", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"I", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"J", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        nivelesDificultad();
        crearTablero();
        int i = 0;
        while (i < intentos){
            matriz(tableroVisible);
            disparo();
            matriz(tableroVisible);
            i++;
        }
    }
    public static void gameOverWin(){

    }
    public static void intentos() {
        switch (dificultad) {
            case 1:
                intentos = 50;
                break;
            case 2:
                intentos = 30;
                break;
            case 3:
                intentos = 10;
                break;
            case 4:
                System.out.println("Dime el número de intentos");
                intentos = scanner.nextInt();
                break;
        }
    }

    public static void barcos() {
        switch (dificultad) {
            case 1:
                lanchas = 5;
                buques = 3;
                acorazados = 1;
                portaaviones = 1;
                break;
            case 2:
                lanchas = 2;
                buques = 1;
                acorazados = 1;
                portaaviones = 1;
                break;
            case 3:
                lanchas = 1;
                buques = 1;
                break;
            case 4:
                do {
                    System.out.println("Dime el numero de barcos de cada tipo:\n" +
                            "1. Lanchas\n" +
                            "2. Buque\n" +
                            "3. Acorazado\n" +
                            "4. Portaaviones\n" +
                            "5. YA ESTÁ\n");
                    barcos = scanner.nextInt();
                } while (barcos != 5);
                switch (barcos) {
                    case 1:
                        System.out.println("Dime cuantas lanchas quieres poner");
                        lanchas = scanner.nextInt();
                        break;
                    case 2:
                        System.out.println("Dime cuantos buques quieres poner");
                        buques = scanner.nextInt();
                        break;
                    case 3:
                        System.out.println("Dime cuantos acorazados quieres poner");
                        acorazados = scanner.nextInt();
                        break;
                    case 4:
                        System.out.println("Dime cuantos portaaviones quieres poner");
                        portaaviones = scanner.nextInt();
                        break;
                }
                break;
        }
    }

    public static void nivelesDificultad() {
        do {
            System.out.println("Dime la dificultad a la que quieres jugar:\n" +
                    "1. Fácil=  10 barcos; 50 intentos\n" +
                    "2. Medio=   5 barcos; 30 intentos\n" +
                    "3. Difícil= 2 barcos; 10 intentos\n" +
                    "4. Personalizado\n");
            dificultad = scanner.nextInt();
        } while (dificultad < 1 || dificultad > 4);
        if (dificultad == 4) {
            System.out.println("Dime el tamaño del tablero ej: x 10 e y 10");
            System.out.println("Dime el tamaño de X");
            int tamañoX = scanner.nextInt();
            System.out.println("Dime el tamaño de Y");
            int tamañoY = scanner.nextInt();
        }
        barcos();
        intentos();
    }
    public static void crearTablero() {
        ponerLanchas();
        ponerBuques();
        ponerAcorazados();
        ponerPortaaviones();
    }
    public static void ponerLanchas(){
        int i = 0;
        while (i < lanchas) {
            int aleatorioY = random.nextInt(1, 10);
            int aleatorioX = random.nextInt(1, 10);
            if (tablero[aleatorioY][aleatorioX].equals("-")) {
                tablero[aleatorioY][aleatorioX] = "L";
                i++;
            }
        }
    }
    public static void ponerBuques(){
        int i = 0;
        while (i < buques) {
            int aleatorioY = random.nextInt(1, 10);
            int aleatorioX = random.nextInt(1, 8);
            if (tablero[aleatorioY][aleatorioX].equals("-") && tablero[aleatorioY][aleatorioX + 1].equals("-") && tablero[aleatorioY][aleatorioX + 2].equals("-")) {
                tablero[aleatorioY][aleatorioX] = "B";
                tablero[aleatorioY][aleatorioX + 1] = "B";
                tablero[aleatorioY][aleatorioX + 2] = "B";
                i++;
            }
        }
    }
    public static void ponerAcorazados(){
        int i = 0;
        while (i < acorazados) {
            int aleatorioY = random.nextInt(1, 10);
            int aleatorioX = random.nextInt(1, 7);
            if (tablero[aleatorioY][aleatorioX].equals("-") && tablero[aleatorioY][aleatorioX + 1].equals("-") && tablero[aleatorioY][aleatorioX + 2].equals("-") && tablero[aleatorioY][aleatorioX + 3].equals("-")) {
                tablero[aleatorioY][aleatorioX] = "Z";
                tablero[aleatorioY][aleatorioX + 1] = "Z";
                tablero[aleatorioY][aleatorioX + 2] = "Z";
                tablero[aleatorioY][aleatorioX + 3] = "Z";
                i++;
            }
        }
    }
    public static void ponerPortaaviones(){
        int i = 0;
        while (i < portaaviones) {
            int aleatorioY = random.nextInt(1, 7);
            int aleatorioX = random.nextInt(1, 10);
            if (tablero[aleatorioY][aleatorioX].equals("-") && tablero[aleatorioY + 1][aleatorioX].equals("-") && tablero[aleatorioY + 2][aleatorioX].equals("-") && tablero[aleatorioY + 3][aleatorioX].equals("-")) {
                tablero[aleatorioY][aleatorioX] = "P";
                tablero[aleatorioY + 1][aleatorioX] = "P";
                tablero[aleatorioY + 2][aleatorioX] = "P";
                tablero[aleatorioY + 3][aleatorioX] = "P";
                i++;
            }
        }
    }
    public static void disparo(){
        System.out.println("Dime donde quieres disparar");
        System.out.println("Dime la X entre 0 - 10");
        int X = scanner.nextInt();
        System.out.println("Dime la Y entre A - J");
        String Y = scanner.next();
        int Yfinal = 0;
        switch (Y){
            case "A":
                Yfinal = 1;
                break;
            case "B":
                Yfinal = 2;
                break;
            case "C":
                Yfinal = 3;
                break;
            case "D":
                Yfinal = 4;
                break;
            case "E":
                Yfinal = 5;
                break;
            case "F":
                Yfinal = 6;
                break;
            case "G":
                Yfinal = 7;
                break;
            case "H":
                Yfinal = 8;
                break;
            case "I":
                Yfinal = 9;
                break;
            case "J":
                Yfinal = 10;
                break;
        }
        juego(X,Yfinal);
    }
    public static void juego(int X, int Yfinal) {
        if (tablero[Yfinal][X].equals("-")){
            tableroVisible[Yfinal][X] = "A";
        } else if ((tablero[Yfinal][X].equals("L")) || (tablero[Yfinal][X].equals("B")) || (tablero[Yfinal][X].equals("Z")) || (tablero[Yfinal][X].equals("P"))) {
            tableroVisible[Yfinal][X] = "X";
        }
    }
    public static void matriz(String[][] tableroVisible) {
        for (int i = 0; i < tableroVisible.length; i++) {
            for (int j = 0; j < tableroVisible[0].length; j++) {
                System.out.print(tableroVisible[i][j] + " ");
            }
            System.out.println();
        }
    }
}
