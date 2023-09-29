import java.util.Scanner;

public class Tema1Ejercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Número del mes");
        int M = in.nextInt();
        System.out.println("Número del año");
        int A = in.nextInt();
        if ((A % 4 == 0) && ((A % 100 != 0) || (A % 400 == 0)) && (M == 2)) {
            System.out.println("29 dias");
        } else {
            if ((A % 4 == 0) && ((A % 100 != 0) || (A % 400 == 0)) && (M == 1) || (M == 3) || (M == 5) || (M == 7) || (M == 8) || (M == 10) || (M == 12)) {
                System.out.println("31 dias");
            } else {
                if ((A % 4 == 0) && ((A % 100 != 0) || (A % 400 == 0)) && (M == 11)) {
                    System.out.println("30 dias");
                } else {

                }
            }
        }
    }
}
