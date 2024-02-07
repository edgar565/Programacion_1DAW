package Tema4.Herencias.EJ3;

class cuadrado extends rectangulo{
    private double lado;
    public cuadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "El cuadrado con base: " + lado + " y altura: " + lado + " . \nLa area es: " + area() + " \n El perimetro es: " + perimetro();
    }

}
