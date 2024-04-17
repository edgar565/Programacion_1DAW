package Colecciones2.Ejercicio1;

public class AvistamientoPajaros extends Avistamiento {
    private double peso;
    private String especie;

    public AvistamientoPajaros(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }
    @Override
    public String toString() {
        return "### Pajaro ###\n" + super.toString() + "\n Peso: " + peso + "\n Especie: " + especie;
    }
}
