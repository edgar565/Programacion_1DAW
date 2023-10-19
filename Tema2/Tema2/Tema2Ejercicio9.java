package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {

    public static void printTriangle(char character, int numberLines){
        for (int i = 1; i < numberLines; i++ ){
            String space = new String(new char[numberLines - i]).replace('\0',' ');
            String line = new String(new char[(i * 2) - 1]).replace('\0', character);
            System.out.println(space + line);
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el carácter");
        char character = scanner.next().charAt(0);
        System.out.println("Dime el número de líneas del triángulo");
        int numberLines = scanner.nextInt();
        printTriangle(character,numberLines);

    }
}
