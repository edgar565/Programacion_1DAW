package Tema6.Ejercicio2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Aplicacion {
    //static List<String> datosFunkos = new ArrayList<>();
    static List<Funko> funkos = new ArrayList<>();
    static Path path = Path.of("/home/edgsannic/Descargas/funkos.csv");
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
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
                removeFunko();
                break;
            case 3:
                mostrarTodosFunkos();
                break;
            case 4:
                mostrarMediaFunkos();
                break;
            case 5:
                mostrarModelosFunkos();
                break;
            case 6:
                mostrarFunkosFecha();
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
        List<String> datosCSV = new ArrayList<>() ;
        try {
            datosCSV = Files.readAllLines(path);
            for (int i = 1; i < datosCSV.size(); i++){
                String[] datosFunkos = new String[0];
                clearArray(datosFunkos);
                datosFunkos = datosCSV.get(i).split(",");
                double precio = Double.parseDouble(datosFunkos[3]);
                String fechaStr = Arrays.toString(datosFunkos[4].split("-"));
                Date fecha = new Date();
                try {
                    fecha = dateFormat.parse(fechaStr);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                funkos.add(new Funko(datosFunkos[0], datosFunkos[1], datosFunkos[2], precio, fecha));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }
    public static String[] clearArray(String[] array) {
        return new String[array.length];
    }

    public static void saveFunkos(List<Funko> funkos){
        try {
            try {
                RandomAccessFile archivo = new RandomAccessFile(path.toFile(), "rw");
                archivo.setLength(0);
                archivo.close();
                System.out.println("Contenido del archivo borrado correctamente.");
            } catch (IOException e) {
                System.out.println("Error al borrar el contenido del archivo: " + e.getMessage());
            }
            for (Funko funko : funkos){
                 // Files.write(Path.of(path.toUri()), funko.toString().getBytes());
                int i = 0;
                if (i == 0){
                    Files.writeString(Path.of(path.toUri()), "COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
                }
                String funko1 = guardarFunko(funko);
                Files.writeString(Path.of(path.toUri()), funko1);
                i++;
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    public static String guardarFunko(Funko funko){
        return funko.getCodigo() + "," + funko.nombre + "," + funko.getModelo() + "," + funko.getPrecio() + "," + funko.getFechaLanzamiento();
    }
    public static void removeFunko(){
        System.out.print("Introduce el codigo del funko que quieres eliminar: ");
        String codigo = scanner.nextLine();
        for (Funko funko : funkos){
            if (funko.getCodigo().equals(codigo)){
                funkos.remove(funko);
            }
        }
        saveFunkos(funkos);
    }
    public static void mostrarTodosFunkos() {
        for (Funko funko : funkos) {
            System.out.println(funko);
        }
    }
    public static void mostrarMediaFunkos() {
        double media = 0;
        int contador = 0;
        for (Funko funko : funkos) {
            media += funko.getPrecio();
            contador++;
        }
        System.out.println("El precio medio de los funkos es: " + media / contador);
    }
    public static void mostrarModelosFunkos(){
        List<Funko> funkos1 = funkos;
        List<Funko> funkosPorModelo = new ArrayList<>();
        int contador = 0;
        while(!funkos1.isEmpty()){
            if (funkos1.get(contador).getModelo().equals(funkos1.get(contador + 1).getModelo())){
                funkosPorModelo.add(funkos1.get(contador));
                contador++;
            }else if (funkos1.get(contador).getModelo().equals(funkos1.get(contador + 2).getModelo())){
                funkosPorModelo.add(funkos1.get(contador));
                contador++;
            }
        }
        for (Funko funko : funkosPorModelo){
            System.out.println(funko);
        }
    }
    public static void mostrarFunkosFecha(){
        System.out.print("Introduce el año para buscar los funkos: ");
        String year = scanner.next();
        for (Funko funko : funkos) {
            int i = 0;
            String[] fecha = String.valueOf(funko.getFechaLanzamiento()).split("-");
            if (fecha[i].equals(year)){
                System.out.println(funko);
                break;
            }
            i = i + 3;
        }
    }
}