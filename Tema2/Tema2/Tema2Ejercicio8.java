package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static boolean esAñoBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    public static boolean validDay(int day, int month, int year) {
        boolean resultDay = false;
        int maxDias = 31;
        //if dias y meses
        // if 30 dies
        // febrero
        // 31 dies
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
               maxDias = 30;
            } else if (month == 2) {
                if (esAñoBisiesto(year)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
        } if (day >= 1 && day <= maxDias){
            resultDay = true;
        }
        return resultDay;
    }

    public static boolean validMonth(int month) {
        boolean result = false;
        if (month >= 1 && month <= 12) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un dia del mes entre el 1 y el 31");
        int day = scanner.nextInt();
        System.out.println("Dime un mes entre el 1 y el 12");
        int month = scanner.nextInt();
        System.out.println("Dime un año ");
        int year = scanner.nextInt();
        if ((validDay(day, year, month) == true) && (validMonth(month) == true)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha no es correcta");
        }
    }
}