package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array2 = new int[]{6, 10, 4, 14, 6, 1, 9, 5, 7,2};
        System.out.println("Elige entre una de las siguientes opciones: \n" +
                "a. Procedimiento para imprimir el array\n" +
                "b. Función que devuelve el máximo del array\n" +
                "c. Función que devuelve el mínimo del array\n" +
                "d. Función que devuelve la media\n" +
                "e. Función para saber si un elemento está en el array\n" +
                "f. Función para sumar los arrays\n" +
                "g. Función para restar los arrays\n" +
                "h. Función para realizar el producto escalar de los arrays\n" +
                "i. Función para invertir el orden del array1\n" +
                "j. Procedimiento para invertir el orden del array1\n" +
                "k. Función para saber si el array1 es capicua\n");
        String menu = scanner.next();

        if (menu.equals("a")) {
            printArrray(array2);
        } else if (menu.equals("b")) {
            System.out.println("Función que devuelve el máximo del array");
            System.out.println(Arrays.toString(array2));
            System.out.println(maxArray(array2));
        } else if (menu.equals("c")) {
            System.out.println("Función que devuelve el mínimo del array");
            System.out.println(Arrays.toString(array2));
            System.out.println(minArray(array2));
        } else if (menu.equals("d")) {
            System.out.println("Función que devuelve la media");
            System.out.println(Arrays.toString(array2));
            System.out.println(medArray(array2));
        } else if (menu.equals("e")) {
            System.out.println("Función para saber si un elemento está en el array");
            System.out.println(Arrays.toString(array2));
            System.out.println(existeArray(array2));
        } else if (menu.equals("f")) {
            System.out.println("Función para sumar los arrays");
            int[] array1 = Array();
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(sumVecArray(array1, array2)));
        } else if (menu.equals("g")) {
            System.out.println("Función para restar los arrays");
            int[] array1 = Array();
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(restVecArray(array1, array2)));
        } else if (menu.equals("h")) {
            System.out.println("Función para realizar el producto de los arrays");
            int[] array1 = Array();
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            System.out.println((prodEscaVecArray(array1, array2)));
        } else if (menu.equals("i")) {
            System.out.println("Función para invertir el orden del array");
            System.out.println(Arrays.toString(inveArray(array2)));
        } else if (menu.equals("j")) {
            System.out.println("Procedimiento para invertir el orden del array");
            int[] array1 = Array();
            int[] arrayInver = new int[array1.length];
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(arrayInver));
        } else if (menu.equals("k")){
            System.out.println("Función para saber si el array1 es capicua");
            int[] array1 = Array();
            System.out.println(capicuaArray(array1));
        }
    }
    public static int[] Array(){
        int[] array1 = new int[10];
        System.out.println("Dime los " + array1.length + " valores para el array");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Dime el valor");
            array1[i] = scanner.nextInt();
        }
        return array1;
    }
    public static void printArrray(int[] array1) {
        int[] printArray = array1.clone();
        System.out.println(Arrays.toString(printArray));
    }
    public static int maxArray(int[] array1) {
        int maximo = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > maximo) {
                maximo = array1[i];
            }
        }
        return maximo;
    }
    public static int minArray(int[] array1) {
        int minimo = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minimo) {
                minimo = array1[i];
            }
        }
        return minimo;
    }
    public static int medArray(int[] array1) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
            suma += array1[i];
            contador++;
        }
        return suma / contador;
    }
    public static boolean existeArray(int[] array1) {
        int exElement = 0;
        System.out.println("Dime el número que quieres comprobar");
        int element = scanner.nextInt();
        for (int i = 0; i < array1.length; i++) {
            if (element == array1[i]) {
                exElement = 1;
            }
        }
        return (exElement == 1);
    }
    public static int[] sumVecArray(int[] array1, int[] array2) {
        int[] sumArray = new int[9];
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                int suma = array1[i] + array2[i];
                sumArray[i] = suma;
            }
        } else {
            System.out.println("No se pueden sumar los arrays no son iguales");
        }
        return sumArray;
    }
    public static int[] restVecArray(int[] array1, int[] array2) {
        int[] restArray = new int[9];
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                int resta = array1[i] - array2[i];
                restArray[i] = resta;
            }
        } else {
            System.out.println("No se puede hacer la resta de los arrays no son iguales");
        }
        return restArray;
    }
    public static int prodEscaVecArray(int[] array1, int[] array2) {
        int result = 0;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                int prod = array1[i] * array2[i];
                result += prod;
            }
        } else {
            System.out.println("No se puede hacer el producto de los arrays no son iguales");
        }
        return result;
    }
    public static int[] inveArray(int[] array1){
        int contador = array1.length - 1;
        System.out.print(Arrays.toString(array1));
        System.out.println("Array invertido");
        int[] inverArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            inverArray[contador] += array1[i];
            contador--;
        }
        return inverArray;
    }
    public static void invertirArray(int[] array1, int[] arrayInver){
        int contador = array1.length - 1;
        for (int i = 0; i < array1.length; i++) {
            arrayInver[contador] = array1[i];
            contador--;
        }
    }
    public static boolean capicuaArray(int[] array1){
        int result = 0;
        int contador = array1.length / 2;
        if (array1.length % 2 != 0){
            result++;
        }
        int[] capicua = array1.clone();
        for (int i = contador, x = contador - 1; i < array1.length; i++, x--) {
            if (capicua[i] != capicua[x]){
                result++;
            }
        }
        return (result == 0);
    }
}