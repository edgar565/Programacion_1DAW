package Tema3;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BuscaminasArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] tablero = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        String[] tablero_vista = new String[20];
        Arrays.fill(tablero_vista,"oculto");
        for (int i = 1; i < 6; i++){
            int x = random.nextInt(0,19);
            tablero[x] = "*";
            if (Objects.equals(tablero[x], "*")){
                x = random.nextInt(0, 19);
                tablero[x] = "*";
            }
        }
        for (int i = 1; i < 19 ;i++){
            if (tablero[i].equals("*")){
                tablero[i - 1] = "1";
                tablero[i + 1] = "1";
            }
        }
        for (int i = 2; i < 17; i++){
            if (tablero[i].equals("*") && tablero[i - 2].equals("*")){
                tablero[i - 1] = "2";
            } else if (tablero[i].equals("*") && tablero[i + 2].equals("*") ){
                tablero[i + 1] = "2";
            }
        }
        if (tablero[0].equals("*") && tablero[19].equals("*")){
            tablero[1] = "1";
            tablero[18] = "1";
        }
        System.out.println(Arrays.toString(tablero_vista));
        juego(tablero_vista, tablero);
    }
    public static boolean tableroMostrado(String [] tablero_vista){
        boolean result = true;
        for (int i = 0; i < 20; i++){
            if (tablero_vista[i].equals("oculto")){
                result = false;
            }
        }
        return result;
    }
    public static void juego(String[] tablero_vista, String[] tablero){
        boolean gameOver = false;
        while (!tableroMostrado(tablero_vista) || gameOver == true){
            System.out.println("Dime un número para el tablero entre 1 - 20");
            int num = scanner.nextInt();
            if (num <= 19 && num >= 0){
                tablero_vista[num] = tablero[num];
            }
            System.out.println(Arrays.toString(tablero_vista));
            if(tablero[num].equals("*")){
                gameOver =  true;
                System.out.println("Has caido en una bomba");
                break;
            }
        }
    }
}