package Tema4.Polimorfismo.EJ2;

import Tema4.Polimorfismo.EJ1.Date;
import Tema4.Polimorfismo.EJ1.Vehiculo;

public class Barco extends Vehiculo {
    String canal;

    public Barco(String letraMatricula, int matricula, Date momentoEntrada, String canal){
        super(letraMatricula, matricula, momentoEntrada);
        this.canal = canal;
    }
}
