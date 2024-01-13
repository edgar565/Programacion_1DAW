package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        usuarios();


    }
    public static void usuarios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer ususario introduce una palabra");
        String palabra = scanner.nextLine().toUpperCase();
        System.out.println(Arrays.toString(palabraArray(palabra)));
        System.out.println("Elije una opción: \n" +
                "1. Decir una letra \n" +
                "2. Resolver\n");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:

                break;
            case 2:
                break;
        }
    }
    public static String[] palabra(){

    }
    public static String[] palabraArray (String palabra){
        String[] palabraArray = new String[palabra.length()];
        for (int x = 0; x < palabra.length(); x++){
            palabraArray[x] = String.valueOf(palabra.charAt(x));
        }
        return palabraArray;
    }
    public static boolean[] ahorcado(String palabra){
        boolean[] ahorcadoArray = new boolean[palabra.length()];
        return ahorcadoArray;
    }
}