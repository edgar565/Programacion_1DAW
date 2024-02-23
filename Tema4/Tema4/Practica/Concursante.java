package Tema4.Practica;

public class Concursante {
    private String nombre;
    private int puntos;
    private int DEFAULT_PUNTOS;
    public Concursante(String nombre) {
        this.nombre = nombre;
        this.puntos = DEFAULT_PUNTOS;
    }

    public void setPuntos() {
        this.puntos = DEFAULT_PUNTOS;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    public String toString(){
        return nombre + " tiene: " + puntos;
    }
}