import java.util.Scanner;

public class Tema1Ejercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número real");
        double numero1 = scanner.nextDouble();
        System.out.println("Dime una operación");
        char operacion = scanner.next().charAt(0);
        System.out.println("Dime el otro número");
        double numero2 = scanner.nextDouble();
        while (operacion == 43 || operacion == 45 || operacion == 42 || operacion == 47 || operacion == 37) {
            if (operacion == 43) {
                double suma = numero1 + numero2;
                System.out.println("El resultado es = " + suma);
            } else if (operacion == 45) {
                double resta = numero1 - numero2;
                System.out.println("El resultado es = " + resta);
            } else if (operacion == 42) {
                double multiplicacion = numero1 * numero2;
                System.out.println("El resultado es = " + multiplicacion);
            } else if (operacion == 47) {
                double division = numero1 / numero2;
                System.out.println("El resultado es = " + division);
            } else if (operacion == 37) {
                double resto = numero1 % numero2;
                System.out.println("El resultado es = " + resto);
            }
            System.out.println("Dime un número real");
            numero1 = scanner.nextDouble();
            System.out.println("Dime una operación");
            operacion = scanner.next().charAt(0);
            System.out.println("Dime el otro número");
            numero2 = scanner.nextDouble();
            if (operacion == 113) {
                System.out.println("Has cerrado la calculadora");
            }
        }
    }
}