import java.util.Scanner;

public class Tema1Ejercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = in.nextInt();
        if (numero >= 0) {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
        } else {
            System.out.println("Error: Al calcular la raíz cuadrada de un número negativo.");
        }
    }
}