package Colecciones2.Ejercicio1;

public class AvistamientoPajaros extends Avistamiento {
    private double peso;
    private String especie;

    public AvistamientoPajaros(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }
}
