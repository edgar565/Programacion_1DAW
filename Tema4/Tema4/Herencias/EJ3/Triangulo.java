package Tema4.Herencias.EJ3;

class Triangulo extends Figura2D{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base / 2) * altura;
    }

    @Override
    public double perimetro() {
        return (altura * 2) + base;
    }

    @Override
    public String toString() {
        return "El triangulo con base: " + base + " y altura: " + altura + " . \nLa area es: " + area() + " \n El perimetro es: " + perimetro();
    }
}
