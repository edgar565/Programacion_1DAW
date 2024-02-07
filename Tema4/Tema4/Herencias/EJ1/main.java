package Tema4.Herencias.EJ1;


public class main {

    public static void main(String[] args) {
        camion camion = new camion("tesla","s","1234-KWS","0123456789",555,true);
        camion.setPeligrosa(false);
        camion.setPesoMax(125);

        Turismo turismo = new Turismo("tesla","s","1234-KWS","0123456789",9, Turismo.tipoUso.PROFESIONAL);
        turismo.setTipo(Turismo.tipoUso.PARTICULAR);

        ciclomotor ciclomotor = new ciclomotor("tesla","s","1234-KWS","0123456789", 115);
        ciclomotor.necesitaCarnet();
    }
}
