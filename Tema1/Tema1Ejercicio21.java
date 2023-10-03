import java.util.Scanner;

public class Tema1Ejercicio21 {

    public static void main(String[] args){
        int suma = 0;
        for (int N = 2; N <= 1000; N += 2) {
        suma += N;
        }
        System.out.println("La suma da: " + suma);
    }
}