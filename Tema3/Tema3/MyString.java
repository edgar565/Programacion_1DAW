package Tema3;

import java.util.Scanner;

public class MyString {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Función para invertir y poner en mayúsculas una cadena\n" +
                "b. Función para devolver una cadena en vocales\n" +
                "");
        String menu = scanner.next().toUpperCase();
        switch (menu){
            case "A":
                System.out.println("Dame la cadena");
                String cadena1 = scanner.next();
                System.out.println(invertirMayusculas(cadena1));
                break;
            case "B":
                System.out.println("Dame la cadena");
                String cadena2 = scanner.next();
                System.out.println(vocales(cadena2));
                break;
            case "C":




        }
    }
    public static String invertirMayusculas(String cadena1){
        String cadenaInvertida = "";
        for (int x = cadena1.length() - 1; x >= 0; x--){
            cadenaInvertida = cadenaInvertida + cadena1.charAt(x);
        }
        return cadenaInvertida.toUpperCase();
    }
    public static int vocales(String cadena2){
        int vocales = 0;
        cadena2.toUpperCase();
        for (int x = 0; x < cadena2.length(); x++){
        }
        return vocales;
    }
}