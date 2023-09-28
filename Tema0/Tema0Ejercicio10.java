import java.util.Scanner;

public class Tema0Ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pon un número real");
        float N1 = in.nextFloat();
        System.out.println("Pon otro número real");
        float N2 = in.nextFloat();
        System.out.println("Suma = " + (N1 + N2));
        System.out.println("Producto = " + (N1 * N2));
        System.out.println("Resta = " + (N1 - N2));
        System.out.println("División = " + (N1 / N2));
        System.out.println("Resto = " + (N1 % N2));
    }

}