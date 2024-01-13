package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher {
    static String cadena;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Cifrar mensaje\n" +
                "b. Descifrar mensaje");
        String menu = scanner.nextLine().toUpperCase();
        while (menu.equals("A")){
            System.out.println("Dime la cadena para cifrarla");
            cadena = scanner.nextLine().toUpperCase();
            System.out.println(encrypt(cadena));
        }
        while (menu.equals("B")){
            System.out.println("Dime la cadena para descifrarla");
            cadena = scanner.nextLine().toUpperCase();
            System.out.println(decrypt(cadena));
        }
    }
    public static String encrypt(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                charArray[i] = (char) ((ch - base + 1) % 26 + base);
                if (ch == 'Z' || ch == 'z') {
                    charArray[i] = (char) (base);
                }
            } else if (Character.isDigit(ch)) {
                charArray[i] = (char) ((ch - '0' + 1) % 10 + '0');
                if (ch == '9') {
                    charArray[i] = '0';
                }
            }
        }
        return new String(charArray);
    }

    public static String decrypt(String cadena) {
        char[] charArray = cadena.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                charArray[i] = (char) ((ch - base - 1 + 26) % 26 + base);
                if (ch == 'A' || ch == 'a') {
                    charArray[i] = (char) ('Z');
                }
            } else if (Character.isDigit(ch)) {
                charArray[i] = (char) ((ch - '0' - 1 + 10) % 10 + '0');
                if (ch == '0') {
                    charArray[i] = '9';
                }
            }
        }
        return new String(charArray);
    }
}