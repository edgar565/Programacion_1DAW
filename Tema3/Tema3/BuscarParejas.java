package Tema3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String[] animales = {"león", "mandril", "suricata", "facóquero", "tigre", "koala", "panda", "elefante", "jirafa", "pingüino"};
        String[] cartas = new String[20];
        Arrays.fill(cartas, "oculto");
        System.out.println(Arrays.toString(cartas));
        for (int i = random.nextInt(1, 20), x = 0, c = 0; c < animales.length; c++){
            while ( i != x){
                cartas[i] = animales[random.nextInt(0,9)];
            }
        }
        System.out.println(Arrays.toString(cartas));
        /*while () {
            int posicion1 = scanner.nextInt();
            if (posicion1 < 1 || posicion1 > 20) {
                System.out.println("Dime la primera posición para desvelar");
                posicion1 = scanner.nextInt();
            }
            System.out.println("Dime la segunda posición para desvelar");
            int posicion2 = scanner.nextInt();
            if (posicion2 < 1 || posicion2 > 20) {
                System.out.println("Dime la segunda posición para desvelar");
                posicion2 = scanner.nextInt();
            }
            System.out.println("La carta en la posición " + posicion1 + " es : " +);
            System.out.println("La carta en la posición " + posicion2 + " es : " +);
        }*/
    }




    public static boolean todasParejasVisibles(String[] cartas) {
        for (String carta : cartas) {
            if (carta.equals("oculta")) {
                return false;
            }
        }
        return true;
    }
}
