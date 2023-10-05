import java.util.Scanner;

public class Tema1Ejercicio27 {

    public static void main(String[] args) {
        int N = 1;
        int primo = 0;
        while (primo < 20) {
            int bucle = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    bucle++;
                }
            }
            if (bucle <= 2) {
                System.out.println(N);
                primo++;
            }
            N++;
        }
    }
}