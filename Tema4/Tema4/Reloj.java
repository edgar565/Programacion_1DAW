package Tema4;

public class Reloj {
    int hora;
    int minuto;
    int segundo;
    public Reloj (){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    public Reloj (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setHora(int hora){
        if (hora < 0 || hora >= 24){
            System.out.println("ERROR: Formato de hora no valida");
        }else {
            this.hora = hora;
        }
    }
    public void setMinuto(int minuto){

        if (minuto < 0 || minuto >= 60){
            System.out.println("ERROR: Formato de hora no valida");
        }else {
            this.minuto = minuto;
        }
    }
    public void setSegundo(int segundo){

        if (segundo < 0 || segundo >= 60){
            System.out.println("ERROR: Formato de hora no valida");
        }else {
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    public String toString(){
        String string = getHora() + ":" + getMinuto() + ":" + getSegundo();
        return string;
    }

    public void mostrarHora(){
        System.out.println(getHora() + ":" + getMinuto() + ":" + getSegundo());
    }
}