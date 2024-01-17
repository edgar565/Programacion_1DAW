package Tema4;

import java.util.Scanner;

public class pruebaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir los datos: \n" +
                "1. Persona\n" +
                "2. Persona");
        int menu = scanner.nextInt();
        if (menu == 1){
            System.out.println("Dime tu nombre");
            String nombre1 = scanner.next();
            System.out.println("Dime tus apellidos");
            String apellidos1 = scanner.next();
            System.out.println("Dime tu edad");
            int edad1 = scanner.nextInt();
            System.out.println("Dime tu DNI");
            String DNI1 = scanner.next();
        } else if (menu == 2){
            System.out.println("Dime tu nombre");
            String nombre1 = scanner.next();
            System.out.println("Dime tus apellidos");
            String apellidos1 = scanner.next();
            System.out.println("Dime tu edad");
            int edad1 = scanner.nextInt();
            System.out.println("Dime tu DNI");
            String DNI1 = scanner.next();
        }
        Persona persona1 = new Persona(DNI1,nombre1,apellidos1,edad1);
        Persona persona2 = new Persona();

    }
}