package Tema4.Herencias;

abstract class vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String bastidor;

    public vehiculo(String marca, String modelo, String matricula, String bastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.bastidor = bastidor;
    }
}