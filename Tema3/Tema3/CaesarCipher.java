package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {
     static String cadena;
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Cifrar mensaje\n" +
                "b. Descifrar mensaje");
        String menu = scanner.nextLine().toUpperCase();
        switch (menu){
            case "A":
                System.out.println("Dime la cadena para cifrarla");
                cadena = scanner.nextLine().toUpperCase();
                System.out.println(encrypt(cadena));
                break;
            case "B":
                System.out.println("Dime la cadena para descifrarla");
                cadena = scanner.nextLine().toUpperCase();
                //System.out.println(decrypt(cadena));
                break;
        }

    }
    public static String encrypt(String cadena){
        String[] cadenaAsciiArray = new String[cadena.length()];
        String cadenaEncrypt = "";
        int ascii = 0;
        for (int x = 0; x < cadena.length(); x++) {
            ascii = ((int) cadena.charAt(x)) + 1;
            if (ascii >= 65 && ascii <= 90) {
                cadenaAsciiArray[x] = String.valueOf(ascii);
                if (cadena.charAt(x) == 'Z') {
                    cadenaAsciiArray[x] = "65";
                }
            }else if (!(ascii >= 48 && ascii <= 57)){
                cadenaAsciiArray[x] = String.valueOf(cadena.charAt(x));
            }
        }
        for (int x = 0; x < cadena.length(); x++) {
            ascii = ((int) cadena.charAt(x)) + 1;
            if (ascii >= 48 && ascii <= 57) {
                cadenaAsciiArray[x] = String.valueOf(ascii);
                if (cadena.charAt(x) == '9') {
                    cadenaAsciiArray[x] = "48";
                }
            } else if (!(ascii >= 65 && ascii <= 90)){
                cadenaAsciiArray[x] = String.valueOf(cadena.charAt(x));
            }
        }
        for (int x = 0; x < cadena.length(); x++){
            cadenaAsciiArray[x] = (char) cadenaAsciiArray;
        }
        cadenaEncrypt = String.join(" ",cadenaAsciiArray);
        return cadenaEncrypt;
    }
    /*public static String decrypt(String cadena){


    }*/


}
