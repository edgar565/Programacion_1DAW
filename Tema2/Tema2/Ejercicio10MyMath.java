package Tema2;

import java.util.Scanner;

public class Ejercicio10MyMath {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número entre el 1 y el 15\n" +
                "\"1: Perimetro de un cuadrado\" +\n" +
                "\"2: Area de un cuadrado\" +\n" +
                "\"3: Perimetro de rectangulo\" +\n" +
                "\"4: Area de rectangulo\" +\n" +
                "\"5: Perimetro de circulo\" +\n" +
                "\"6: Area de circulo\" +\n" +
                "\"7: Numero es primo\" +\n" +
                "\"8: Numero no es primo\" +\n" +
                "\"9: Contador de numeros\" +\n" +
                "\"10: Contador de numeros pares\" +\n" +
                "\"11: Contador de numeros impares\" +\n" +
                "\"12: Factorial\" +\n" +
                "\"13: Factorial recursivo\" +\n" +
                "\"14: Calcular las soluciones de ecuaciones\" +\n" +
                "\"15: Sumar digitos de un numero\");");
        int menu = scanner.nextInt();
        while (menu <1 && menu > 15){
            System.out.println("Dime un número entre el 1 y el 15\n" +
                    "\"1: Perimetro de un cuadrado\" +\n" +
                    "\"2: Area de un cuadrado\" +\n" +
                    "\"3: Perimetro de rectangulo\" +\n" +
                    "\"4: Area de rectangulo\" +\n" +
                    "\"5: Perimetro de circulo\" +\n" +
                    "\"6: Area de circulo\" +\n" +
                    "\"7: Numero es primo\" +\n" +
                    "\"8: Numero no es primo\" +\n" +
                    "\"9: Contador de numeros\" +\n" +
                    "\"10: Contador de numeros pares\" +\n" +
                    "\"11: Contador de numeros impares\" +\n" +
                    "\"12: Factorial\" +\n" +
                    "\"13: Factorial recursivo\" +\n" +
                    "\"14: Calcular las soluciones de ecuaciones\" +\n" +
                    "\"15: Sumar digitos de un numero\");");
            menu = scanner.nextInt();
        }
        switch (menu){
            case 1:
                System.out.println("Dime el lado de un cuadrado, para saber el perimetro");
                double lado = scanner.nextDouble();
                System.out.println("El perimetro del cuadrado es " + MyMath.squarePerimeter(lado));
            case 2:
                System.out.println("Dime el lado de un cuadrado, para saber el area");
                lado = scanner.nextDouble();
                System.out.println("El area del cuadrado es " + MyMath.squareArea(lado));
            case 3:
                System.out.println("Dime la base de un rectangulo, para saber el perimetro");
                double base = scanner.nextDouble();
                System.out.println("Dime el lado de un rectangulo, para saber el perimetro");
                lado = scanner.nextDouble();
                System.out.println("El perimetro del rectangulo es " + MyMath.rectanglePerimeter(lado, base));
            case 4:
                System.out.println("Dime la base de un rectangulo, para saber el area");
                base = scanner.nextDouble();
                System.out.println("Dime el lado de un rectangulo, para saber el area");
                lado = scanner.nextDouble();
                System.out.println("El area del rectangulo es " + MyMath.rectangleArea(lado, base));
            case 5:
                System.out.println("Dime el radio de un circulo, para saber el perimetro");
                double radio = scanner.nextDouble();
                System.out.println("El perimetro del circulo es " + MyMath.circlePerimeter(radio));
            case 6:
                System.out.println("Dime el radio de un circulo, para saber el area");
                radio = scanner.nextDouble();
                System.out.println("El perimetro del circulo es " + MyMath.circleArea(radio));
            case 7:
                System.out.println("Dime un numero, para saber si es primo");
                int numero = scanner.nextInt();
                System.out.println("El numero es " + MyMath.isPrime(numero));
            case 8:
                System.out.println("Dime un numero, para saber si no es primo");
                numero = scanner.nextInt();
                System.out.println("El numero es " + MyMath.isNotPrime(numero));
            case 9:
                System.out.println("Dime un numero, para contar los numeros");
                numero = scanner.nextInt();
                System.out.println("El numero tiene " + MyMath.figureCount(numero) + " numeros");
            case 10:
                System.out.println("Dime un numero, para contar los numero pares");
                numero = scanner.nextInt();
                System.out.println("El numero tiene " + MyMath.evenFigureCount(numero) + " numeros pares");
            case 11:
                System.out.println("Dime un numero, para contar los numero impares");
                numero = scanner.nextInt();
                System.out.println("El numero tiene " + MyMath.oddFigureCount(numero) + " numeros impares");
            case 12:
                System.out.println("Dime un numero, para saber su factorial");
                numero = scanner.nextInt();
                System.out.println("El factorial es " + MyMath.factorial(numero));
          case 13:
                System.out.println("Dime un numero, para saber su factorial");
                numero = scanner.nextInt();
                System.out.println("El factorial es " + MyMath.factorial(numero));
            case 14:
                System.out.println("Dime los tres coeficientes de una ecuación de segundo grado, para sabr cuantas soluciones hay");
                int coeficiente1 = scanner.nextInt();
                int coeficiente2 = scanner.nextInt();
                int coeficiente3 = scanner.nextInt();
                System.out.println("La ecuación tiene " + MyMath.quadraticEcuationSolutions(coeficiente1, coeficiente2, coeficiente3) + "soluciones");
            case 15:
                System.out.println("Dime un numero, para sumar sus digitos entre ellos");
                numero = scanner.nextInt();
                System.out.println("La suma de sus digitos es " + MyMath.factorial(numero));
        }
    }
}
