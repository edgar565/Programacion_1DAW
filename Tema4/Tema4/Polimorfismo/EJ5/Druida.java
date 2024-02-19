package Tema4.Polimorfismo.EJ5;

public class Druida extends Combatiente implements ICombatiente{
    public Druida(int vida) {
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
