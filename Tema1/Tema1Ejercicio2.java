import java.util.Scanner;

public class Tema1Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cual es el valor de la base del rectángulo");
        int b = in.nextInt();
        System.out.println("Cual es valor de la altura del rectángulo");
        int a = in.nextInt();
        System.out.println("La superficie del rectángulo es = " + (b * a));
        System.out.println("El perímetro del rectángulo es = " + (2 * b) + (2 * a));
    }

}