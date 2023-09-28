import java.util.Scanner;

public class Tema1Ejercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Poner el valor en euros");
        double E = in.nextDouble();
        double D = (E * 1.06F);
        System.out.println(E + " Son " + D + " dólares ");
    }
}