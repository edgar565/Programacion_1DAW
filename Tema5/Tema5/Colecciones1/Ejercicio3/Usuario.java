package Tema5.Colecciones1.Ejercicio3;

public class Usuario {
    private String nombre;
    private String dni;
    private int edad;

    public Usuario(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}
