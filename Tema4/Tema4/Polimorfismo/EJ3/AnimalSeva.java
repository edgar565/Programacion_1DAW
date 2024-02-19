package Tema4.Polimorfismo.EJ3;

import java.util.Random;

public class AnimalSeva extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Hace ruido");
    }

    @Override
    public boolean seva() {
        return new Random().nextDouble() < 0.95;
    }
}