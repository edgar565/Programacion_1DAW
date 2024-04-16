package Tema5.Colecciones1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class ListaCompra {
    static Scanner scanner = new Scanner(System.in);
    private static Set<String> listaCompra = new HashSet<>();
    public static void main(String[] args) {
        int menuOpcion;
        do {
            menuOpcion = menu();
            if (menuOpcion != 0) {
                addProducto();
            }
        } while (menuOpcion != 0);
        for (String producto : listaCompra) {
            System.out.println("Lista de productos:");
            System.out.println(producto);
        }
    }
    public static int menu(){
        int menuOpcion;
        do {
            System.out.print("0. No añadir mas productos\n" +
                    "1. Añadir un proucto\n" +
                    "Selecciona una opción: ");
            menuOpcion = scanner.nextInt();
        } while (menuOpcion < 0 || menuOpcion > 1);
        return menuOpcion;
    }
    public static void addProducto(){
        System.out.println("Dime un producto para añadir a la lista de la compra");
        String producto = scanner.next();
        if (listaCompra.contains(producto)) {
            System.out.println("YA EXISTE EL PRODUCTO!! " + producto);
        } else {
            listaCompra.add(producto);
        }
    }
}