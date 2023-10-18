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
        System.out.println("Dime un número entre el 1 y el 10");
        int num = scanner.nextInt();
        while (num != 0) {
            System.out.println("Dime un número entre el 1 y el 10");
            num = scanner.nextInt();
        }
    }
}