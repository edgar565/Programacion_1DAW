package Tema3;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class HundirFlota {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int dificultad = 0;
    static int intentos, barcos, Yfinal, X;
    static int lanchas = 0, acorazados = 0, portaaviones = 0, buques = 0;
    static String[][] tablero, tableroVisible;
    public static void main(String[] args) {
        tablero = new String[][]{{"", " 1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"G", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"H", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"I", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"J", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        tableroVisible = new String[][]{{"", " 1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"G", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"H", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"I", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"J", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        nivelesDificultad();
        crearTablero();
        matriz(tableroVisible);
        int i = 0;
        boolean win = false;
        while (i <= intentos || gameOverWin(win) == false ){
            disparo();
            matriz(tableroVisible);
            i++;
            if (i == intentos){
                System.out.println("ES LA ULTIMA RONDA");
            }
        }
        if (i > intentos){
            System.out.println("HAS PERDIDO");
        }
    }
    public static boolean gameOverWin(boolean win){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if ((!tablero[Yfinal][X].equals("-")) || (!tablero[Yfinal][X].equals("0"))){
                    win = true;
                }
            }
        }
        return win;
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
            System.out.println("Dime el tamaño de X ");
            int tamañoX = scanner.nextInt();
            System.out.println("Dime el tamaño de Y ");
            int tamañoY = scanner.nextInt();
           // crearTableroPersonalizado(tamañoX,tamañoY);
        }
        barcos();
        intentos();
    }
    /*public static void crearTableroPersonalizado(int tamañoX, int tamañoY){
        tablero = new String[tamañoX + 1][tamañoY + 1];
        tableroVisible = new String[tamañoX + 1][tamañoY + 1];
        for (int i = 0; i < tamañoX + 1;i++) {
            for (int j = 1; j < tamañoY + 1; j++) {
                String numeros = String.valueOf(1);
                tablero[i][j] = numeros;
            }
        }
        for (int i = 1; i < tamañoX + 1;i++) {
            for (int j = 1; j < tamañoY + 1; j++) {
                tablero[i][j] = "-";
            }
        }
        for (int i = 0; i < tablero.length;i++){
            for (int j = 0; j < tablero[i].length;j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }*/
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
        System.out.println("Dime la X entre 1 - 10");
        int X = scanner.nextInt();
        while (X < 1 || X > 10){
            System.out.println("Dime la X entre 1 - 10");
            X = scanner.nextInt();
        }
        System.out.println("Dime la Y entre A - J");
        char Y = scanner.next().toUpperCase().charAt(0);
        if (Y < 65 || Y > 74){
            System.out.println("Dime la Y entre A - J");
            Y = scanner.next().toUpperCase().charAt(0);
        }
        int Yfinal = 0;
        switch (Y){
            case 65:
                Yfinal = 1;
                break;
            case 66:
                Yfinal = 2;
                break;
            case 67:
                Yfinal = 3;
                break;
            case 68:
                Yfinal = 4;
                break;
            case 69:
                Yfinal = 5;
                break;
            case 70:
                Yfinal = 6;
                break;
            case 71:
                Yfinal = 7;
                break;
            case 72:
                Yfinal = 8;
                break;
            case 73:
                Yfinal = 9;
                break;
            case 74:
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
            tablero[Yfinal][X] = "0";
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
