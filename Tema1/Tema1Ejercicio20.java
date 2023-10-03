import java.util.Scanner;

public class Tema1Ejercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dale un valor a B");
        int B = in.nextInt();
        System.out.println("Dale un valor a A");
        int A = in.nextInt();
        if (B > A) {
            for (int i = A + 1; i < B; i++) {
                if (i % 2 != 0)
                System.out.println("Los números impares entre " + A + " i " + B + " : " + i);
            }
        }
    }
}
