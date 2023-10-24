package Tema2;

public class MyMath {

    public static double squarePerimeter(double lado){
        double result;
        if (lado < 0){
            result = 0.0;
        } else {
            result = lado * 4;
        }
        return result;
    }
    public static double squareArea(double lado){
        double result;
        if (lado < 0){
            result = 0.0;
        } else {
            result = lado * lado;
        }
        return result;
    }
    public static double rectanglePerimeter(double base, double lado){
        double result;
        if (lado < 0 || base < 0){
            result = 0.0;
        } else {
            result = (base * base) + (lado * lado);
        }
        return result;
    }
}
