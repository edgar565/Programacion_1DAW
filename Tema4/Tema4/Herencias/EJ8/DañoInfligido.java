package Tema4.Herencias.EJ8;

public class DañoInfligido {
    public int danoMagico(){
        return 35;
    }
    public int danoFisico(){
        return 15;
    }
    public DañoInfligido() {
    }
    String toString(int danoMagico, int danoFisico){
        return "Daño mágico: " + danoMagico + "\nDaño físico: " + danoFisico;
    }
}