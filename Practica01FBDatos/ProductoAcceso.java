import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoAcceso {
    private String archivoCSV = "productos.csv"; // Nombre del archivo CSV de productos
    private List<Producto> productos = new ArrayList<>();

    // Constructor para inicializar la lista de productos desde el archivo CSV
    public ProductoAcceso() {
        cargarProductosDesdeCSV();
    }

    // Método para cargar productos desde un archivo CSV
    private void cargarProductosDesdeCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    int id = Integer.parseInt(datos[0].trim());
                    String nombre = datos[1].trim();
                    String categoria = datos[2].trim();
                    double precio = Double.parseDouble(datos[3].trim());
                    int cantidadEnExistencia = Integer.parseInt(datos[4].trim());

                    Producto producto = new Producto(id, nombre, categoria, precio, cantidadEnExistencia);
                    productos.add(producto);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los productos desde el archivo CSV.");
        }
    }

    // Método para guardar productos en el archivo CSV
    private void guardarProductosEnCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV))) {
            for (Producto producto : productos) {
                String linea = producto.getId() + "," + producto.getNombre() + "," + producto.getCategoria() + ","
                        + producto.getPrecio() + "," + producto.getCantidadEnExistencia();
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los productos en el archivo CSV.");
        }
    }

    // Métodos para realizar operaciones específicas con productos, como buscar, agregar y eliminar
    public Producto buscarProductoPorID(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public void agregarProducto(Producto producto) {
        if (!productos.contains(producto)) {
            productos.add(producto);
            guardarProductosEnCSV(); // Guardar cambios en el archivo CSV
        }
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        guardarProductosEnCSV(); // Guardar cambios en el archivo CSV
    }

    // Otros métodos relacionados con productos según las necesidades de tu aplicación
}
