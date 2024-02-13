package Tema4.Herencias.EJ4;

class Libros extends Ficha{
    private String autor;
    private String editorial;

    public Libros(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + autor + "\nEditorial: " + editorial;
    }
}