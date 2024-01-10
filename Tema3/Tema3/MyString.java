package Tema3;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Función para invertir y poner en mayúsculas una cadena\n" +
                "b. Función para devolver una cadena en vocales\n" +
                "");
        String menu = scanner.next().toUpperCase();
        switch (menu) {
            case "A":
                System.out.println("Dame la cadena");
                String cadena1 = scanner.next();
                System.out.println(invertirMayusculas(cadena1));
                break;
            case "B":
                System.out.println("Dame la cadena");
                String cadena2 = scanner.next();
                System.out.println(contarVocales(cadena2));
                break;
            case "C":
                System.out.println("Dame la cadena");
                String cadena3 = scanner.next();
                System.out.println(mayorLongitud(cadena3));
                break;
            case "D":
            case "E":
                System.out.println("Dame la cadena");
                String cadena4 = scanner.next();
                //System.out.println(contarPalabras(cadena4));
                break;

        }
    }

    public static String invertirMayusculas(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida.toUpperCase();
    }

    public static int contarVocales(String cadena) {
        int vocales = 0;
        cadena = cadena.toUpperCase();
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) == 'A' || cadena.charAt(x) == 'E' || cadena.charAt(x) == 'I' ||cadena.charAt(x) == 'O' || cadena.charAt(x) == 'U') {
                vocales++;
            }
        }
        return vocales;
    }
    public static String mayorLongitud(String cadena) {
        String[] palabra = cadena.split(" ");
        String palabraMasGrande = "";
        for (String palabra : palabra) {
            if (palabra.length() > palabraMasGrande.length()) {
                palabraMasGrande = palabra;
            }
        }
        return palabraMasGrande;
    }

    /*public static int contarPalabras(String cadena) {
        int palabras = cadena.indexOf("");;
        //return cadena.repeat("");
    }*/
}