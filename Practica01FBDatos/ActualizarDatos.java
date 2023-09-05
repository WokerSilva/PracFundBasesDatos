import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActualizarDatos{
    private final String archivoCSV = "productos.csv"; // Nombre del archivo CSV

    /**
     * El metodo contiene un switch que es el que perimite la logica para los pasos 
     * Agregar y Eliminar. De manera que ahorramos lineas en el main
     */
    public void realizarOpciones(){
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
                    eliminarProductoPorID();
                    break;
                case 3: // Buscar producto por ID
                    // Lógica para buscar producto por ID
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    String idBuscado = scanner.nextLine();
                    buscarProductoPorID(idBuscado);
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
        System.out.print("Categoría del producto: ");
        String categoria = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad en existencia: ");
        int cantidad = scanner.nextInt();

        // Verificar si ya existe un producto con el mismo nombre
        Producto productoExistente = buscarProductoPorNombre(nombre);

        if (productoExistente != null) {
            System.out.println("El producto ya existe en la lista.");
            System.out.println("1. Agregar más cantidad al producto existente");
            System.out.println("2. Cancelar y volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            if (opcion == 1) {
                // Agregar la cantidad al producto existente
                productoExistente.setCantidadEnExistencia(productoExistente.getCantidadEnExistencia() + cantidad);
                actualizarProductoEnCSV(productoExistente);
                System.out.println("Cantidad agregada al producto existente con éxito.");
            } else {
                System.out.println("Operación cancelada. Volviendo al menú principal.");
            }
        } else {
            // Generar el ID en base a las reglas
            String id = generarID(nombre, categoria);

            // Crear un objeto Producto con los detalles ingresados por el usuario
            Producto nuevoProducto = new Producto(id, nombre, categoria, precio, cantidad);

            // Llamar al método para agregar el producto al archivo CSV
            agregarProductoAlCSV(nuevoProducto);
            System.out.println("Producto agregado con éxito.");
        }
    }
    
    /**
 * @param producto
 * Método para actualizar un producto en el archivo CSV con nueva cantidad.
 */
private void actualizarProductoEnCSV(Producto producto) {
    List<Producto> productosActualizados = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
        String linea;
        boolean primeraLinea = true; // Variable para omitir la primera línea (encabezado)

        while ((linea = br.readLine()) != null) {
            if (primeraLinea) {
                primeraLinea = false;
                continue; // Omitir la primera línea (encabezado)
            }

            // Divide la línea en partes usando la coma como separador
            String[] partes = linea.split(",");
            if (partes.length == 5) {
                String id = partes[0].trim();
                if (id.equals(producto.getId())) {
                    // Si el ID coincide con el ID del producto a actualizar, reemplaza la cantidad
                    productosActualizados.add(producto);
                } else {
                    // Si el ID no coincide, agrega el producto existente a la lista actualizada
                    productosActualizados.add(new Producto(
                            id, partes[1].trim(), partes[2].trim(),
                            Double.parseDouble(partes[3].trim()),
                            Integer.parseInt(partes[4].trim())
                    ));
                }
            }
        }
    } catch (IOException e) {
        System.err.println("Error al actualizar el producto en el archivo CSV: " + e.getMessage());
        return; // Salir sin actualizar si ocurre un error
    }

    // Reescribir el archivo CSV con la lista actualizada de productos
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV, false))) {
        // Volver a escribir la primera línea (encabezado)
        bw.write("ID,Nombre,Categoría,Precio,Cantidad en Existencia");
        bw.newLine();

        for (Producto productoActualizado : productosActualizados) {
            bw.write(productoActualizado.getId() + "," + productoActualizado.getNombre() + ","
                    + productoActualizado.getCategoria() + "," + productoActualizado.getPrecio()
                    + "," + productoActualizado.getCantidadEnExistencia());
            bw.newLine();
        }
    } catch (IOException e) {
        System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
    }

    System.out.println("Producto actualizado con éxito.");
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
    private String generarID(String nombre, String categoria){
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
    private void agregarProductoAlCSV(Producto producto){
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

    /**
     * @param nombre
     * Método para buscar un producto por su nombre en el archivo CSV
     * @return El producto si se encuentra, null si no se encuentra
     */
    private Producto buscarProductoPorNombre(String nombre) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean primeraLinea = true; // Variable para omitir la primera línea (encabezado)

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue; // Omitir la primera línea (encabezado)
                }

                // Divide la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    String nombreProducto = partes[1].trim();
                    if (nombreProducto.equalsIgnoreCase(nombre.trim())) {
                        // Si el nombre coincide con el nombre buscado (sin importar mayúsculas/minúsculas), devuelve el producto
                        return new Producto(
                                partes[0].trim(), partes[1].trim(), partes[2].trim(),
                                Double.parseDouble(partes[3].trim()),
                                Integer.parseInt(partes[4].trim())
                        );
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al buscar el producto por nombre: " + e.getMessage());
        }

        return null; // Si no se encuentra el producto, devuelve null
    }

    /**
     * Metodo para eliminar un producto desde su ID
     */
    public void eliminarProductoPorID(){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("=== Eliminar Producto ===");
        System.out.print("Ingrese el ID del producto a eliminar: ");
        String idEliminar = scanner.nextLine();
    
        // Lógica para eliminar el producto con el ID proporcionado
        boolean productoEncontrado = false;
        // Crear una lista temporal para almacenar los productos que no deben eliminarse
        List<Producto> productosNoEliminados = new ArrayList<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean primeraLinea = true; // Variable para omitir la primera línea (encabezado)
            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue; // Omitir la primera línea (encabezado)
                }
    
                // Divide la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    String id = partes[0].trim();
                    if (id.equals(idEliminar)) {
                        // Si el ID coincide con el ID a eliminar, marcamos como encontrado
                        productoEncontrado = true;
                    } else {
                        // Si el ID no coincide, agregamos el producto a la lista temporal
                        productosNoEliminados.add(new Producto(
                                id, partes[1].trim(), partes[2].trim(),
                                Double.parseDouble(partes[3].trim()),
                                Integer.parseInt(partes[4].trim())
                        ));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al eliminar el producto: " + e.getMessage());
            return; // Salir sin eliminar si ocurre un error
        }
    
        if (productoEncontrado) {
            // Si se encontró y eliminó el producto, ahora reescribimos el archivo CSV con los productos no eliminados
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV, false))) {
                // Volver a escribir la primera línea (encabezado)
                bw.write("ID,Nombre,Categoría,Precio,Cantidad en Existencia");
                bw.newLine();
    
                for (Producto producto : productosNoEliminados) {
                    bw.write(producto.getId() + "," + producto.getNombre() + ","
                            + producto.getCategoria() + "," + producto.getPrecio()
                            + "," + producto.getCantidadEnExistencia());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
            }
    
            System.out.println("Se a eliminado el producto con éxito.");
        } else {
            System.out.println("No existe el ID proporcionado.");
        }
    }

    /**
     * @param idBuscado
     * Metodo para buscar un producto por medio de su ID
     * El metodo devuelve los atributos del producto
     */
    public void buscarProductoPorID(String idBuscado) {
        System.out.println("=== Buscar Producto por ID ===");
    
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            boolean encontrado = false;
    
            while ((linea = br.readLine()) != null) {
                // Divide la línea en partes usando la coma como separador
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    String id = partes[0].trim();
                    if (id.equalsIgnoreCase(idBuscado.trim())) {
                        // Si el ID coincide con el ID buscado (sin importar mayúsculas/minúsculas), imprime los atributos del producto
                        System.out.println("Producto encontrado:");
                        System.out.println("ID: " + partes[0].trim());
                        System.out.println("Nombre: " + partes[1].trim());
                        System.out.println("Categoría: " + partes[2].trim());
                        System.out.println("Precio: " + partes[3].trim());
                        System.out.println("Cantidad en Existencia: " + partes[4].trim());
                        encontrado = true;
                        break; // Termina la búsqueda después de encontrar el primer producto
                    }
                }
            }
    
            if (!encontrado) {
                System.out.println("No se encontró ningún producto con el ID proporcionado.");
            }
        } catch (IOException e) {
            System.err.println("Error al buscar el producto por ID: " + e.getMessage());
        }
    }    
}