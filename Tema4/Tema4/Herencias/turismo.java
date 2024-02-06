package Tema4.Herencias;

class turismo extends vehiculo{
    private int numero_Plazas;
    private String tipo;
    public enum tipoUso{
        PROFESIONAL, PARTICULAR
    }
    public void setTipo(tipoUso tipoNuevo) {
        tipoUso tipo = tipoNuevo;
    }
    public turismo(String marca, String modelo, String matricula, String bastidor, int numero_Plazas, String tipo) {
        super(marca,modelo,matricula,bastidor);
        this.numero_Plazas = numero_Plazas;
        this.tipo = tipo;
    }
}