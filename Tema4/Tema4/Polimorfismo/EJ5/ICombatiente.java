package Tema4.Polimorfismo.EJ5;

public interface ICombatiente {
    public Ataque atacar();
    public void defender(Ataque ataque);
    public Boolean estaVivo();
}