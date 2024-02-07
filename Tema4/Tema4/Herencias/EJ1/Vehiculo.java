package Tema4.Herencias.EJ1;

abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String bastidor;

    public Vehiculo(String marca, String modelo, String matricula, String bastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.bastidor = bastidor;
    }
}