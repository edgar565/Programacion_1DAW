package Tema4.Herencias;

class camion extends vehiculo {
    private int pesoMax;
    private boolean peligrosa;
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
    public void setPeligrosa(boolean peligrosa) {
        this.peligrosa = peligrosa;
    }
    public camion(int pesoMax, boolean peligrosa) {
        this.pesoMax = pesoMax;
        this.peligrosa = peligrosa;
    }
}