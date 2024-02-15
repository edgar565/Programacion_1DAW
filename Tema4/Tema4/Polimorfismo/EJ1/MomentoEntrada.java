package Tema4.Polimorfismo.EJ1;

public class MomentoEntrada {
    int dia;
    int mes;
    int año;
    int hora;
    int minuto;

    public MomentoEntrada(int dia, int mes, int año, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
    }
    public String toString(){
        return "Fecha: " + dia + "/" + mes + "/" + año + " Hora: " + hora + ":" + minuto;
    }
}
