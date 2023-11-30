package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz2 = new int[][]{{10, 21, 32},{43, 54,65}, {76, 87, 98}};
        int[][] matriz1 = new int[0][0];
        System.out.println(Arrays.deepToString(matriz2));
        System.out.println("Elige entre una de las siguientes opciones: \n" +
                "a. Procedimiento para imprimir la matriz\n" +
                "b. Función que devuelve el máximo de la matriz\n" +
                "c. Función que devuelve el mínimo de la matriz\n" +
                "d. Función que devuelve la media\n" +
                "e. Función para saber si un elemento está en la matriz\n" +
                "f. Función para saber cuantas veces hay un elemento en una matriz\n" +
                "g. Función para sumar las matrices\n" +
                "h. Función para restar las matrices\n" +
                "i. Función para comprobar si es la matriz unidad\n");
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
        } else if (menu.equals("e")) {
            System.out.println(("Función para saber si existe un elemento en la matriz"));
            System.out.println(Arrays.deepToString(matriz2));
            System.out.println((existeMatriz(matriz2)));
        } else if (menu.equals("f")) {
            System.out.println("Función para saber cuantas veces hay un elemento está en la matriz");
            System.out.println(Arrays.deepToString(matriz2));
            System.out.println("El elemento esta: " + existenciasMatriz(matriz2) + " veces");
        } else if (menu.equals("g")) {
            System.out.println("Función para suma de las matrices");
            matriz1 = matriz();
            System.out.println(Arrays.deepToString(matriz1));
            System.out.println(Arrays.deepToString(matriz2));
            System.out.println("El resultado de la suma es: ");
            System.out.println(Arrays.deepToString(sumMatrices(matriz1, matriz2)));
        } else if (menu.equals("h")) {
            System.out.println("Función para restar las matrices");
            matriz1 = matriz();
            System.out.println(Arrays.deepToString(matriz1));
            System.out.println(Arrays.deepToString(matriz2));
            System.out.println("El resultado de la resta es: ");
            System.out.println(Arrays.deepToString(retMatrices(matriz1, matriz2)));
        } else if (menu.equals("i")) {
            System.out.println("Función para comprobar que es la matriz unidad");
            matriz1 = matriz();
            System.out.println(Arrays.deepToString(matriz1));
            System.out.println("El resultado es: ");
            System.out.println((matrizUnidad(matriz1)));
        }
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
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
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
            for (int j = 0; j < matriz1[i].length; j++) {
                suma += matriz1[i][j];
                contador++;
            }
        }

        return suma / contador;
    }
    public static boolean existeMatriz(int [][] matriz2){
        int exElement = 0;
        System.out.println("Dime el número que quieres comprobar");
        int element = scanner.nextInt();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (element == matriz2[i][j]) {
                    exElement = 1;
                }
            }
        }
        return (exElement == 1);
    }
    public static int existenciasMatriz(int [][] matriz2){
        int exElement = 0;
        System.out.println("Dime el número que quieres comprobar");
        int element = scanner.nextInt();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (element == matriz2[i][j]) {
                    exElement++;
                }
            }
        }
        return exElement;
    }
    public static int[][] sumMatrices(int[][] matriz1, int[][] matriz2){
        int[][] sumMatriz = new int[matriz1.length][matriz1.length];
        if (matriz1.length == matriz2.length){
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    int suma = matriz1[i][j] + matriz2[i][j];
                    sumMatriz[i][j] = suma;
                }
            }
        } else {
            System.out.println("No se pueden sumar las matrices no son iguales");
        }
        return sumMatriz;
    }
    public static int[][] retMatrices(int[][] matriz1, int[][] matriz2){
        int[][] restMatriz = new int[matriz1.length][matriz1.length];
        if (matriz1.length == matriz2.length){
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    int suma = matriz1[i][j] - matriz2[i][j];
                    restMatriz[i][j] = suma;
                }
            }
        } else {
            System.out.println("No se pueden restar las matrices no son iguales");
        }
        return restMatriz;
    }
    public static boolean matrizUnidad(int[][] matriz1) {
        boolean largo = false;
        boolean diagonal = false;

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i][i] == 1) {
                diagonal = true;
            }
            if (matriz1.length == matriz1[0].length){
                largo = true;
            }
        }
        return (largo && diagonal);
    }
}