package Tema4.Practica;

abstract class Pregunta {
    protected String enunciado;
    private String regalo;
    public Pregunta(String enunciado, String regalo) {
        this.enunciado = enunciado;
        this.regalo = regalo;
    }

    public Pregunta(String enunciado) {
    }

    public String getEnunciado() {
        return enunciado;
    }
    public abstract boolean comprobarRespuesta(String respuesta);
}