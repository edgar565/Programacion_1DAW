package Tema4.Herencias.EJ8;

public class Coste {
    public int costeMana(){
        return 30;
    }
    public int costeEsfuerzoFisico(){
        return 65;
    }

    public Coste() {
    }
    String toString(int costeMana, int costeEsfuerzoFisico){
        return "Coste Mana: " + costeMana + "\nCoste Esfuerzo Fisico: " + costeEsfuerzoFisico;
    }
}