package Tema4.Polimorfismo.EJ4;

import Tema4.Polimorfismo.EJ3.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona una opción: \n" +
                "1. Añadir ítem\n" +
                "2. Buscar ítem\n" +
                "3. Eliminar ítem\n" +
                "4. Listado de la biblioteca\n" +
                "5. Salir");
        int opcion = scanner.nextInt();
        ArrayList<Animal> animales = new ArrayList<Animal>();
    }
}