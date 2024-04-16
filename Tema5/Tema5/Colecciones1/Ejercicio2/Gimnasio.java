package Tema5.Colecciones1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {
    static Scanner scanner = new Scanner(System.in);
    private static Map<String,Usuario> usuarios = new HashMap<>();
    public static void main(String []args){
        int menuOpcion;
        do {
            System.out.print("\n1. Dar de alta un usuario\n" +
                    "2. Dar de baja un usuario\n" +
                    "3. Mostrar los datos de un usuario\n" +
                    "4. Modificar los usuario\n" +
                    "Seleccione una opción:");
            menuOpcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Porfavor introduce el DNI");
            String dni;
            switch (menuOpcion){
                case 1:
                    dni = scanner.next();
                    darAlta(dni);
                    break;
                case 2:
                    dni = scanner.next();
                    darBaja(dni);
                    break;
                case 3:
                    dni = scanner.next();
                    mostrarInfo(dni);
                    break;
                case 4:
                    dni = scanner.next();
                    modificarInfo(dni);
                    break;
            }
        }while (menuOpcion != 55);
    }
    public static void darAlta(String dni){
        System.out.println("Porfavor introduce un nombre");
        String nombre = scanner.next();
        System.out.println("Porfavor intruduce la edad");
        int edad = scanner.nextInt();
        Usuario usuario= new Usuario(nombre,edad);
        usuarios.put(dni,usuario);
    }
    public static void darBaja(String dni){
        if (usuarios.containsKey(dni)){
            Usuario usuario = usuarios.get(dni);
            System.out.println("El usuario con los sisguientes datos. Ha sido eliminado! ");
            System.out.println("DNI: " + dni);
            System.out.println(usuario.toString());
        } else {
            System.out.println("El DNI introducido no existe");
        }
        usuarios.remove(dni);
    }
    public static void mostrarInfo(String dni){
        if (usuarios.containsKey(dni)){
            Usuario usuario = usuarios.get(dni);
            System.out.println("DNI: " + dni);
            System.out.println(usuario.toString());
        } else {
            System.out.println("El DNI introducido no existe");
        }
    }
    public static void modificarInfo(String dni){
        if (usuarios.containsKey(dni)){
            Usuario usuario = usuarios.get(dni);
            System.out.println("Se modificaran los datos del siguiente usuario! ");
            System.out.println("DNI: " + dni);
            System.out.println(usuario.toString());
            System.out.println("1. Modificar el nombre\n" +
                    "2. Modificar la edad\n" +
                    "3. Modificar el nombre y la edad\n" +
                    "Porfavor seleccione una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Porfavor introduce el nombre nuevo: ");
                    String nombreNuevo = scanner.next();
                    usuario.setNombre(nombreNuevo);
                    break;
                case 2:
                    System.out.print("Porfavor introduce la edad nueva: ");
                    String edadNueva = scanner.next();
                    usuario.setNombre(edadNueva);
                    break;
                case 3:
                    System.out.print("Porfavor introduce el nombre nuevo: ");
                    nombreNuevo = scanner.next();
                    usuario.setNombre(nombreNuevo);
                    System.out.print("Porfavor introduce la edad nueva: ");
                    edadNueva = scanner.next();
                    usuario.setNombre(edadNueva);
                    break;
            }
        } else {
            System.out.println("El DNI introducido no existe");
        }
    }
}