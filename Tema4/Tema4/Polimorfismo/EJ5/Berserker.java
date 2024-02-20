package Tema4.Polimorfismo.EJ5;

import java.util.Random;

public class Berserker extends Combatiente implements ICombatiente{
    Random random = new Random();
    public Berserker(int vida) {
        super(vida);
    }

    @Override
    public Ataque atacar() {
        int cantidad = random.nextInt(1,55);

        if (ataque.getTipoDano() == Ataque.TipoDano.FISICO){
            Ataque ataque = new Ataque(cantidad,);

        }
        return ataque;
    }
    @Override
    public void defender(Ataque ataque) {
        if (Ataque.TipoAtaque.A_DISTANCIA){

        }
        return 0;
    }
    @Override
    public Boolean estaVivo() {
        boolean vivo;
        if (vida >= 0){
            vivo = true;
        }else{
            vivo = false;
        }
        return vivo;
    }
}