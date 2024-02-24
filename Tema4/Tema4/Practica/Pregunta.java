package Tema4.Practica;

abstract class Pregunta {
    protected String enunciado;
    private Regalo regalo;
    public Pregunta(Pregunta pregunta, Regalo regalo) {
        this.regalo = regalo;
    }
    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public abstract boolean comprobarRespuesta(String respuesta);
}