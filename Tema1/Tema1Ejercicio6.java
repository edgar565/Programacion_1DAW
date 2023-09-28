import java.util.Scanner;

public class Tema1Ejercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número");
        int N = in.nextInt();
        if (N > 0) {
            System.out.println(N + " es positivo");
        } else {
            if (N < 0) {
                System.out.println(N + " es negativo");
            } else {
                System.out.println(N + " es igual a 0");
            }
        }
    }
}