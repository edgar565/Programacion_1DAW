import java.util.Scanner;

public class Tema1Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el valor de la base del triángulo");
        int b = in.nextInt();
        System.out.println("Dame el valor de la altura del triángulo");
        int a = in.nextInt();
        System.out.println("La superficie del triángulo es = " + (b * a) / 2);
    }
}