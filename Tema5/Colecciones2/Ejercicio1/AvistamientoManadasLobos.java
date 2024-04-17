package Colecciones2.Ejercicio1;

public class AvistamientoManadasLobos extends Avistamiento{
     private int numLobos;
     private String observaciones;

    public AvistamientoManadasLobos(int hora, int numLobos, String observaciones) {
        super(hora);
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    public int getNumLobos() {
        return numLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "### Manada de lobos ###\n" + super.toString() + "\n Número de lobos: " + numLobos + "\n Observaciones: " + observaciones;
    }
}