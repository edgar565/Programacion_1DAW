package Colecciones2.Ejercicio1;

public class AvistamientoSerpientes extends Avistamiento{
    private double longitud;
    private String especie;

    public AvistamientoSerpientes(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getEspecie() {
        return especie;
    }
}
