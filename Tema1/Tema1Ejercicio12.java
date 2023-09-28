import java.util.Scanner;

public class Tema1Ejercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el primer número");
        int N1 = in.nextInt();
        System.out.println("Dime el segundo número");
        int N2 = in.nextInt();
        System.out.println("Dime el tercer número");
        int N3 = in.nextInt();
        if (N3 > N2 && N2 > N1) {
            System.out.println(N3 + "-" + N2 + "-" + N1);
        } else {
            if (N2 > N1 && N1 > N3) {
                System.out.println(N2 + "-" + N1 + "-" + N3);
            } else {
                if (N1 > N2 && N2 > N3) {
                    System.out.println(N1 + "-" + N2 + "-" + N3);
                } else {
                    if (N2 > N3 && N3 > N1) {
                        System.out.println(N2 + "-" + N3 + "-" + N1);
                    } else {
                        if (N1 > N3 && N3 > N2) {
                            System.out.println(N1 + "-" + N3 + "-" + N2);
                        } else {
                            if (N3 > N1 && N1 > N2)
                                System.out.println(N3 + "-" + N1 + "-" + N2);
                        }
                    }
                }
            }
        }
    }
}