package Practica02;
import java.io.*;
import java.util.*;

public class Convertidor {
    public static void main(String[] args) {
        Convertidor convertidor = new Convertidor();
        convertidor.convertirAJSON("productos.json");
    }

    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSVproductosprac02
    private List<Producto> productos; // Declara la lista de productos
    /**
     * Constructor para inicializar la lista de productos al crear la instancia
     */
    public Convertidor() {
        productos = new ArrayList<>();
        cargarProductosDesdeCSV(); // Carga los productos desde el archivo CSV
    }

    /**
     * Método para cargar el archivo de productos desde CSV
     */
    private void cargarProductosDesdeCSV() {
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
                    // Agregar el producto a la lista
                    productos.add(producto);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar productos desde el archivo CSV: " + e.getMessage());
        }
    }

    /**
     * Método para convertir la lista de productos a JSON y escribirlo en un archivo
     */
    public void convertirAJSON(String nombreArchivoJSON) {
        try (FileWriter writer = new FileWriter(nombreArchivoJSON)) {
            StringBuilder json = new StringBuilder();
            json.append("[\n");
            for (Producto producto : productos) {
                json.append("  {\n");
                json.append("    \"ID\": \"" + producto.getId() + "\",\n");
                json.append("    \"Nombre\": \"" + producto.getNombre() + "\",\n");
                json.append("    \"Categoría\": \"" + producto.getCategoria() + "\",\n");
                json.append("    \"Precio\": " + producto.getPrecio() + ",\n");
                json.append("    \"Cantidad en Existencia\": " + producto.getCantidadEnExistencia() + "\n");
                json.append("  },\n");
            }
            // Eliminar la última coma y cerrar el arreglo JSON
            if (!productos.isEmpty()) {
                json.delete(json.length() - 2, json.length() - 1);
            }
            json.append("]\n");

            writer.write(json.toString());
            System.out.println("Archivo JSON generado exitosamente: " + nombreArchivoJSON);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo JSON: " + e.getMessage());
        }
    }
}