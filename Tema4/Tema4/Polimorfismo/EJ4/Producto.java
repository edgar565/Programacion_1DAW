package Tema4.Polimorfismo.EJ4;
abstract class Producto {
    int referencia;
    String titulo;
    String tipo;
    public Producto(String tipo, int referencia, String titulo) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.titulo = titulo;
    }
    public abstract String getInfo();
}