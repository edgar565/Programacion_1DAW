package Colecciones2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AcortadorURL {
    private static Map<String,String> direcciones = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
        int opcion;
        do {
            System.out.print("\n1. Crear nueva dirección\n" +
                    "2. Mostrar la dirección\n" +
                    "3. Borrar la dirección\n" +
                    "4. Mostrar todas las direcciones\n" +
                    "Porfavor seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    crearDir();
                    break;
                case 2:
                    buscarDir();
                    break;
                case 3:
                    borrarDir();
                    break;
                case 4:
                    mostrarDir();
                    break;
            }
        }while (opcion != 55);
    }
    public static String generarClave() {
        char[] caracteres = new char[6];
        for (int i = 0; i < 6; i++) {
            caracteres[i] = (char) (random.nextInt(26) + 'a');
        }
        return new String(caracteres);
    }
    public static void crearDir(){
        String clave = generarClave();
        System.out.print("Porfavor intoduce la URL: ");
        String url = scanner.next();
        System.out.print("Clave única: " + clave + "\n URL: " + url);
        direcciones.put(clave,url);
    }
    public static void buscarDir(){
        System.out.print("Porfavor intoduce la clave: ");
        String clave = scanner.next();
        if (direcciones.containsKey(clave)){
            System.out.println("La URL es: " + direcciones.get(clave));
        } else {
            System.out.println("La clave: " + clave + " no existe");
        }
    }
    public static void borrarDir(){
        System.out.print("Porfavor intoduce la clave que deseas eliminar: ");
        String clave = scanner.next();
        if (direcciones.containsKey(clave)){
            direcciones.remove(clave);
            System.out.println("La URL ha sido eliminada");
        } else {
            System.out.println("La clave: " + clave + " no existe");
        }
    }
    public static void mostrarDir(){
        for (Map.Entry<String, String> entry : direcciones.entrySet()) {
           System.out.println("Clave: " + entry.getKey() + ", URL: " + entry.getValue());
        }
    }

}
