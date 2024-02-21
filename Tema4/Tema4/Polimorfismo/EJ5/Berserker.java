package Tema4.Polimorfismo.EJ5;

import java.util.Random;

public class Berserker extends Combatiente{
    Random random = new Random();
    public Berserker(int vida) {
        super(vida);
    }
    @Override
    public Ataque atacar() {
        int num = random.nextInt(1,10);
        int cantidad = 0;
        if (vida <= 20){
            cantidad = vida * 3;
        }else if (vida >= 30){
            cantidad = (vida * 2) - num;
        }
        Ataque ataque = new Ataque(cantidad,Ataque.TipoDano.FISICO,Ataque.TipoAtaque.CUERPO_A_CUERPO);;
        return ataque;
    }
    @Override
    public void defender(Ataque ataque) {
        int masDano = random.nextInt(1,15);
        int menosDano = random.nextInt(16,25);
        if (ataque.getTipoAtaque() == Ataque.TipoAtaque.A_DISTANCIA){
            ataque.cantidad = ataque.getCantidad() - masDano;
            vida =- ataque.cantidad;
        }else {
            ataque.cantidad = atacar().getCantidad() - menosDano;
            vida =- ataque.cantidad;
        }
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