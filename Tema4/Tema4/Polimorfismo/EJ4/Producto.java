package Tema4.Polimorfismo.EJ4;
abstract class Producto {
    private int referencia;
    private String titulo;
    private String tipo;
    public Producto(String tipo, int referencia, String titulo) {
        this.referencia = referencia;
        this.tipo = tipo;
        this.titulo = titulo;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract String getInfo();
}