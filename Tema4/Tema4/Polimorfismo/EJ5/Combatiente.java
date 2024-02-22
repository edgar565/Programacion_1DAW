package Tema4.Polimorfismo.EJ5;

public class Combatiente implements ICombatiente {
    int vida;
    public Combatiente(int vida) {
        this.vida = vida;
    }

    @Override
    public Ataque atacar() {
        return null;
    }

    @Override
    public void defender(Ataque ataque) {
    }
    @Override
    public Boolean estaVivo() {
        return null;
    }
}