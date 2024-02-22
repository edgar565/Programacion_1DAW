package Tema4.Polimorfismo.EJ4;

public class Revista extends Producto {
    public Revista(int referencia, String titulo) {
        super( "Revista", referencia, titulo);
    }

    @Override
    public String getInfo() {
        return "Tipo: " + getTipo() + ", Título: " + getTitulo() + ", Referencia: " + getReferencia();
    }
}
