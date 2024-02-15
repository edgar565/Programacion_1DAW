package Tema4.Polimorfismo.EJ1;

public abstract class Vehiculo {
    int matricula;
    String letraMatricula;

    Date momentoEntrada;
    public Vehiculo(String letraMatricula, int matricula, Date momentoEntrada) {
    }
    public String toString(){
        return "Matricula: " + matricula + "-" + letraMatricula + momentoEntrada;
    }

}