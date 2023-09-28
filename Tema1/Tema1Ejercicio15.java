import java.util.Scanner;

public class Tema1Ejercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Número del mes");
        int M = in.nextInt();
        System.out.println("Número del año");
        int A = in.nextInt();
        if ((A % 4 == 0) && ((A % 100 != 0) || (A % 400 == 0))) {
            System.out.println("El año es bisiesto");
            int B = 0;
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

}

