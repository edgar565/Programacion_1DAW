package Tema4.Polimorfismo.EJ1;

import java.util.Stack;

abstract class Vehiculo {
    int matricula;
    String letraMatricula;

    MomentoEntrada momentoEntrada;
    public Vehiculo(char[] letraMatricula, int[] matricula, MomentoEntrada momentoEntrada) {
    }
    public String toString(){
        return "Matricula: " + matricula + "-" + letraMatricula + momentoEntrada;
    }

}