package Tema3;

import java.util.Scanner;
public class Persona {
    String nombre;
    int edad;
    public void saludar() {
        System.out.println("¡Hola!");
    }
    public void presentarme() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad (int edad){
        if (this.edad <= 0) {
            this.edad = 0;
        }
    }
    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
    public Persona (String name){

    }
    public Persona (String name, int edad){
        nombre = name;
        this.edad = edad;
    }
    public static void showInfo(){

    }
    public static void main(String[] args) { // En otro fichero
        Persona persona = new Persona("David", 18);
        persona.setEdad(5);
        persona.presentarme();
        persona.presentarme();
        persona.saludarA("Andrea");
    }
}