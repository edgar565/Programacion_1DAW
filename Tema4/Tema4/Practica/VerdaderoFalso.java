package Tema4.Practica;

public class VerdaderoFalso extends Pregunta{

    public VerdaderoFalso(String enunciado) {
        super(enunciado);
    }

    @Override
    public boolean comprobarRespuesta(String respuesta) {
        return false;
    }
}