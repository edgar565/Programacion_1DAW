import java.util.Random;
import java.util.Scanner;

public class Tema1Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroaleatorio = random.nextInt(1, 100);
        //  while (int N != numeroaleatorio){
        System.out.println("Dime un número");
        int N = scanner.nextInt();
        if (N == numeroaleatorio) {
            System.out.println("Lo has acertado");
        } else {
            if (N < numeroaleatorio) {
                System.out.println("El número introducido es menor al aleatorio");
            } else {
                if (N > numeroaleatorio) {
                    System.out.println("El número introducido es mayor al aleatorio");
                }
            }
        }
    }
}
