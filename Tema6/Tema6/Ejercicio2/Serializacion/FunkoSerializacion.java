package Tema6.Ejercicio2.Serializacion;

import java.io.Serializable;
import java.util.Date;

import static Tema6.Ejercicio2.Serializacion.AplicacionSerializacion.dateFormat;

public class FunkoSerializacion implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private Date fechaLanzamiento;

    public FunkoSerializacion(String codigo, String nombre, String modelo, double precio, Date fechaLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        return "Funko [id=" + codigo + ", nombre=" + nombre + ", modelo=" + modelo + ", precio=" + precio + ", fechaLanzamiento=" + dateFormat.format(fechaLanzamiento) + "]";    }
}
