import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActualizarDatos {
    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSV

    /**
     * El metodo contiene un switch que es el que perimite la logica para los pasos 
     * Agregar y Eliminar. De manera que ahorramos lineas en el main
     */
    public void realizarOpciones() {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("=== Actualizar Hoja de Cálculo ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcionActualizar = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcionActualizar) {
                case 1: // Agregar producto
                    agregarProducto();
                    break;
                case 2: // Eliminar producto
                    // Lógica para eliminar producto
                    break;
                case 3: // Buscar producto por ID
                    // Lógica para buscar producto por ID
                    break;
                case 4: // Volver al menú principal
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    /**
     * Método para agregar un nuevo producto y sobreescribir en el archivo CSV
     */
    public void agregarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Agregar Nuevo Producto ===");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Categoria del producto: ");
        String categoria = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad en existencia: ");
        int cantidad = scanner.nextInt();

        // Generar el ID en base a las reglas
        String id = generarID(nombre, categoria);

        // Crear un objeto Producto con los detalles ingresados por el usuario
        Producto nuevoProducto = new Producto(id, nombre, categoria, precio, cantidad);

        // Llamar al método para agregar el producto al archivo CSV
        agregarProductoAlCSV(nuevoProducto);

        System.out.println("Producto agregado con éxito.");
    }

    
    /**
     * @param nombre
     * @param categoria
     * @return
     * Método para generar el ID en base a:
     *  - Tomar las tres primeras letras del nombre del producto
     *  - Tomar la primer letra de la categoria
     *  - Tomar las dos ultimas letras de la categoria
     * Concatenarlas en ese orden en mayusculas. 
     */
    private String generarID(String nombre, String categoria) {
        // Tomar las primeras 3 letras del nombre
        String letrasNombre = nombre.substring(0, Math.min(nombre.length(), 3));

        // Tomar la primera letra de la categoría
        String letraCategoria = categoria.substring(0, 1);

        // Tomar las últimas dos letras de la categoría
        String ultimasLetrasCategoria = categoria.substring(Math.max(0, categoria.length() - 2));

        // Combinar las partes para formar el ID
        String id = letrasNombre + letraCategoria + ultimasLetrasCategoria;

        // Convertir a mayúsculas
        return id.toUpperCase();
    }

    
    /**
     * @param producto
     * Método para agregar un producto al archivo CSV
     */
    private void agregarProductoAlCSV(Producto producto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            // Comenzamos por escribir en el archivo CSV (archivoCSV) en modo "append" (agregar al final).
            // El uso de try-with-resources asegura que el flujo se cerrará automáticamente cuando termine el bloque.            
            // Formatear el producto como una línea CSV y escribirlo en el archivo            
            bw.write(producto.getId() + "," + producto.getNombre() + "," + producto.getCategoria() + ","
                    + producto.getPrecio() + "," + producto.getCantidadEnExistencia());
            // Escribe en el archivo una línea que contiene los datos del producto separados por comas.
            // Escribe un salto de línea para que el próximo producto se agregue en una nueva línea en el archivo.
            bw.newLine();
            
        } catch (IOException e) {
            // Manejo de excepciones: Si ocurre un error al abrir o escribir en el archivo, se captura la excepción y se imprime un mensaje de error.
            System.err.println("Error al agregar el producto al archivo CSV: " + e.getMessage());
        }
    }   
}