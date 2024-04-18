package Colecciones2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NidoSerpientes {
    private List<Serpiente> serpientes;
    private Random random;

    public NidoSerpientes() {
        serpientes = new ArrayList<>();
        random = new Random();
    }
    public static void main(String[] args) {
        NidoSerpientes nido = new NidoSerpientes();
        nido.simularVida(300);
    }

    public void simularVida(int duracionSegundos) {
        for (int segundo = 1; segundo <= duracionSegundos; segundo++) {
            System.out.println("Segundo " + segundo + ":");
            nacerSerpientesAleatoriamente();
            vivirSerpientes();
            if (segundo % 10 == 0) ataqueDeMangosta();
            mostrarEstado();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void nacerSerpientesAleatoriamente() {
        int cantidad = random.nextInt(3) + 1;
        for (int i = 0; i < cantidad; i++) {
            Serpiente serpiente = new Serpiente();
            serpiente.nacer();
            serpientes.add(serpiente);
        }
    }

    private void vivirSerpientes() {
        for (Serpiente serpiente : serpientes) {
            serpiente.vivir();
        }
        serpientes.removeIf(serpiente -> !serpiente.estaViva());
    }

    private void ataqueDeMangosta() {
        int cantidad = random.nextDouble() < 0.2 ? random.nextInt(5) + 1 : 0;
        for (int i = 0; i < cantidad && !serpientes.isEmpty(); i++) {
            serpientes.remove(random.nextInt(serpientes.size()));
        }
        System.out.println("¡Ataque de mangosta! Se han comido " + cantidad + " serpiente(s).");
    }

    private void mostrarEstado() {
        if (serpientes.isEmpty()) {
            System.out.println("El nido está vacío.");
        } else {
            System.out.println("Estado del nido:");
            for (int i = 0; i < serpientes.size(); i++) {
                System.out.println("Serpiente " + (i + 1) + ": " + serpientes.get(i));
            }
        }
    }
}
