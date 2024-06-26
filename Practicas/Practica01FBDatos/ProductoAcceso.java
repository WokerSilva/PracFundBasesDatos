import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoAcceso {
    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSV
    private List<Producto> productos; // Declara la lista de productos

    /**
     * Constructor para inicializar la lista de productos al crear la instancia
     */
    public ProductoAcceso() {        
        productos = new ArrayList<>();
        cargarProductosDesdeCSV(); // Carga los productos desde el archivo CSV
    }
     
    /**
     * Método para cargar el archivo de productos
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
     * @param lista
     * Método para imprimir productos desde la lista
     */
    public void imprimirProductosDesdeLista(List<Producto> lista) {
        for (Producto producto : lista) {
            System.out.println(producto.toString());
        }
    }
    
    /**
     * Método para imprimir productos desde el archivo CSV
     */
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

    /**
     * @param categoriaBuscada
     * Metodo encargado de realizar las busquedas por categoria
     */
    public void buscarProductosPorCategoria(String categoriaBuscada) {
        System.out.println("Resultados de búsqueda para la categoría: " + categoriaBuscada);
        boolean encontrados = false;
    
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoriaBuscada)) {
                System.out.println(producto.toString());
                encontrados = true;
            }
        }
    
        if (!encontrados) {
            System.out.println("No se encontraron productos en la categoría: " + categoriaBuscada);
        }
    }   
}