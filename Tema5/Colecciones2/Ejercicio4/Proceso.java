package Colecciones2.Ejercicio4;

import java.util.Random;

public class Proceso {
    private Random random = new Random();
    private double tiempoEjecucion;
    private String nombre;
    public Proceso() {
        this.tiempoEjecucion = random.nextInt(1,4);
        this.nombre = nombre();
    }

    public Proceso(double tiempoEjecucion, String nombre) {
        this.tiempoEjecucion = tiempoEjecucion;
        this.nombre = nombre;
    }

    public double getTiempoEjecucion() {
        return tiempoEjecucion;
    }
    public void setTiempoEjecucion() {
        this.tiempoEjecucion =- 0.2;
    }

    public String getNombre() {
        return nombre;
    }


    private String nombre(){
        int numero = 1;
        return  "p" + numero++;
    }
    public boolean terminado() {
        return tiempoEjecucion <= 0;
    }
    public String toString() {
        return  nombre + " Tiempo de ejecución: " + tiempoEjecucion;
    }
}