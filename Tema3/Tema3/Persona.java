package Tema3;

import java.util.Scanner;

public class Persona {
        public String nombre;
        public int edad;
        public String saludar(){
            return "Hola";
        }
        public String presentarme(){
            return "Soy";
        }
        public void saludarA(Persona DYLAN){
            System.out.println("Hola " + DYLAN.nombre);
        }

    public static void main(String[] args) {
        Persona EDGAR = new Persona();
        Persona DYLAN = new Persona();
        EDGAR.nombre = "EDGAR";
        DYLAN.nombre = "DYLAN";
        EDGAR.saludarA(DYLAN);
    }
}