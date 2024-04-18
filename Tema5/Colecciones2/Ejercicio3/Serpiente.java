package Colecciones2.Ejercicio3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Serpiente {
    private int edad;
    private List<Character> cuerpo;
    private Random random = new Random();

    public Serpiente() {
        cuerpo = new ArrayList<>();
    }

    public void nacer() {
        int longitudInicial = 5;
        for (int i = 0; i < longitudInicial; i++) {
            cuerpo.add(generarColorAleatorio());
        }
        edad = 0;
    }
    private char generarColorAleatorio() {
        char[] colores = {'r', 'v', 'a'};
        return colores[random.nextInt(colores.length)];
    }
    public boolean estaViva() {
        return !cuerpo.isEmpty();
    }
    public void vivir() {
        if (!estaViva()) return;

        edad++;
        if (edad < 10) {
            crecer();
            if (random.nextDouble() < 0.2) mudarPiel();
        } else {
            decrecer();
            if (random.nextDouble() < 0.1) mudarPiel();
            if (random.nextDouble() < 0.1) morirPorAtaqueDeMangosta();
        }
    }

    private void crecer() {
        if (random.nextDouble() < 0.8) {
            cuerpo.add(generarColorAleatorio());
        }
    }

    private void decrecer() {
        if (random.nextDouble() < 0.9 && !cuerpo.isEmpty()) {
            cuerpo.remove(cuerpo.size() - 1);
        }
    }

    private void mudarPiel() {
        char nuevoColor = generarColorAleatorio();
        for (int i = 0; i < cuerpo.size(); i++) {
            cuerpo.set(i, nuevoColor);
        }
    }

    private void morirPorAtaqueDeMangosta() {
        cuerpo.clear();
    }
    @Override
    public String toString() {
        return "Serpiente{" +
                "cuerpo=" + cuerpo +
                ", edad=" + edad +
                '}';
    }
}