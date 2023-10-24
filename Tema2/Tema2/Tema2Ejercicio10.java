package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número entre el 1 y el 9");
        int menu = scanner.nextInt();
        while (menu <1 && menu > 9){
        System.out.println("Dime un número entre el 1 y el 9");
        menu = scanner.nextInt();
        }
        switch (menu){
            case 1:
                System.out.println("Dime un número para mostrarte el signo");
                int number = scanner.nextInt();
                System.out.println(Tema2Ejercicio1.numberSign(number));
            case 2:
                System.out.println("Dime la edad de alguien para saber si es mayor de edad o no");
                int age = scanner.nextInt();
                if (Tema2Ejercicio2.isAdult(age) == true){
                    System.out.println("Es adulto");
                } else {
                    System.out.println("No es adulto");
                }
            case 3:
                System.out.println("Dime el radio de un círculo");
                int radius = scanner.nextInt();
                System.out.println("El perímetro es " + Tema2Ejercicio3.calculateCirclePerimeter(radius));
                System.out.println("El área es " + Tema2Ejercicio3.calculateCircleArea(radius));
            case 4:
                System.out.println("Dime que quieres pasar euros o dolares");
                String showMenu = scanner.next();
                if (showMenu.equals("euros")) {
                    System.out.println("Dime los euros que quieres pasar a dolares");
                    double euro = scanner.nextInt();
                    System.out.println(euro + " euros son " + Tema2Ejercicio4.euro2dollar(euro) + " dolares");
                } else if (showMenu.equals("dolares")) {
                    System.out.println("Dime los dolares que quieres pasar a euros");
                    double dollar = scanner.nextInt();
                    System.out.println(dollar + " dolares son " + Tema2Ejercicio4.dollar2euro(dollar) + " euros");
                }
            case 5:
                System.out.println("Dime un número");
                int num = scanner.nextInt();
                Tema2Ejercicio5.tablaMutiplicar(num);
            case 6:
                Tema2Ejercicio6.tablasMultiplicar();
            case 7:
                System.out.println("Dime un número para saber si es primo o no");
                num = scanner.nextInt();
                if (Tema2Ejercicio7.primoNo(num) == true){
                    System.out.println("Es primo");
                }else {
                    System.out.println("No es primo");
                }
            case 8:
                System.out.println("Dime un dia del mes entre el 1 y el 31");
                int day = scanner.nextInt();
                System.out.println("Dime un mes entre el 1 y el 12");
                int month = scanner.nextInt();
                System.out.println("Dime un año ");
                int year = scanner.nextInt();
                if ((Tema2Ejercicio8.validDay(day,year,month) == true) && (Tema2Ejercicio8.validMonth(month) == true)) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha no es correcta");
                }
            case 9:
                System.out.println("Dime el carácter");
                char character = scanner.next().charAt(0);
                System.out.println("Dime el número de líneas del triángulo");
                int numberLines = scanner.nextInt();
                Tema2Ejercicio9.printTriangle(character,numberLines);
        }
    }
}
