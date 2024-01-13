package Tema3;

import java.util.Arrays;
import java.util.Scanner;
public class HangmanGame {
    static Scanner scanner = new Scanner(System.in);
    static int contador = 0;
    static boolean win = false;
    static boolean resuelta = false;
    static int intentos = 6;
    static String palabra;
    static String[] palabraJuego;
    public static void main(String[] args) {
        juego();
    }
    public static void juego() {
        System.out.println("¡Bienvenido al juego del ahorcado!\n" +
                "¡Adivina la palabra!");
        System.out.println("");
        System.out.print("Primer ususario introduce una palabra:  ");
        palabra = scanner.nextLine().toUpperCase();
        palabraArray();
        limpiar();
        ahorcado();
        System.out.println(Arrays.toString(palabraJuego()));
        while (win == false && resuelta == false) {
            System.out.println("Elije una opción: \n" +
                    "1. Decir una letra \n" +
                    "2. Resolver\n");
            int opcion = scanner.nextInt();
            if (opcion == 1){
                palabraJuego();
            }
            if (opcion == 2){
                resolver();
            }
        }
        if (win == false || resuelta == false){
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
        } else if (intentos == 0) {
            System.out.println("¡Lo siento! Te has quedado sin intentos. La palabra era: " + palabra);
        }
    }
    public static boolean resolver(){
        resuelta = false;
        System.out.println("Dime la palabra resuelta");
        String palabraResuelta = scanner.next().toUpperCase();
        if (palabraResuelta.equals(palabra)){
            resuelta = true;
        }else {
            System.out.println("¡Lo siento! No es esa palabra sigue intentando");
            intentos--;
            ahorcado();
        }
        return resuelta;
    }
    public static boolean winGame (){
        win = false;
        int contador = palabra.length();
        for (int x = 0; x < palabra.length(); x++){
            if (!palabraJuego[x].equals(" _ ")){
                contador--;
            } else {
                win = false;
            }
        }
        if (contador <= 0){
            win = true;
        }
        return win;
    }
    public static String[] palabraJuego(){
        if (contador == 0){
            palabraJuego = new String[palabra.length()];
            for (int x = 0; x < palabra.length(); x++){
                palabraJuego[x] = " _ ";
                contador++;
            }
        } else {
            System.out.println("Dime la letra");
            String letra = scanner.next().toUpperCase();
            int noEsta = palabra.length();
            for (int x = 0; x < palabra.length(); x++) {
                if (palabraArray()[x].equals(letra)) {
                    palabraJuego[x] = letra;
                } else{
                    noEsta--;
                }
            }
            if (noEsta <= 0){
                intentos--;
            }
            ahorcado();
            System.out.println(Arrays.toString(palabraJuego));
        }
        winGame();
        return palabraJuego;
    }
    public static String[] palabraArray (){
        String[] palabraArray = new String[palabra.length()];
        for (int x = 0; x < palabra.length(); x++){
            palabraArray[x] = String.valueOf(palabra.charAt(x));
        }
        return palabraArray;
    }
    public static void ahorcado() {
        System.out.println("\nIntentos restantes: " + intentos);
        if (intentos == 6){
            System.out.println("  +---+");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
        } else if (intentos == 5) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println("      |");
            System.out.println("      |");
        } else if (intentos == 4) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println("  |   |");
            System.out.println("      |");
        } else if (intentos == 3) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println(" /|   |");
            System.out.println("      |");
        } else if (intentos == 2) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println("      |");
        } else if (intentos == 1) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" /    |");
        } else if (intentos == 0) {
            System.out.println("  +---+");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" / \\  |");
        }
    }
    private static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}