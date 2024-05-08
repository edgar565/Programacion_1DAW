package Tema6.Ejercicio2;

import java.util.Date;

public class Funko {
    String codigo;
    String nombre;
    String modelo;
    double precio;
    Date fechaLanzamiento;

    public Funko(String codigo, String nombre, String modelo, double precio, Date fechaLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

}