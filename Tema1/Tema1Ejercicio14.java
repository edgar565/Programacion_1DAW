import java.util.Scanner;

public class Tema1Ejercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Número de personas");
        int P = in.nextInt();
        System.out.println("Número de días");
        int D = in.nextInt();
        if ((P == 5) && (D >= 7)){
            System.out.println(15 * D * 0.75);
        } else {
            System.out.println(15 * D);
        }
    }
}
