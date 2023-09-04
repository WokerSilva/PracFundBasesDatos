import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductoAcceso {
    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSV

    // Otros métodos de la clase...

    // Método para imprimir productos desde el archivo CSV
    public void imprimirProductosDesdeCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al imprimir productos desde el archivo CSV: " + e.getMessage());
        }
    }
}
