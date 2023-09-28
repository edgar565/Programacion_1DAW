import java.util.Scanner;

public class Tema0Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pon un numero");
        int N1 = in.nextInt();
        System.out.println("Pon otro numero");
        int N2 = in.nextInt();
        if (N1 == N2) {
            System.out.println("Son iguales");
        } else {
            if (N1 > N2){
                System.out.println(N1 + " Es mayor que " + N2);
            } else {
                System.out.println(N2 + " Es mayor que " + N1);

            }
        }


    }


}