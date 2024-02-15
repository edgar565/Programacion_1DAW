package Tema4.Polimorfismo.EJ2;

import Tema4.Polimorfismo.EJ1.Date;
import Tema4.Polimorfismo.EJ1.Vehiculo;

public class Avion extends Vehiculo {
    String pistaAterrizaje;
    public Avion(String letraMatricula, int matricula, Date momentoEntrada, String pistaAterrizaje) {
        super(letraMatricula, matricula, momentoEntrada);
        this.pistaAterrizaje = pistaAterrizaje;
    }
}
