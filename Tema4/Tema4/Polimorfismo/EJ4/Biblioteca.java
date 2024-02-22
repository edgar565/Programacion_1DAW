package Tema4.Polimorfismo.EJ4;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Producto> productos;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion = 0;
        while (opcion != 7) {
            System.out.print("Selecciona una opción: \n" +
                    "1. Añadir libro\n" +
                    "2. Añadir revista\n" +
                    "3. Añadir DVD\n" +
                    "4. Buscar ítem\n" +
                    "5. Eliminar ítem\n" +
                    "6. Listado de la biblioteca\n" +
                    "7. Salir \n" +
                    "Opción seleccionada: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            String titulo;
            int referencia;
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    titulo= scanner.nextLine();
                    System.out.print("Ingrese la referencia del libro: ");
                    referencia = scanner.nextInt();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.anadirProducto(new Libro(referencia, titulo, isbn));
                    break;
                case 2:
                    System.out.print("Ingrese el título de la revista: ");
                    titulo = scanner.nextLine();
                    System.out.print("Ingrese la referencia de la revista: ");
                    referencia = scanner.nextInt();
                    biblioteca.anadirProducto(new Revista(referencia, titulo));
                    break;
                case 3:
                    System.out.print("Ingrese el título del DVD: ");
                    titulo = scanner.nextLine();
                    System.out.print("Ingrese la referencia del DVD: ");
                    referencia = scanner.nextInt();
                    biblioteca.anadirProducto(new DVD(referencia, titulo));
                    break;
                case 4:
                    System.out.print("Ingrese el título del ítem a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    biblioteca.buscarProducto(tituloBuscar);
                    break;
                case 5:
                    System.out.print("Ingrese el título del ítem a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    biblioteca.eliminarProducto(tituloEliminar);
                    break;
                case 6:
                    biblioteca.listarBiblioteca();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println(" \n" +
                            "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    public Biblioteca(){
        productos = new ArrayList<>();
    }
    public void anadirProducto(Producto producto) {
        productos.add(producto);
        System.out.println("¡Producto añadido exitosamente!");
    }

    public void buscarProducto(String titulo) {
        for (Producto producto : productos) {
            if (producto.getTipo().equals(titulo)) {
                System.out.println("Ítem encontrado:");
                System.out.println(producto.getInfo());
                return;
            }
        }
        System.out.println("El producto no se encuentra en la biblioteca.");
    }

    public void eliminarProducto(String titulo) {
        for (Producto producto : productos) {
            if (producto.getTitulo().equals(titulo)) {
                productos.remove(producto);
                System.out.println("Producto eliminado exitosamente!");
                return;
            }
        }
        System.out.println("El producto no se encuentra en la biblioteca.");
    }

    public void listarBiblioteca() {
        System.out.println("Listado de la biblioteca:");
        for (Producto producto : productos) {
            System.out.println(producto.getInfo());
        }
    }

}