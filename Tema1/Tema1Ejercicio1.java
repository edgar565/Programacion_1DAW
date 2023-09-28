import java.util.Scanner;

public class Tema1Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cual es el valor del lado del cuadrado");
        int l = in.nextInt();
        System.out.println("La superficie del cuadrado es = " + (l * l));
        System.out.println("El perímetro del cuadrado es = " + (l * 4));
    }
}