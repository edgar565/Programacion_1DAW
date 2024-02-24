package Tema4.Practica;

import java.util.ArrayList;

public class Multiple extends Pregunta{
    private ArrayList<String> opciones;
    private char respuestaCorrecta;
    public Multiple(String enunciado, String regalo, ArrayList<String> opciones, char respuestaCorrecta) {
        super(enunciado, regalo);
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;

    }
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
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((char)('a' + i) + ") " + opciones.get(i));
        }
    }
}