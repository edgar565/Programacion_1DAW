package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {

    public static boolean validRadius(int radius) {
        boolean isValid = false;
        if (radius > 0) isValid = true;
        return isValid;
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
        System.out.println("Dime un radio de un circulo");
        int radius = scanner.nextInt();
        if (validRadius(radius) == true){
            System.out.println("El perimetro del circulo es " + calculateCirclePerimeter(radius));
            System.out.println("El area del circulo es " + calculateCircleArea(radius));
        } else {
            while (validRadius(radius) != true) {
                System.out.println("Dime un radio correcto");
                radius = scanner.nextInt();
                System.out.println("El perimetro del circulo es " + calculateCirclePerimeter(radius));
                System.out.println("El area del circulo es " + calculateCircleArea(radius));
            }
        }
    }
}
