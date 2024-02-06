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
    public turismo(int numero_Plazas, String tipo) {
        this.numero_Plazas = numero_Plazas;
        this.tipo = tipo;
    }
}