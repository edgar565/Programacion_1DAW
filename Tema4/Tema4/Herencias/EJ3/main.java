package Tema4.Herencias.EJ3;

public class main {

    public static void main(String[] args) {
        cuadrado cuadrado = new cuadrado(6);
        System.out.println(cuadrado);
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());

        rectangulo rectangulo = new rectangulo(4,8);
        System.out.println(rectangulo);
        System.out.println(rectangulo.area());
        System.out.println(rectangulo.perimetro());

        triangulo triangulo = new triangulo(4,6);
        System.out.println(triangulo);
        System.out.println(triangulo.area());
        System.out.println(triangulo.perimetro());

        circulo circulo = new circulo(4,2);
        System.out.println(circulo);
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

    }

}
