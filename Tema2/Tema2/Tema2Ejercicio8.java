package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {

    public static boolean validDay(int day, int month, int year) {
        boolean resultDay = false;
        //if dias y meses
                // if 30 dies
                // febrero
                // 31 dies
        if (day >= 1 && day <= 31) {
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (month == 2)) {
                if (day == 29) {
                    resultDay = true;
                }
            } else {
            }
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (year == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                if (day == 31) {
                    resultDay = true;
                }
            } else {
            }
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (month == 11) || (month == 6) || (month == 9) || (month == 4)) {
                if (day == 30) {
                    resultDay = true;
                }
            } else {
            }
            if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                if (day == 31) {
                    resultDay = true;
                }
            } else {
            }
            if ((month == 11) || (month == 6) || (month == 9) || (month == 4)) {
                if (day == 30) {
                    resultDay = true;
                }
            } else {
            }
            if (!((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) && (month == 2))) {
                if (day == 28) {
                    resultDay = true;
                }
            }
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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un dia del mes entre el 1 y el 31");
        int day = scanner.nextInt();
        System.out.println("Dime un mes entre el 1 y el 12");
        int month = scanner.nextInt();
        System.out.println("Dime un año ");
        int year = scanner.nextInt();
        if ((validDay(day,year,month) == true) && (validMonth(month) == true)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha no es correcta");
        }
    }
}
