import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductoAcceso {
    private final String archivoCSV = "./productos.csv"; // Nombre del archivo CSV

    // Otros métodos de la clase...
    // Método para imprimir productos desde el archivo CSV con formato personalizado
    public void imprimirProductosDesdeCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean primeraLinea = true; // Variable para omitir la primera línea
            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    // Omitir la primera línea (encabezados)
                    primeraLinea = false;
                    continue;
                }
            
                // Divide la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    // Eliminar espacios en blanco al principio y al final de las partes
                    String id = partes[0].trim();
                    String nombre = partes[1].trim();
                    String categoria = partes[2].trim();
                    double precio = Double.parseDouble(partes[3].trim());
                    int cantidad = Integer.parseInt(partes[4].trim());
                
                    // Crear un objeto Producto a partir de las partes
                    Producto producto = new Producto(id, nombre, categoria, precio, cantidad);
                    // Imprimir el producto formateado
                    System.out.println(producto.toString());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al imprimir productos desde el archivo CSV: " + e.getMessage());
        }
    }   
}