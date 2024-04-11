package Tema5.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Usuario> usuarios = new HashMap<>();

    }
    public static void main(){
        int menuOpcion;
        do {
            System.out.print("1. Dar de alta un usuario\n" +
                    "2. Dar de baja un usuario\n" +
                    "3. Mostrar los datos de un usuario\n" +
                    "4. Modificar los usuario\n" +
                    "Seleccione una opción:");
            menuOpcion = scanner.nextInt();
            switch (menuOpcion){
                case 1:
                    darAlta();
                    break;
                case 2:
                    darBaja();
                    break;
                case 3:
                    mostrarInfo();
                    break;
                case 4:
                    modificarInfo();
                    break;
            }
        }while (menuOpcion < 1 || menuOpcion > 4);
    }
    public static void darAlta(){

    }
    public static void darBaja(){

    }
    public static void mostrarInfo(){

    }
    public static void modificarInfo(){

    }
}