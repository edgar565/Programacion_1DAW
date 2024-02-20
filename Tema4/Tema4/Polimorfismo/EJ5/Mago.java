package Tema4.Polimorfismo.EJ5;

public class Mago extends Combatiente implements ICombatiente{

    public Mago(int vida) {
        super(vida);
    }

    @Override
    public Ataque atacar() {
        int cantidad = vida / 2;
        Ataque ataque = new Ataque(cantidad, Ataque.TipoDano.MAGICO, Ataque.TipoAtaque.A_DISTANCIA);

        return ataque;
    }
    @Override
    public void defender(Ataque ataque) {

        if (!(ataque.getTipoDano() == Ataque.TipoDano.FISICO) && !(ataque.getTipoAtaque() == Ataque.TipoAtaque.CUERPO_A_CUERPO)) {
        }
    }

    @Override
    public Boolean estaVivo() {
        return null;
    }
}