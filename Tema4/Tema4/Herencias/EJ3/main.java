package Tema4.Herencias.EJ3;

public class main {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(6);
        System.out.println(cuadrado);
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());

        Rectangulo rectangulo = new Rectangulo(4,8);
        System.out.println(rectangulo);
        System.out.println(rectangulo.area());
        System.out.println(rectangulo.perimetro());

        Triangulo triangulo = new Triangulo(4,6);
        System.out.println(triangulo);
        System.out.println(triangulo.area());
        System.out.println(triangulo.perimetro());

        Circulo circulo = new Circulo(4,2);
        System.out.println(circulo);
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());

    }

}
