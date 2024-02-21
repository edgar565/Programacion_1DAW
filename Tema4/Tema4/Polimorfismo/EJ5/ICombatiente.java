package Tema4.Polimorfismo.EJ5;

public interface ICombatiente {
    Ataque atacar();
     void defender(Ataque ataque);
     Boolean estaVivo();
}