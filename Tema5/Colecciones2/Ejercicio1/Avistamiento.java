package Colecciones2.Ejercicio1;

public class Avistamiento {
    private int hora;

    public Avistamiento(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Hora del avistamiento: " + hora;
    }
}
