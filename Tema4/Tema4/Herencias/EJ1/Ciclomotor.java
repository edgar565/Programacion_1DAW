package Tema4.Herencias.EJ1;

class Ciclomotor extends Vehiculo {
    private int cilindrada;
    public boolean necesitaCarnet(){
        return  cilindrada > 45;
    }

    public Ciclomotor(String marca, String modelo, String matricula, String bastidor, int cilindrada) {
        super(marca,modelo,matricula,bastidor);
        this.cilindrada = cilindrada;
    }
}
