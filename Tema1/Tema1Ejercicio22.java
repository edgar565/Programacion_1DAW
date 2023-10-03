import java.util.Scanner;

public class Tema1Ejercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número entero");
        int N = scanner.nextInt();
        int cifras = 0;
        while (N > 0){
            N = N / 10;
            cifras++;
            }
            System.out.println("Tiene " + cifras + " cifras");
        }
}