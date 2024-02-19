package Tema4.Polimorfismo.EJ5;

public class Berserker extends Combatiente implements ICombatiente{


    public Berserker(int vida) {
        super(vida);
    }

    @Override
    public Ataque atacar() {

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
