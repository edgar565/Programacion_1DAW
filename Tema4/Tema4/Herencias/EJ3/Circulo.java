package Tema4.Herencias.EJ3;

class Circulo extends Figura2D{
    private double diametro;
    private double radio;

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (radio * 2);
    }

    @Override
    public double perimetro() {
        return Math.PI * diametro;
    }

    @Override
    public String toString() {
        return "El circulo con diametro: " + diametro+ " y radio: " + radio + " . \nLa area es: " + area() + " \n El perimetro es: " + perimetro();
    }
}