package Tema3;

import java.util.Scanner;

public class MyString {
   static String cadena;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Función para invertir y poner en mayúsculas una cadena\n" +
                "b. Función para devolver una cadena en vocales\n" +
                "c. Función para devolver la palabra de mayor longitud\n" +
                "d. Función para devolver el número de veces que la segunda cadena está incluida\n" +
                "e. Función para devolver el numero de palabras que contiene\n" +
                "f. Función para devolver el número de teléfono en formato\n" +
                "g. Procedimiento para que se muestre el histograma de vocales");
        String menu = scanner.nextLine().toUpperCase();
        System.out.println("Dame la cadena");
        switch (menu) {
            case "A":
                cadena = scanner.nextLine();
                System.out.println(invertirMayusculas(cadena));
                break;
            case "B":
                 cadena = scanner.nextLine();
                System.out.println(contarVocales(cadena));
                break;
            case "C":
                cadena = scanner.nextLine();
                System.out.println(mayorLongitud(cadena));
                break;
            case "D":
                cadena = scanner.nextLine();
                System.out.println("Dime otra cadena");
                String cadena2 = scanner.nextLine();
                System.out.println(numeroVecesIncluida(cadena,cadena2));
                break;
            case "E":
                cadena = scanner.nextLine();
                System.out.println(contarPalabras(cadena));
                break;
            case "F":
                cadena = scanner.nextLine();
                System.out.println(numeroTel(cadena));
                break;
            case "G":
                cadena = scanner.nextLine();
                histograma(cadena);
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
        for (String x : palabra) {
            if (x.length() > palabraMasGrande.length()) {
                palabraMasGrande = x;
            }
        }
        return palabraMasGrande;
    }
    public static int numeroVecesIncluida(String cadena, String cadena2){
        int veces = 0;
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.startsWith(cadena2,x)){
                veces++;
            }
        }
        return veces;
    }
    public static int contarPalabras(String cadena) {
        cadena.trim();
        int palabras = 0;
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) == ' ') {
                palabras++;
            }
        }
        return palabras + 1;
    }
    public static String numeroTel(String cadena){
        if (cadena.length() == 11){
            cadena = String.format("(+%s)-%s-%s", cadena.substring(0,2), cadena.substring(3,6), cadena.substring(7,11));
        }else {
            cadena = "Número incorrecto";
        }
        return cadena;
    }
    public static void histograma(String cadena){
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        cadena = cadena.toUpperCase();
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) == 'A') {
                a++;
            }if (cadena.charAt(x) == 'E') {
                e++;
            }if (cadena.charAt(x) == 'I') {
                i++;
            }if (cadena.charAt(x) == 'O') {
                o++;
            }if (cadena.charAt(x) == 'U') {
                u++;
            }
        }
        System.out.println("Repeticiones de vocales:\n" +
                "a " + a + "\n" +
                "e " + e + "\n" +
                "i " + i + "\n" +
                "o " + o + "\n" +
                "u " + u);
    }
}