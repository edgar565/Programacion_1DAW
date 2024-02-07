package Tema4.Herencias.EJ1;

class Turismo extends vehiculo{
    private int numero_Plazas;
    private tipoUso tipo;
     enum tipoUso{
        PROFESIONAL, PARTICULAR
    }
    public void setTipo(tipoUso tipoNuevo) {
        tipoUso tipo = tipoNuevo;
    }
    public Turismo(String marca, String modelo, String matricula, String bastidor, int numero_Plazas, tipoUso tipo) {
        super(marca,modelo,matricula,bastidor);
        this.numero_Plazas = numero_Plazas;
        this.tipo = tipo;
    }
}