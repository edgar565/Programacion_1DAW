package Tema6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            List<Path> rutas = Files.walk(Path.of("/tmp/niats")).toList();
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
            for (Path dir :rutas){
                if (!dir.equals("/tmp/niats")){
                    Files.deleteIfExists(dir);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}