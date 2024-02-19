package Tema4.Polimorfismo.EJ4;

public class DVD extends Producto {
    public DVD(int referencia, String titulo) {
        super("DVD", referencia, titulo);
    }

    @Override
    public String getInfo() {
        return "Tipo: " + tipo + ", Título: " + titulo + ", Referencia: " + referencia;
    }
}
