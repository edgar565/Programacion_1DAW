package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class wifiHoteles {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Dime tu número de habitación de la habitación Nº 1 hasta la Nº 20");
        int h = scanner.nextInt();
        while (h < 1 || h > 20){
            System.out.println("Dime tu número de habitación de la habitación Nº 1 hasta la Nº 20");
            h = scanner.nextInt();
        }
        System.out.println("Dime la potencia de transmisión del router");
        int p = scanner.nextInt();
        while (p < 1 || p > 6){
            System.out.println("Dime la potencia de transmisión del router");
            p = scanner.nextInt();
        }
        int[] habitacion = new int[20];
        habitacion[h] = p;
        cobertura(habitacion, h, p);
        System.out.println(Arrays.toString(habitacion));
    }
    public static void cobertura(int[] habitacion, int h, int p ){
        int pCobertura = p;
        for (int i = h - 1; i < habitacion.length; i++){
            habitacion[i] = Math.max(habitacion[i], pCobertura);
            pCobertura = Math.max(0, pCobertura - 1);
        }
        pCobertura = p - 1;
        for (int x = h - 2; x >= 0; x--){
            habitacion[x] = Math.max(habitacion[x], pCobertura);
            pCobertura = Math.max(0, pCobertura - 1);
        }
    }
}
