package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz2 = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] matriz1 = new int[0][0];
        System.out.println(Arrays.deepToString(matriz2));
        System.out.println("Elige entre una de las siguientes opciones: \n" +
                "a. Procedimiento para imprimir la matriz\n" +
                "b. Función que devuelve el máximo de la matriz\n" +
                "c. Función que devuelve el mínimo de la matriz\n" +
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
            printMatriz(matriz2);
        } else if (menu.equals("b")) {
            matriz1 = matriz();
            System.out.println("Función que devuelve el máximo del array");
            System.out.println(Arrays.deepToString(matriz1));
            System.out.println("El maximo es: " + maxMatriz(matriz1));
        } else if (menu.equals("c")) {
            matriz1 = matriz();
            System.out.println("Función que devuelve el mínimo del array");
            System.out.println(Arrays.deepToString(matriz1));
            System.out.println("El minimo es: " + minMatriz(matriz1));
        } else if (menu.equals("d")) {
            System.out.println("Función que devuelve la media");
            System.out.println(Arrays.toString(matriz2));
            System.out.println(medMatriz(matriz1));
        } /*else if (menu.equals("e")) {
            System.out.println("Función para saber si un elemento está en el array");
            System.out.println(Arrays.toString(matriz2));
            System.out.println(existeArray(matriz2));
        } else if (menu.equals("f")) {
            System.out.println(("Función para sumar los arrays"));
            matriz1 = matriz();
            System.out.println(Arrays.toString(matriz1));
            System.out.println(Arrays.toString(matriz2));
            System.out.println(Arrays.toString(sumVecArray(matriz1, matriz2)));
        } else if (menu.equals("g")) {
            System.out.println("Función para restar los arrays");
            matriz1 = matriz();
            System.out.println(Arrays.toString(matriz1));
            System.out.println(Arrays.toString(matriz2));
            System.out.println(Arrays.toString(restVecArray(matriz1, matriz2)));
        } else if (menu.equals("h")) {
            System.out.println("Función para realizar el producto de los arrays");
            matriz1 = matriz();
            System.out.println(Arrays.toString(matriz1));
            System.out.println(Arrays.toString(matriz2));
            System.out.println((prodEscaVecArray(matriz1, matriz2)));
        } else if (menu.equals("i")) {
            System.out.println("Función para invertir el orden del array");
            System.out.println(Arrays.toString(inveArray(matriz2)));
        } else if (menu.equals("j")) {
            System.out.println("Procedimiento para invertir el orden del array");
            int[] arrayInver = new int[matriz1.length];
            System.out.println(Arrays.toString(matriz1));
            System.out.println(Arrays.toString(arrayInver));
        } else if (menu.equals("k")) {
            System.out.println("Función para saber si el array1 es capicua");
            System.out.println(capicuaArray(matriz1));
        }*/
    }
    public static int[][] matriz() {
        int[][] matriz1 = new int[3][3];
        System.out.println("Dime los " + (matriz1.length * matriz1.length) + " valores para la matriz");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Dime el valor (" + i + "," + j + "): ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        return matriz1;
    }
    public static void printMatriz(int[][] matriz2) {
        System.out.println((Arrays.deepToString(matriz2)));
    }
    public static int maxMatriz(int[][] matriz1){
        int maximo = matriz1[0][0];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] > maximo) {
                    maximo = matriz1[i][j];
                }
            }
        }
        return maximo;
    }
    public static int minMatriz(int[][] matriz1){
        int minimo = matriz1[0][0];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] < minimo) {
                    minimo = matriz1[i][j];
                }
            }
        }
        return minimo;
    }
    public static int medMatriz(int[][] matriz1) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i][j]; j++) {
                suma += matriz1[i][j];
                contador++;
            }
        }

        return suma / contador;
    }
}
