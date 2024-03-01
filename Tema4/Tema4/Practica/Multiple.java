package Tema4.Practica;

import jdk.jshell.spi.SPIResolutionException;

import java.util.ArrayList;

public class Multiple extends Pregunta{
    private ArrayList<String> opciones;
    private char respuestaCorrecta;
    public Multiple(String enunciado,ArrayList  opciones,char respuestaCorrecta) {
        super(enunciado);
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }


    @Override
    public boolean comprobarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(String.valueOf(respuestaCorrecta));
    }
    public void mostrarOpciones() {
        if (opciones != null) {
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ". " + opciones.get(i));
            }
        } else {
            System.out.println("No se han proporcionado opciones para esta pregunta.");
        }
    }
    public String toString(){
        return enunciado + opciones;
    }
}