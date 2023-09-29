import java.util.Scanner;

public class Tema1Ejercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero del 0 - 2");
        String C = in.nextLine();
        if ("0".equals(C)){
            System.out.println("Dime cuanto mide el lado del cuadrado");
            double  lado = in.nextDouble();
            System.out.println("La superficie del cuadrado es = " + (lado * lado));
            System.out.println("El perimetro del cuadrado es = " + (lado + lado + lado + lado));
        } else {
            if ("1".equals(C)){
                System.out.println("Dime cuanto mide la base del rectangulo");
                double base = in.nextDouble();
                System.out.println("Dime cuanto mide la altura del rectangulo ");
                double altura = in.nextDouble();
                System.out.println("El perimetro del rectangulo es = " + (base * base) + (altura * altura));
                System.out.println("La superficie del rectangulo es = " + (base * altura));
            } else {
                if ("2".equals(C)){
                    System.out.println("Dime cuanto mide la base del triangulo");
                    double base_triangulo = in.nextDouble();
                    System.out.println("Dime cuanto mide la altura del triangulo");
                    double altura_triangulo = in.nextDouble();
                    System.out.println("La superficie del triángulo es = " + (base_triangulo * altura_triangulo) / 2);
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
