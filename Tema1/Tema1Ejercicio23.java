import java.util.Scanner;

public class Tema1Ejercicio23 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número");
        int N = scanner.nextInt();
        int i = 1;
        int suma = N;
        while (N >= 0){
             System.out.println("Dime un número");
             N = scanner.nextInt();
             if (N >= 0){
                 suma += N;
                 i++;
             }
        }
        int media = suma /i;
        System.out.println("La media es: " + media );
    }
}
