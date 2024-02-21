package Tema4.Polimorfismo.EJ5;

public class Ataque{
    protected int cantidad;
    enum TipoDano{
        FISICO, MAGICO
    }
    protected TipoDano tipoDano;

    enum TipoAtaque {
        CUERPO_A_CUERPO, A_DISTANCIA;
    }
    protected TipoAtaque tipoAtaque;

    public Ataque(int cantidad, TipoDano tipoDano, TipoAtaque tipoAtaque) {
        this.cantidad = cantidad;
        this.tipoDano = tipoDano;
        this.tipoAtaque = tipoAtaque;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }

    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }
}