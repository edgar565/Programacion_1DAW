package Tema4.Practica;

public class Abierta extends Pregunta{
    public Abierta(String enunciado) {
        super(enunciado);
    }

    @Override
    public boolean comprobarRespuesta(String respuesta) {
        return false;
    }
}
