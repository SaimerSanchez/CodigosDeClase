//Codigo4
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class LectorDeArchivo {
    private String rutaArchivo;

    public LectorDeArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void leerArchivo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Lectura {
    public static void main(String[] args) {
        LectorDeArchivo lector = new LectorDeArchivo("archivo.txt");
        lector.leerArchivo();
    }
}