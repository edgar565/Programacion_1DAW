package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lingo {
    static int maxIntentos = 5;
    static String[] palabraJuego;
    static String palabra = "";
    static int contador;
    static String[] palabras;
    static int win = 5;
    static String hintPalabra;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        juego();
    }
    public static void juego(){
        Random random = new Random();
        int aleatorioPalabras = random.nextInt(0,9);
        palabras = new String[]{"HUESO", "LUZCA", "GOLPE", "AMIGO", "VISTA", "CIELO", "DEMON", "FLOTA", "BATIR", "GRANO"};
        System.out.println("¡Bienvenido al juego Lingo!");
        System.out.println("Intenta adivinar la palabra de 5 letras. SUERTE!");
        while (maxIntentos > 0 && win > 0){
            if (contador != 0){
                System.out.println("Try: " + Arrays.toString(palabraArray()));
            }
            System.out.println("Hint: " + Arrays.toString(palabraJuego(palabraHint(aleatorioPalabras),palabraArray())));
            do{
                System.out.println("Porfavor inserte una palabra de 5 letras");
                palabra = scanner.next().toUpperCase();
            }while (palabra.length() != 5);
            palabraHint(aleatorioPalabras);
            palabraArray();
            palabraJuego(palabraHint(aleatorioPalabras),palabraArray());
            maxIntentos--;
        }
        System.out.println("Try: " + Arrays.toString(palabraArray()));
        System.out.println("Hint: " + Arrays.toString(palabraJuego(palabraHint(aleatorioPalabras),palabraArray())));
        System.out.println("¡Felicidades! Has adivinado la palabra.");
    }
    public static String[] palabraHint(int aleatorioPalabras){
        String[] hint = new String[palabra.length()];
        hintPalabra = palabras[aleatorioPalabras];
        for (int x = 0; x < palabra.length(); x++){
            hint[x] = String.valueOf(hintPalabra.charAt(x));
        }
        return hint;
    }
    public static String[] palabraJuego(String[] hint,String[] palabraArray){
        if (contador == 0){
            palabraJuego = new String[5];
            for (int x = 0; x < 5; x++){
                palabraJuego[x] = "-";
                contador++;
            }
        } else {
            win = palabra.length();
            for (int x = 0; x < palabra.length();x++){
                if (hint[x].equals(palabraArray[x])){
                    palabraJuego[x] = palabraArray[x];
                    win--;
                } else if (hintPalabra.contains(palabraArray[x])){
                    palabraJuego[x] = "*";
                }else {
                    palabraJuego[x] = "-";
                }
            }
        }
        return palabraJuego;
    }
    public static String[] palabraArray(){
        String[] palabraArray = new String[palabra.length()];
        for (int x = 0; x < palabra.length(); x++){
            palabraArray[x] = String.valueOf(palabra.charAt(x));
        }
        return palabraArray;
    }
}
