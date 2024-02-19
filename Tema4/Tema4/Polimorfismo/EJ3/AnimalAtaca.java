package Tema4.Polimorfismo.EJ3;

import java.util.Random;

public class AnimalAtaca extends Animal{
    @Override
    public void hacerRuido() {
        System.out.println("El animal nos ataca!! Huir rapido");
    }

    @Override
    public boolean seva() {
        return new Random().nextDouble() < 0.05;
    }
}