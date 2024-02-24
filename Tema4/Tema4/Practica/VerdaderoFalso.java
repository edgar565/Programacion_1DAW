package Tema4.Practica;

public class VerdaderoFalso extends Pregunta{
    private boolean respuestaCorrecta;
    public VerdaderoFalso(VerdaderoFalso pregunta, Regalo regalo) {
        super(pregunta, regalo);
    }
    public VerdaderoFalso(String enunciado,boolean respuestaCorrecta) {
        super(enunciado);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    @Override
    public boolean comprobarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(String.valueOf(respuestaCorrecta));
    }
}