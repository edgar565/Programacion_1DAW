package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static int numberSign (int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else
            return 1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int number = scanner.nextInt();
        System.out.println(numberSign(number));
    }
}