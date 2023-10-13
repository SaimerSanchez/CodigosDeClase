//Codigo5
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class EscritorDeArchivo {
    private String rutaArchivo;

    public EscritorDeArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void escribirArchivo(String contenido) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));
            writer.write(contenido);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Escritura {
    public static void main(String[] args) {
        EscritorDeArchivo escritor = new EscritorDeArchivo("archivo.txt");
        escritor.escribirArchivo("Hola Mundo");
    }
}