package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {

    public static double euro2dollar(double euro) {

        return euro * 1.06;
    }

    public static double dollar2euro(double dollar) {

        return dollar / 1.06;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que quieres pasar euros o dolares");
        String showMenu = scanner.next();
        if (showMenu.equals("euros")) {
            System.out.println("Dime los euros que quieres pasar a dolares");
            double euro = scanner.nextInt();
            System.out.println(euro + " euros son " + euro2dollar(euro) + " dolares");
        } else if (showMenu.equals("dolares")) {
            System.out.println("Dime los dolares que quieres pasar a euros");
            double dollar = scanner.nextInt();
            System.out.println(dollar + " dolares son " + dollar2euro(dollar) + " euros");
        }
    }
}
