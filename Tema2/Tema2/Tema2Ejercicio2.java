package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static boolean isAdult( int age){
        boolean adult = false;
        if (age > 18) {
            adult = true;
        }
            return adult;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int age = scanner.nextInt();
        if (Tema2Ejercicio1.numberSign(age) == -1){
            System.out.println("La edad que has puesto es negativa");
        } else {
            if (isAdult(age)){
                System.out.println("Es mayor de edad");
            }else {
                System.out.println("No es mayor de edad");
            }
        }
    }
}
