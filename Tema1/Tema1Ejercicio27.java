import java.util.Scanner;

public class Tema1Ejercicio27 {

    public static void main(String[] args) {
        int N = 1;
        int bucle = 0;
        int primo = 0;
        while (bucle < 20) {
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    primo = primo * i;
                    bucle++;
                }
            }
            if (bucle <= 0) {
                System.out.println(N);
                bucle++;
            }
            N++;
        }
    }
}