package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {

    public static void tablaMutiplicar(int num){
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número entre 1 y 10");
        int num = scanner.nextInt();
        tablaMutiplicar(num);
    }
}
