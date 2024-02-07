package Tema4.Herencias.EJ1;

class Camion extends Vehiculo {
    private int pesoMax;
    private boolean peligrosa;
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
    public void setPeligrosa(boolean peligrosa) {
        this.peligrosa = peligrosa;
    }
    public Camion(String marca, String modelo, String matricula, String bastidor, int pesoMax, boolean peligrosa) {
        super(marca,modelo,matricula,bastidor);
        this.pesoMax = pesoMax;
        this.peligrosa = peligrosa;
    }
}