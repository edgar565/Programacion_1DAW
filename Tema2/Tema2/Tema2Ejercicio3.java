package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {

    public static boolean validRadius(int radius) {
        if (radius > 0) {
            return true;
        } else
            return false;
    }
    public static double calculateCirclePerimeter(int radius){
        double perimeter = (2 * (Math.PI)) * radius;
        return perimeter;
    }
    public static double calculateCircleArea(int radius){
        double area = (Math.PI) * (Math.pow(radius,2));
        return area;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un radio");
        int radius = scanner.nextInt();
        if (validRadius(radius) == true){
            System.out.println(calculateCirclePerimeter(radius));
            System.out.println(calculateCircleArea(radius));
        } else
            while (validRadius(radius) != true) {
                System.out.println("Dime un radio correcto");
                radius = scanner.nextInt();
            }
        System.out.println(calculateCirclePerimeter(radius));
        System.out.println(calculateCircleArea(radius));
    }
}
