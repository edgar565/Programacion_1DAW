package Tema4.POO1;

public class Reloj {
    public static final int DEFAULT_HORA = 0;
    public static final int DEFAULT_MINUTO = 0;
    public static final int DEFAULT_SEGUNDO = 0;
    int hora;
    int minuto;
    int segundo;
    public Reloj (){
        hora = DEFAULT_HORA;
        minuto = DEFAULT_MINUTO;
        segundo = DEFAULT_SEGUNDO;
    }
    public Reloj (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public void setHora(int hora){
        if (this.hora < 0 || this.hora >= 24){
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
        setHora(hora);
        return hora;
    }

    public int getMinuto() {
        setMinuto(minuto);
        return minuto;
    }

    public int getSegundo() {
        setSegundo(segundo);
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