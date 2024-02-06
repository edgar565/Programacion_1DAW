package Tema4.POO1;

public class Persona {
    String DNI;
    String nombre;
    String apellidos;
    int edad;
    static final int adultAge = 18;
    static final  int retiredAge = 65;
    public Persona(String DNI, String nombre, String apellidos, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        if (edad < 0){
            this.edad = 0;
        }
    }
    public void print(){
        System.out.println(getNombre() + getApellidos() + " tiene " + getEdad() + " años y su DNI es " + getDNI());
    }
    public boolean isAdult(int edad){
        boolean comprobarMayorEdad = false;
        if (edad >= 18){
            comprobarMayorEdad = true;
        }
        return comprobarMayorEdad;
    }
    public boolean isRetired(int edad){
        boolean comprobarRetirado = false;
        if (edad > 65){
            comprobarRetirado = true;
        }
        return comprobarRetirado;
    }
    public int ageDifference(Persona person){
        return Math.abs(this.edad - person.edad);
    }
    public static boolean checkDNI(String dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numero = dni.substring(0, 8);
        char letraCalculada = letras.charAt(Integer.parseInt(numero) % 23);
        char letraDNI = Character.toUpperCase(dni.charAt(8));
        return letraCalculada  ==  letraDNI;
    }
}