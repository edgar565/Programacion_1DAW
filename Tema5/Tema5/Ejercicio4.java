package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {
    static Scanner scanner = new Scanner(System.in);
    private static Set<String> carro = new HashSet<>();
    private static Set<String> listaCompra = new HashSet<>();
    public static void main(String[] args) {
        int menuOpcion;
        do {
            menuOpcion = menu();
            if (menuOpcion == 1) {
                addProductoLista();
            } else if (menuOpcion == 2) {
                addProductoCarro();
            } else if (menuOpcion == 3) {
                mostrarProductosCarrito();
            } else if (menuOpcion == 4) {
                mostrarProductosFaltantes();
            } else if (menuOpcion == 5) {
                mostrarProductosListaCompra();
            }
        } while (menuOpcion != 0);
    }
    public static int menu(){
        int menuOpcion;
        do {
            System.out.print("\n0. Salir\n" +
                    "1. Añadir un producto a la lista de la compra\n" +
                    "2. Añadir un producto al carrito\n" +
                    "3. Mostrar productos en el carrito\n" +
                    "4. Mostrar productos faltantes\n" +
                    "5. Mostrar productos en la lista de la compra\n" +
                    "Selecciona una opción: ");
            menuOpcion = scanner.nextInt();
        } while (menuOpcion < 0 || menuOpcion > 5);
        return menuOpcion;
    }
    public static void addProductoLista(){
        System.out.println("Dime un producto para añadir a la lista de la compra");
        String producto = scanner.next();
        if (listaCompra.contains(producto)) {
            System.out.println("El producto ya está en la lista!!");
        } else  {
            System.out.println("Se ha añadido el producto!! " + producto);
            listaCompra.add(producto);
        }
    }
    public static void addProductoCarro(){
        System.out.println("Dime un producto para añadir al carrito de la compra");
        String producto = scanner.next();
        if (carro.contains(producto)) {
            System.out.println("El producto ya está en el carrito!!");
        } else if (listaCompra.contains(producto)) {
            carro.add(producto);
            System.out.println("Producto añadido al carrito: " + producto);
        } else {
            System.out.println("El producto no está en la lista de la compra!!");
        }
    }
    public static void mostrarProductosListaCompra(){
        System.out.println("\nProductos en la lista de la compra:");
        if (listaCompra.isEmpty()) {
            System.out.println("La lista está vacío.");
        } else {
            for (String producto : listaCompra) {
                System.out.println(producto);
            }
        }
    }

    public static void mostrarProductosCarrito(){
        System.out.println("\nProductos en el carrito de la compra:");
        if (carro.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (String producto : carro) {
                System.out.println(producto);
            }
        }
    }

    public static void mostrarProductosFaltantes(){
        System.out.println("\nProductos faltantes en el carrito de la compra:");
        Set<String> productosFaltantes = new HashSet<>(listaCompra);
        productosFaltantes.removeAll(carro);
        if (productosFaltantes.isEmpty()) {
            System.out.println("No falta ningún producto en el carrito.");
        } else {
            for (String producto : productosFaltantes) {
                System.out.println(producto);
            }
        }
    }

}