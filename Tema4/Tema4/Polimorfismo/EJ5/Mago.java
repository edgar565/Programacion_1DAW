package Tema4.Polimorfismo.EJ5;

import java.util.Random;

public class Mago extends Combatiente{
    Random random = new Random();

    public Mago(int vida) {
        super(vida);
    }

    @Override
    public Ataque atacar() {
        int num = random.nextInt(1,10);
        int cantidad = 0;
        if (vida >= 30){
            cantidad = vida * 3;
        }else if (vida <= 20){
            cantidad = (vida * 2) - num;
        }
        Ataque ataque;
        if (num == 1){
            ataque = new Ataque(cantidad, Ataque.TipoDano.FISICO, Ataque.TipoAtaque.CUERPO_A_CUERPO);
        }else {
            ataque = new Ataque(cantidad, Ataque.TipoDano.MAGICO, Ataque.TipoAtaque.A_DISTANCIA);
        }
        return ataque;
    }
    @Override
    public void defender(Ataque ataque) {
        if ((ataque.getTipoDano() == Ataque.TipoDano.FISICO) && (ataque.getTipoAtaque() == Ataque.TipoAtaque.CUERPO_A_CUERPO)) {
            vida =- ataque.cantidad * 2;
        } else {
            vida =- ataque.cantidad;
        }
    }

    @Override
    public Boolean estaVivo() {
        return null;
    }
}