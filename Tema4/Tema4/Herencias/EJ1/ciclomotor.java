package Tema4.Herencias.EJ1;

class ciclomotor extends vehiculo{
    private int cilindrada;
    public boolean necesitaCarnet(){
        boolean necesitaCarnet= false;
        if (cilindrada > 45){
            necesitaCarnet = true;
        }
        return necesitaCarnet;
    }

    public ciclomotor(String marca, String modelo, String matricula, String bastidor, int cilindrada) {
        super(marca,modelo,matricula,bastidor);
        this.cilindrada = cilindrada;
    }
}
