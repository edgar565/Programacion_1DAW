package Tema4.Polimorfismo.EJ3;
import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<Animal>();
        int segundo = 0;
        Random random = new Random();
        while (true){
            segundo++;
            System.out.println("Segundo " + segundo + ": Se escucha un ruido en el bosque.");
            Animal animal;
            if (random.nextBoolean()) {
                animal = new AnimalSeva();
            } else {
                animal = new AnimalAtaca();
            }
            animales.add(animal);
            animal.hacerRuido();
            if (!animal.seva()) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lista de animales:");
        for (Animal animal : animales) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}