package Tema4.Polimorfismo.EJ5;

public class AtaqueFisico extends Ataque{


    public AtaqueFisico(int cantidad, TipoDano tipoDano, TipoAtaque tipoAtaque) {
        super(cantidad, tipoDano, tipoAtaque);
    }

    @Override
    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }

    @Override
    public TipoDano getTipoDano() {
        return tipoDano;
    }
}