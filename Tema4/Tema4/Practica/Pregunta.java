package Tema4.Practica;

abstract class Pregunta implements IRespuesta{
    protected String enunciado;
    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public abstract boolean comprobarRespuesta(String respuesta);
}