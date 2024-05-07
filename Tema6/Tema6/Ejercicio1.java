package Tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            List<Path> rutas = new java.util.ArrayList<>(Files.walk(Path.of("/tmp/niats/")).toList());
            for (Path ruta : rutas) {
                if (Files.isRegularFile(ruta)) {
                    Path destino = Path.of("/tmp/niats/" + ruta.getFileName());
                    try {
                        Files.move(ruta, destino, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            //Files.delete(Path.of("/tmp/niats/fff"));

            Collections.reverse(rutas);
            for (Path dir : rutas){
                if (!dir.equals(Path.of("/tmp/niats")) && Files.isDirectory(dir)){
                    System.out.println(dir.getFileName());
                    Files.delete(dir);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}