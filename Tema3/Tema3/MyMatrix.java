package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz2 = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
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
            System.out.println(printMatriz(matriz2));
        } else if (menu.equals("b")) {
            System.out.println("Función que devuelve el máximo del array");
            System.out.println(maxMatriz(matriz1));
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
            System.out.println(("Función para sumar los arrays"));
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
        public static int[][] matriz () {
            matriz1 = new int[3][3];
            System.out.println("Dime los " + (matriz1.length * matriz1.length) + " valores para el array");
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
        public static int maxMatriz ( int[][] matriz1){
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
    }
}