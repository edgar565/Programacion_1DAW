package Tema4.Herencias.EJ3;

class Cuadrado extends Rectangulo {
    private double lado;
    public Cuadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "El cuadrado con base: " + lado + " y altura: " + lado + " . \nLa area es: " + area() + " \n El perimetro es: " + perimetro();
    }

}
