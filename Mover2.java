//Codigo3
package clasedehoy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mover {
    public Mover(String archivoOrigen, String archivoDestino) {
        try {
            Path origen = Paths.get(archivoOrigen);
            Path destino = Paths.get(archivoDestino);
            Files.copy(origen, destino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Mover mover = new Mover("rutaDelArchivoOrigen", "rutaDelArchivoDestino");
    }
}