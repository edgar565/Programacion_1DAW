package Tema4.Herencias.EJ4;

class Revistas extends Ficha{
    private int numero_publicacion;
    private int ano_publicacion;

    public Revistas(int numero, String titulo, int numero_publicacion, int ano_publicacion) {
        super(numero, titulo);
        this.numero_publicacion = numero_publicacion;
        this.ano_publicacion = ano_publicacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero publicación: " + numero_publicacion + "\nAño de publicación: " + ano_publicacion;
    }

}