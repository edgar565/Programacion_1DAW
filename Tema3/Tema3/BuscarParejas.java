package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        String[] animales = new String[]{"león", "mandril", "elefante", "suricata", "pingüino", "facóquero", "jirafa", "tigre", "koala", "panda", "elefante", "mandril", "jirafa", "facóquero", "pingüino","suricata", "tigre", "panda", "koala","león"};
        String[] cartas = new String[20];
        Arrays.fill(cartas, "oculto");
        System.out.println(Arrays.toString(cartas));
        for (int i = 0; i < 100; i++){
            int aleatorio1 = random.nextInt(0,19);
            int aleatorio2 = random.nextInt(0,19);
            String x = animales[aleatorio1];
            animales[aleatorio1] = animales[aleatorio2];
            animales[aleatorio2] = x;
        }
        System.out.println(Arrays.toString(animales));
        /*while () {
            System.out.println("Dime la primera posición para desvelar entre 0 - 19");
            int posicion1 = scanner.nextInt();
            if (posicion1 < 1 || posicion1 > 20) {
                System.out.println("Dime la primera posición para desvelar entre 0 - 19");
                posicion1 = scanner.nextInt();
            }
            System.out.println("Dime la segunda posición para desvelar entre 0 - 19");
            int posicion2 = scanner.nextInt();
            if (posicion2 < 1 || posicion2 > 20) {
                System.out.println("Dime la segunda posición para desvelar entre 0 - 19");
                posicion2 = scanner.nextInt();
            }
            System.out.println("La carta en la posición " + posicion1 + " es : ");
            System.out.println("La carta en la posición " + posicion2 + " es : ");
        }*/
    }





}
/*for (int i = random.nextInt(0, 19), x = 0, c = 0; c < cartas.length; c++){
        cartas[i] = animales[random.nextInt(0,9)];
        while ( i != x){
        cartas[i] = animales[random.nextInt(0,9)];
        }
        }*/
// tengo todas las cartes en cartas ordenadas
// while 100
//      aleatorio1
//      aleatorio2
//      intercambio

// for 0 19 para cada carta
//      // calculo aleatorio 0-9
//      // comprobar que ixe aleatori está 1 o 0 vegades en cartes
//      // VUelvo a calcular aleatorio