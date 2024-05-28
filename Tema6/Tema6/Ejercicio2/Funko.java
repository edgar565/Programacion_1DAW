package Tema6.Ejercicio2;

import java.text.SimpleDateFormat;
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

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Funko [id=" + codigo + ", nombre=" + nombre + ", modelo=" + modelo + ", precio=" + precio + ", fechaLanzamiento=" + dateFormat.format(fechaLanzamiento) + "]";
    }

}