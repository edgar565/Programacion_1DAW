import java.util.Scanner;

public class Tema1Ejercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int N1 = in.nextInt();
        System.out.println("Dime el segundo número");
        int N2 = in.nextInt();
        System.out.println("Dime el tercer número");
        int N3 = in.nextInt();
        if (N2 == (N1 + 1) && N3 == (N1 + 2)) {
            System.out.println("SI son consecutivos");
        } else {
            System.out.println("No son consecutivos");
        }

    }
}