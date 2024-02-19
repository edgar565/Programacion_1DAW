package Tema4.Polimorfismo.EJ4;

public class Libro extends Producto{
    String isbn;
    public Libro(int referencia, String titulo, String isbn) {
        super( "Libro",referencia, titulo);
        this.isbn = isbn;
    }
    @Override
    public String getInfo() {
        return "Tipo: " + tipo + ", Título: " + titulo + ", Referencia: " + referencia;
    }
}
