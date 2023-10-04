import java.util.Scanner;

public class Tema1Ejercicio26 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int N = scanner.nextInt();
        boolean primo = true;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Si que es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}
