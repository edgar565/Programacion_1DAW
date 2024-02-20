package Tema4.Polimorfismo.EJ5;

import java.util.Random;

public class Druida implements ICombatiente{
    Random random = new Random();
    int mana;
    int MAX_MANA;
    public Druida(int mana) {
        this.mana = mana;
        this.MAX_MANA = mana;
    }

    @Override
    public Ataque atacar() {
        int cantidad = random.nextInt(1,55);
        int num = random.nextInt(1,2);
        Ataque ataque;
        if (num == 1){
             ataque = new Ataque(cantidad, Ataque.TipoDano.MAGICO, Ataque.TipoAtaque.CUERPO_A_CUERPO);
        }else {
            ataque = new Ataque(cantidad, Ataque.TipoDano.MAGICO, Ataque.TipoAtaque.A_DISTANCIA);
        }
        return ataque;
    }

    @Override
    public void defender(Ataque ataque) {
        mana =- ataque.getCantidad();
    }

    @Override
    public Boolean estaVivo() {
        boolean vivo = true;
        if (mana <= 0){
            vivo = false;
        }
        return vivo;
    }
}