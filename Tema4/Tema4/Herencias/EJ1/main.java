package Tema4.Herencias.EJ1;


public class main {

    public static void main(String[] args) {
        Camion camion = new Camion("tesla","s","1234-KWS","0123456789",555,true);
        camion.setPeligrosa(false);
        camion.setPesoMax(125);

        Turismo turismo = new Turismo("tesla","s","1234-KWS","0123456789",9, Turismo.tipoUso.PROFESIONAL);
        turismo.setTipo(Turismo.tipoUso.PARTICULAR);

        Ciclomotor ciclomotor = new Ciclomotor("tesla","s","1234-KWS","0123456789", 115);
        ciclomotor.necesitaCarnet();
    }
}
