import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoAcceso {
    private List<Producto> productos;
    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSV

    // Constructor y otros métodos de la clase

    // Método para obtener la lista de productos
    public List<Producto> getProducto() {
        return productos;
    }

    public ProductoAcceso() {
        productos = new ArrayList<>();
        cargarProductosDesdeCSV();
    }

    // Método para cargar productos desde el archivo CSV
    private void cargarProductosDesdeCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String categoria = partes[2];
                    double precio = Double.parseDouble(partes[3]);
                    int cantidad = Integer.parseInt(partes[4]);

                    Producto producto = new Producto(id, nombre, categoria, precio, cantidad);
                    productos.add(producto);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar productos desde el archivo CSV: " + e.getMessage());
        }
    }

    // Método para agregar un nuevo producto
    //public void agregarProducto(Producto producto) {
    //    productos.add(producto);
    //}

    // Método para eliminar un producto por su ID
    //public void eliminarProducto(int id) {
    //    productos.removeIf(p -> p.getId() == id);
    //}

    // Método para actualizar un producto por su ID
    public void actualizarProducto(int id, Producto productoActualizado) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                productos.set(i, productoActualizado);
                break;
            }
        }
    }

    // Método para imprimir la lista de productos
    public void imprimirProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getId() + " | " + producto.getNombre() + " | " + producto.getCategoria() +
                    " | $" + producto.getPrecio() + " | " + producto.getCantidadEnExistencia());
        }
    }

    // Método para guardar productos en el archivo CSV
    public void guardarProductosEnCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV))) {
            for (Producto producto : productos) {
                bw.write(producto.getId() + "," + producto.getNombre() + "," + producto.getCategoria() + "," +
                        producto.getPrecio() + "," + producto.getCantidadEnExistencia());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar productos en el archivo CSV: " + e.getMessage());
        }
    }

    // Metodos agregados por la sintaxis de las opciones declaradas
    // Método para agregar un nuevo producto y actualizar el archivo CSV
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        guardarProductosEnCSV();
    }

    // Método para eliminar un producto por su ID y actualizar el archivo CSV
    public boolean eliminarProducto(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                productos.remove(producto);
                guardarProductosEnCSV();
                return true;
            }
        }
        return false;
    }
}
