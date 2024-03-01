package Tema4.Practica;

public class Abierta extends Pregunta{
    private String respuestaCorrecta;
    public Abierta(String enunciado,String respuestaCorrecta) {
        super(enunciado);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    @Override
    public boolean comprobarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(String.valueOf(respuestaCorrecta));
    }
    public String toString(){
        return enunciado;
    }
}