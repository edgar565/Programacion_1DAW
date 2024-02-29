package Tema4.Practica;

public class Desafio {
    private Pregunta pregunta;
    private Regalo regalo;

    public Desafio(Pregunta pregunta, Regalo regalo) {
        this.pregunta = pregunta;
        this.regalo = regalo;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public String toString(){
       return "Pregunta: " + pregunta;
    }
}