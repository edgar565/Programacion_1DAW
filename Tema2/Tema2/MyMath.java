package Tema2;

public class MyMath {

    public static double squarePerimeter(double lado) {
        double perimetro_square;
        if (lado < 0) {
            perimetro_square = 0.0;
        } else {
            perimetro_square = lado * 4;
        }
        return perimetro_square;
    }

    public static double squareArea(double lado) {
        double area_square;
        if (lado < 0) {
            area_square = 0.0;
        } else {
            area_square = lado * lado;
        }
        return area_square;
    }

    public static double rectanglePerimeter(double base, double lado) {
        double perimetro_rectangulo;
        if (lado <= 0 || base <= 0) {
            perimetro_rectangulo = 0.0;
        } else {
            perimetro_rectangulo = (2 * base) + (2 * lado);
        }
        return perimetro_rectangulo;
    }

    public static double rectangleArea(double base, double lado) {
        double area_rectangle;
        if (lado <= 0 || base <= 0) {
            area_rectangle = 0.0;
        } else {
            area_rectangle = base * lado;
        }
        return area_rectangle;
    }

    public static double circlePerimeter(double radio) {
        double perimetro_circulo;
        if (radio <= 0) {
            perimetro_circulo = 0.0;
        } else {
            perimetro_circulo = 2 * Math.PI * radio;
        }
        return perimetro_circulo;
    }

    public static double circleArea(double radio) {
        double area_circulo;
        if (radio <= 0) {
            area_circulo = 0.0;
        } else {
            area_circulo = Math.PI * Math.pow(radio, 2);
        }
        return area_circulo;
    }

    public static boolean isPrime(int numero) {
        boolean primo = true;
        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }
        return primo;
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
            for (int i = 1; i <= numero;i++){
                factorial *= i;
            }
        }
        return factorial;
    }
    public static double quadraticEcuationSolutions(int coeficiente1, int coeficiente2, int coeficiente3){
        double discriminante = Math.pow(coeficiente2,2) - (4 * coeficiente1 * coeficiente3);
        double result = 0;
        if (discriminante >= 0) {
            double soluciones;
            if (discriminante == 0){
                soluciones = 1;
            }else {
                soluciones = 2;
            }
            result = soluciones;
        }
        return result;
    }
    public static double figuresSumatory(int numero){
        numero = Math.abs(numero);
        int resultado = 0;
        while (numero > 0){
            resultado = resultado + (numero % 10);
            numero = numero / 10;
        }
        return resultado;
    }
}