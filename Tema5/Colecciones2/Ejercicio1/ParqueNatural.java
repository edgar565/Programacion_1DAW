package Colecciones2.Ejercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParqueNatural {
    private static List<Avistamiento> avistamientos = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.print("1. Añadir avistamiento\n" +
                "2. Mostrar todos los avistamientos a partir de las 8 horas\n" +
                "3. Mostrar todos los avistamientos nocturnos (entre las 20 y las 8)\n" +
                "4. Mostrar las manadas de lobos\n" +
                "5. Mostrar serpientes\n" +
                "6. Mostarar pájaros\n" +
                "Porfavor seleccióne una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.print("1. Avistamiento de manadas de lobos\n" +
                        "2. Avistamiento de Serpientes\n" +
                        "3. Avistamiento de Pájaros\n" +
                        "Porfavor seleccione el avistamiento: ");
                int opcionAvistamiento = scanner.nextInt();
                anadirAvistamiento(opcionAvistamiento);
                break;
            case 2:
                mostrar8();
                break;
            case 3:
                mostrar20a8();
                break;
            case 4:
                mostrarManadas();
                break;
            case 5:
                mostrarSerpientes();
                break;
            case 6:
                mostrarPajaros();
                break;
        }
    }
    public static void anadirAvistamiento(int opcionAvistamiento){
        System.out.print("Porfavor introduce la hora del avistamiento: ");
        int hora = scanner.nextInt();
        switch (opcionAvistamiento){
            case 1:
                System.out.print("Introduce el numero de lobos: ");
                int numLobos = scanner.nextInt();
                System.out.print("Introduce las observaciones pertinentes: ");
                String observaciones = scanner.next();
                AvistamientoManadasLobos manadasLobos = new AvistamientoManadasLobos(hora,numLobos,observaciones);
                avistamientos.add(manadasLobos);
                break;
            case 2:
                System.out.print("Introduce la longitud de la serpiente: ");
                int longSerpiente = scanner.nextInt();
                System.out.println("Introduce la especie de la serpiente");
                String especieSerpiente = scanner.next();
                AvistamientoSerpientes serpiente = new AvistamientoSerpientes(hora, longSerpiente,especieSerpiente);
                avistamientos.add(serpiente);
                break;
            case 3:
                System.out.print("Introduce el peso del pájaro: ");
                int pesoPajaro = scanner.nextInt();
                System.out.println("Introduce la especie del pájaro");
                String especiePajaro = scanner.next();
                AvistamientoPajaros pajaro = new AvistamientoPajaros(hora, longSerpiente,especieSerpiente);
                avistamientos.add(pajaro);
                break;
        }
    }
    public static void mostrar8(){

    }
    public static void mostrar20a8(){

    }
    public static void mostrarManadas(){

    }
    public static void mostrarSerpientes(){

    }
    public static void mostrarPajaros(){

    }


}