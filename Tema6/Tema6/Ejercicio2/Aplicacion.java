package Tema6.Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    static List<String> datosFunkos;
    static List<Funko> funkos;

    public Aplicacion() throws IOException {
    }
    public static void main(String[] args) {
        //loadFunkos()
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
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
                addFunko();
                //devuelve el listado saveFunkos()
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

    public static void addFunko() {

        for (int i = 0; i < datosFunkos.size(); i++){
            double precio = Double.parseDouble(datosFunkos.get(3));
            Date fecha = datosFunkos.get(4);
            funkos.add(new Funko(datosFunkos.get(0), datosFunkos.get(1), datosFunkos.get(2), precio, fecha));
        }

    }

    public List<Funko> loadFunkos(){
        try {
            List<String> datosCSV = Files.readAllLines(Path.of(""));
            for (int i = 0; i < datosCSV.size();i++){

            }
                //split
                //new funko
                //add


        }catch (Exception ex) {
            System.out.println("Error");
        }


        return List.of();
    }

    public void saveFunkos(List<Funko> funkos){
        try {
            /*
                for
                    Convertir funko -> Cadena
                */
                    Files.write(Path.of(""), "21321,213,123,123".getBytes());
        } catch (Exception ex) {
            System.out.println("Error");
        }


    }
}