package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] animales = new String[]{"león", "mandril", "elefante", "suricata", "pingüino", "facóquero", "jirafa", "tigre", "koala", "panda", "elefante", "mandril", "jirafa", "facóquero", "pingüino", "suricata", "tigre", "panda", "koala", "león"};
        String[] cartas = new String[20];
        Arrays.fill(cartas, "oculto");
        System.out.println(Arrays.toString(cartas));
        juego(cartas,animales);
        System.out.println("HAS GANADO FELICIDADES!!");
        System.out.println("Quieres volver a empezar? Si o no");
        String seguir = scanner.toString();
        while (seguir.equals("Si, si, SI")){
            rotación(animales);
            juego(cartas,animales);
        }
    }
    public static void juego(String[] cartas, String[] animales){
        while (cartasMostradas(cartas) == false) {
            System.out.println("Dime la primera posición para desvelar entre 0 - 19");
            int posicion1 = scanner.nextInt();
            if (posicion1 < 0 || posicion1 > 19) {
                System.out.println("Dime la primera posición para desvelar entre 0 - 19");
                posicion1 = scanner.nextInt();
            }
            System.out.println("Dime la segunda posición para desvelar entre 0 - 19");
            int posicion2 = scanner.nextInt();
            if (posicion2 < 0 || posicion2 > 19 || posicion1 == posicion2) {
                System.out.println("Dime la segunda posición para desvelar entre 0 - 19");
                posicion2 = scanner.nextInt();
            }
            System.out.println("La carta en la posición " + posicion1 + " es : " + animales[posicion1]);
            System.out.println("La carta en la posición " + posicion2 + " es : " + animales[posicion2]);
            if (animales[posicion1].equals(animales[posicion2])) {
                cartas[posicion1] = animales[posicion1];
                cartas[posicion2] = animales[posicion2];
            }
            System.out.println(Arrays.toString(cartas));
        }
    }

    public static boolean cartasMostradas (String[] cartas){
        boolean result = true;
        for (int i = 0; i < 20; i++){
            if (cartas[i].equals("oculto")){
                result = false;
            }
        }
        return result;
    }
    public static void rotación(String[] animales){
        for (int i = 0; i < 100; i++) {
            int aleatorio1 = random.nextInt(0, 19);
            int aleatorio2 = random.nextInt(0, 19);
            String x = animales[aleatorio1];
            animales[aleatorio1] = animales[aleatorio2];
            animales[aleatorio2] = x;
        }
    }
}