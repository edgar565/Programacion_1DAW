import java.util.Scanner;

public class Tema1Ejercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Poner el valor en dólares");
        double D = in.nextDouble();
        double E = (D / 1.06F);
        System.out.println(D + " Son " + E + " euros ");
    }
}