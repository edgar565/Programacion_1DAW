import java.util.Scanner;

public class Tema1Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int N1 = in.nextInt();
        System.out.println("Dime el segundo número");
        int N2 = in.nextInt();
        System.out.println("Dime el tercer número");
        int N3 = in.nextInt();
        if (N1 < N2 && N2 < N3) {
            System.out.println("Estan ordenados de menor a mayor");
        } else {
            System.out.println("No estan ordenados de menor a mayor");
        }
    }
}