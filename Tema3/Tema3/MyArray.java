package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int [] array2 = new int[] {6,10,4,14,6,1,9,5,7};
        int[] array = new int[9];
        System.out.println("Dime los 9 valores para el array");
        for (int i = 0; i < 9; i++){
            System.out.println("Dime el valor");
            array[i] = scanner.nextInt();
        }
        System.out.println("Elige entre una de las siguientes opciones: \n" +
                "a. Función para imprimir el array\n" +
                "b. Función que devuelve el máximo del array\n" +
                "c. Función que devuelve el mínimo del array\n" +
                "d. Función que devuelve la media\n" +
                "e. Función para saber si un elemento está en el array\n");
        String menu = scanner.next();
        if (menu.equals("a")){
            printArrray(array);
        } else if (menu.equals("b")) {
            System.out.println("Función que devuelve el máximo del array");
            System.out.println(maxArray(array));
        } else if (menu.equals("c")) {
            System.out.println("Función que devuelve el mínimo del array");
            System.out.println(minArray(array));
        } else if (menu.equals("d")){
            System.out.println("Función que devuelve la media");
            System.out.println(medArray(array));
        } else if (menu.equals("e")) {
            System.out.println("Función para saber si un elemento está en el array");
            System.out.println(existeArray(array));
        } else if (menu.equals("f")) {
            System.out.println(Arrays.toString(sumVecArray(array, array2)));

        } else if (menu.equals("g")) {

        } else if (menu.equals("h")) {

        }
    }
    public static void printArrray(int [] array){
        int[] printArray = array.clone();
        System.out.println(Arrays.toString(printArray));
    }
    public static int maxArray(int[] array){
        int maximo = array[0];
        for (int i =0; i < array.length; i++){
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
    public static int minArray(int[] array){
        int minimo = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
    public static int medArray (int[] array){
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i]; 
            contador++;
        }
        return suma / contador;
    }
    public static boolean existeArray(int[] array){
        int exElement = 0;
        System.out.println("Dime el número que quieres comprobar");
        int element = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (element == array[i]){
                exElement = 1;
            }
        }
        return (exElement == 1);
    }
    public static int[] sumVecArray(int[] array, int[] array2){
        int[] sumArray = new int[9];
        for (int i = 0; i < array.length; i++) {
            int suma = array[i] + array2[i];
            sumArray[i] = suma;
        }
        return sumArray;
    }/*
    public static double resVecArray(int[] array){

    }
    public static double prodVecArray(int[] array){

    }*/
}
