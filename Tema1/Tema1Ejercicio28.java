import java.util.Random;
import java.util.Scanner;

public class Tema1Ejercicio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroaleatorio = random.nextInt(99999);
        for (int x = 0;x < 5;x++){
            System.out.println("Dime un número");
            int N = scanner.nextInt();
            if (N == numeroaleatorio) {
                System.out.println("Ha ganado la loteria");
            } else {
                System.out.println("No ha ganado la loteria");
            }
        }
    }
}