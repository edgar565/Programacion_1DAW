package Tema6.Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Aplicacion {
    static List<String> datosFunkos;
    static List<Funko> funkos;
    static Path path = Path.of("/home/edgsannic/Descargas/funkos.csv");
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");




    public Aplicacion() throws IOException {
    }
    public static void main(String[] args) {
        loadFunkos();
        menu();
    }
    public static void menu() {
        System.out.print("1. Añadir funko\n" +
                "2. Borrar funko\n" +
                "3. Mostrar todos los funkos\n" +
                "4. Mostrar la media de precio de los funkos\n" +
                "5. Mostrar los funkos agrupados por modelos\n" +
                "6. Mostrar los funkos de 2023\n" +
                "Porfavor seleccione una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                addFunkos();
                break;
            case 2:
                //saveFunkos(listado)
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
        }
    }
    public static void addFunkos(){
        System.out.print("Introduce el codigo del funko: ");
        String codigo = scanner.nextLine();
        System.out.print("Introduce el nombre del funko: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el modelo del funko: ");
        String modelo = scanner.nextLine();
        System.out.print("Introduce el precio del funko: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Fecha de lanzamiento (AAAA-MM-DD): ");
        String fechaStr = scanner.nextLine();
        Date fecha = new Date();
        try {
             fecha = dateFormat.parse(fechaStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        funkos.add(new Funko(codigo, nombre, modelo, precio, fecha));
        saveFunkos(funkos);
    }
    public static List<Funko> loadFunkos(){
        List<String> datosCSV;
        try {
            datosCSV = Files.readAllLines(path);
            for (int i = 1; i < datosCSV.size(); i++){
                datosFunkos.add(Arrays.toString(datosCSV.get(i).split(",")));
                double precio = Double.parseDouble(datosFunkos.get(3));
                Date fecha = new Date();
                try {
                    fecha = dateFormat.parse(datosFunkos.get(4));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                funkos.add(new Funko(datosFunkos.get(0), datosFunkos.get(1), datosFunkos.get(2), precio, fecha));
                datosFunkos.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }

    public static void saveFunkos(List<Funko> funkos){
        try {
            /*
                Borrar contenido fichero
                for de la lista de funkos
                    funko -> Strings

                    Convertir funko -> Cadena
                */
            for ()
                    Files.write(Path.of(""), "21321,213,123,123".getBytes());
        } catch (Exception ex) {
            System.out.println("Error");
        }


    }
}