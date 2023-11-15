package Tema3;

import java.util.Scanner;

public class MyArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] array = new int[]{23,56,2,8,44,33};
        System.out.println(array);
        System.out.println("Elige entre una de las siguientes opciones: \n" +
                "a. Función que devuelve el máximo del array\n" +
                "b. Función que devuelve el mínimo del array\n" +
                "c. Función que devuelve la media\n" +
                "d. Función para saber si un elemento está en el array\n");
        String menu = scanner.next();
        if (menu.equals("a")){
            System.out.println("Función que devuelve el máximo del array");
            System.out.println(maxArray(array));
        } else if (menu.equals("b")) {
            System.out.println("Función que devuelve el mínimo del array");
            System.out.println(minArray(array));
        } else if (menu.equals("c")) {
            System.out.println("Función que devuelve la media");
            System.out.println(medArray(array));
        } else if (menu.equals("d")){
            System.out.println("Función para saber si un elemento está en el array");
            System.out.println(existeArray(array));
        } else if (menu.equals("e")) {

        } else if (menu.equals("f")) {

        } else if (menu.equals("g")) {

        } else if (menu.equals("h")) {

        }
    }
    public static double maxArray(int[] array){
        int maximo = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
    public static double minArray(int[] array){
        int minimo = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
    public static double medArray (int[] array){
        double suma = 0;
        double contador = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i]; 
            contador++;
        }
        return suma / contador;
    }
    public static boolean existeArray(int[] array){
        boolean exElement= false;
        System.out.println("Dime el número que quieres comprobar");
        int element = scanner.nextInt();
        for (int i = 1; i < array.length; i++){
            if (element == array[i]){
                exElement = true;
            }
        }
        return exElement;
    }
    public static double sumVecArray(int[] array){

    }
    public static double resVecArray(int[] array){

    }
    public static double prodVecArray(int[] array){

    }
}
