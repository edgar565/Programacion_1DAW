package Tema2;

public class MyMath {

    public static double squarePerimeter(double lado) {
        double result;
        if (lado < 0) {
            result = 0.0;
        } else {
            result = lado * 4;
        }
        return result;
    }

    public static double squareArea(double lado) {
        double result;
        if (lado < 0) {
            result = 0.0;
        } else {
            result = lado * lado;
        }
        return result;
    }

    public static double rectanglePerimeter(double base, double lado) {
        double result;
        if (lado <= 0 || base <= 0) {
            result = 0.0;
        } else {
            result = (2 * base) + (2 * lado);
        }
        return result;
    }

    public static double rectangleArea(double base, double lado) {
        double result;
        if (lado <= 0 || base <= 0) {
            result = 0.0;
        } else {
            result = base * lado;
        }
        return result;
    }

    public static double circlePerimeter(double radio) {
        double result;
        if (radio <= 0) {
            result = 0.0;
        } else {
            result = 2 * Math.PI * radio;
        }
        return result;
    }

    public static double circleArea(double radio) {
        double result;
        if (radio <= 0) {
            result = 0.0;
        } else {
            result = Math.PI * Math.pow(radio, 2);
        }
        return result;
    }

    public static boolean isPrime(int numero) {
        boolean result = true;
        if (numero < 2) {
            result = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean isNotPrime(int numero) {
        return !isPrime(numero);
    }
    public static int figureCount(int numero){
        int contador = 0;
        if (numero == 0){
            contador++;
        }
        while (numero != 0){
            numero = numero / 10;
            contador++;
        }
        return contador;
    }
    public static int evenFigureCount(int numero){
        int contador = 0;
        if (numero == 0){
            contador++;
        }
        while (numero != 0){
            if (numero % 2 == 0){
                contador++;
            }
            numero = numero / 10;
        }
        return contador;
    }
    public static int oddFigureCount(int numero){
        int contador = 0;
        while (numero != 0){
            if (numero % 2 != 0){
                contador++;
            }
            numero = numero / 10;
        }
        return contador;
    }
    public static int factorial(int numero){
        int factorial = 0;
        if (numero >= 0){
            factorial = 1;
            for (int i = 1; i <= numero;i++){
                factorial *= i;
            }
        }
        return factorial;
    }
    public static int factorialRecursive(int numero){
        int factorial = 0;
        if (numero >= 0){
            factorial = 1;
            for (int i = 1; i >= numero;i++){
                factorial *= i;
            }
        }
        return factorial;
    }
}