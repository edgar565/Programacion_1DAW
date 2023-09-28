import java.util.Scanner;

public class Tema1Ejercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer número");
        float N1 = in.nextInt();
        System.out.println("Dime el segundo número");
        float N2 = in.nextInt();
        System.out.println("Dime el tercer número");
        float N3 = in.nextInt();
        float D = ((N1 + N2 + N3)/3);
        System.out.println("La media con decimales es = " + D);
        int SD = (int) ((N1 + N2 + N3)/3);
        System.out.println("La media sin decimales es = " + SD);

    }
}