//CODIGO1
package clasedehoy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    private BufferedReader reader;

    public Lectura(String rutaDelArchivo) {
        try {
            reader = new BufferedReader(new FileReader(rutaDelArchivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Lectura lectura = new Lectura("archivo.txt");
    }
}