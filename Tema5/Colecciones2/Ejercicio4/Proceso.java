package Colecciones2.Ejercicio4;

import java.util.Random;

public class Proceso {
    private Random random = new Random();
    private double tiempoEjecucion;
    private String nombre;
    private static int numero = 1;
    public Proceso() {
        this.tiempoEjecucion = random.nextDouble(4) + 1;
        this.nombre = nombre();
    }
    public void setTiempoEjecucion(double tiempo) {
        this.tiempoEjecucion -= tiempo;
    }

    private static String nombre(){
        return  "p" + numero++;
    }
    public boolean terminado() {
        return tiempoEjecucion <= 0;
    }
    public String toString() {
        return  nombre + " Tiempo de ejecución: " + tiempoEjecucion;
    }
}