import java.util.Scanner;

public class Tema1Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int N1 = in.nextInt();
        System.out.println("Dime el segundo número");
        int N2 = in.nextInt();
        if (N1 > N2) {
            System.out.println(N1 + "-" + N2 + "=" + (N1 - N2));
        } else {
            System.out.println(N2 + "-" + N1 + "=" + (N2 - N1));
        }
    }
}