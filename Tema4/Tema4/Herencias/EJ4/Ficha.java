package Tema4.Herencias.EJ4;

public abstract class Ficha {

    private int numero;
    private String titulo;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public abstract String toString();
}