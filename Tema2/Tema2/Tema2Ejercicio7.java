package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static boolean primoNo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = scanner.nextInt();
        while (num != 0) {
            if (primoNo(num) == true){
                System.out.println("Es primo");
                System.out.println("Dime un número");
                num = scanner.nextInt();
            } else {
                System.out.println("No es primo");
                System.out.println("Dime un número");
                num = scanner.nextInt();
            }

        }
    }
}