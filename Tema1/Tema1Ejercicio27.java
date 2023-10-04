import java.util.Scanner;

public class Tema1Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        boolean primo = true;
        int bucle = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                primo = false;
                bucle++;
            }
        }
        if (bucle <= 2) {
            System.out.println(N);
          //  primo++;
        }
        N++;
    }
}