package Tema4.Polimorfismo.EJ5;

public class Mago extends Combatiente implements ICombatiente{

    public Mago(int vida) {
        super(vida);
    }

    @Override
    public Ataque atacar() {
        return null;
    }

    @Override
    public Ataque defender() {
        return null;
    }

    @Override
    public Boolean estaVivo() {
        return null;
    }
}
