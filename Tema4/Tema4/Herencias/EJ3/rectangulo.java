package Tema4.Herencias.EJ3;

class rectangulo extends Figura2D{
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public String toString() {
        return "El rectangulo con base: " + base + " y altura: " + altura + " . \nLa area es: " + area() + " \n El perimetro es: " + perimetro();
    }
}