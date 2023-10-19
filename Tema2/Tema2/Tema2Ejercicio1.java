package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static int numberSign (int number) {
        int result;
        if (number < 0) {
            result = -1;
        } else if (number == 0) {
            result = 0;
        } else{
            result = 1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int number = scanner.nextInt();
        System.out.println(numberSign(number));
    }
}