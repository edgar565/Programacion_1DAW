import java.util.Scanner;

public class Tema1Ejercicio25 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int factorial = 1;
        int numero = scanner.nextInt();

        if (numero > 1){

            while (numero != 0) {

                factorial = factorial * numero;
                numero--;

            }
        }
        System.out.println("El factorial es = " + factorial);
    }
}
