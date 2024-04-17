package Colecciones2.Ejercicio1;

public class AvistamientoSerpientes extends Avistamiento{
    private double longitud;
    private String especie;

    public AvistamientoSerpientes(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "### Serpiente ###\n" + super.toString() + "\n Longitud: " + longitud + "\n Especie: " + especie;
    }
}
