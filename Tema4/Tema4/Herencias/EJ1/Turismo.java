package Tema4.Herencias.EJ1;

class Turismo extends Vehiculo {
    private int numero_Plazas;
    private TipoUso tipo;
    public enum TipoUso {
        PROFESIONAL, PARTICULAR
    }
    public void setTipo(TipoUso tipoNuevo) {
        TipoUso tipo = tipoNuevo;
    }
    public Turismo(String marca, String modelo, String matricula, String bastidor, int numero_Plazas, TipoUso tipo) {
        super(marca,modelo,matricula,bastidor);
        this.numero_Plazas = numero_Plazas;
        this.tipo = tipo;
    }
}