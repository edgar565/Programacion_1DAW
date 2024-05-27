package Tema6.Ejercicio2.Serializacion;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AplicacionSerializacion {
    static List<FunkoSerializacion> funkos = new ArrayList<>();
    static File file = new File("/home/edgsannic/Descargas/funkos.ser");
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
                "Por favor, seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
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
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void addFunkos() {
        System.out.print("Introduce el código del funko: ");
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
        funkos.add(new FunkoSerializacion(codigo, nombre, modelo, precio, fecha));
        saveFunkos();
    }

    public static void loadFunkos() {
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                funkos = (List<FunkoSerializacion>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveFunkos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(funkos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeFunko() {
        System.out.print("Introduce el código del funko que quieres eliminar: ");
        String codigo = scanner.nextLine();
        funkos.removeIf(funko -> funko.getCodigo().equals(codigo));
        saveFunkos();
    }

    public static void mostrarTodosFunkos() {
        for (FunkoSerializacion funko : funkos) {
            System.out.println(funko);
        }
    }

    public static void mostrarMediaFunkos() {
        double media = funkos.stream().mapToDouble(FunkoSerializacion::getPrecio).average().orElse(0);
        System.out.println("El precio medio de los funkos es: " + media);
    }

    public static void mostrarModelosFunkos() {
        funkos.stream()
                .collect(Collectors.groupingBy(FunkoSerializacion::getModelo))
                .forEach((modelo, listaFunkos) -> {
                    System.out.println("Modelo: " + modelo);
                    listaFunkos.forEach(System.out::println);
                });
    }

    public static void mostrarFunkosFecha() {
        System.out.print("Introduce el año para buscar los funkos: ");
        String year = scanner.next();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        funkos.stream()
                .filter(funko -> yearFormat.format(funko.getFechaLanzamiento()).equals(year))
                .forEach(System.out::println);
    }
}
