//Codigo2
package clasedehoy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Mover {
    public Mover(String nombreDelArchivo) {
        try {
            Path archivo = Paths.get(nombreDelArchivo);
            Files.createFile(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Mover mover = new Mover("nuevo.txt");
    }
}