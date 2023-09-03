import java.util.Scanner;

public class PumaFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar el sistema y cargar datos desde archivos CSV
        ProductoAcceso productoAcceso = new ProductoAcceso();

        boolean salir = false;
        while (!salir) {
            System.out.println("=== Farmacia App ===");
            System.out.println("1. Visualizar productos");
            System.out.println("2. Actualizar hoja de cálculo");
            System.out.println("3. Realizar búsqueda");
            System.out.println("4. Registrar venta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    // Lógica para visualizar productos
                    productoAcceso.imprimirProductos();
                    break;
                case 2:
                    // Lógica para actualizar hoja de cálculo
                    System.out.println("=== Actualizar Hoja de Cálculo ===");
                    System.out.println("1. Agregar producto");
                    System.out.println("2. Eliminar producto");
                    System.out.println("3. Buscar producto por nombre");
                    System.out.println("4. Volver al menú principal");
                    System.out.print("Seleccione una opción: ");

                    int opcionActualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    switch (opcionActualizar) {
                        case 1: // Agregar producto
                            System.out.println("=== Agregar Producto ===");
                            System.out.print("ID del producto: ");
                            int idProducto = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea

                            // Verifica si el ID ya existe
                            boolean idExistente = false;
                            for (Producto producto : productoAcceso.getProductos()) {
                                if (producto.getId() == idProducto) {
                                    idExistente = true;
                                    break;
                                }
                            }

                            if (idExistente) {
                                System.out.println("El producto con ID " + idProducto + " ya existe. No se puede agregar.");
                            } else {
                                // Solicita al usuario ingresar otros detalles del producto (nombre, categoría, precio, cantidad, etc.)
                                System.out.print("Nombre del producto: ");
                                String nombre = scanner.nextLine();
                                System.out.print("Categoría del producto: ");
                                String categoria = scanner.nextLine();
                                System.out.print("Precio del producto: ");
                                double precio = scanner.nextDouble();
                                System.out.print("Cantidad en existencia: ");
                                int cantidad = scanner.nextInt();

                                // Crea un nuevo objeto Producto con los detalles ingresados por el usuario y llama al método agregarProducto de ProductoAcceso.
                                Producto nuevoProducto = new Producto(idProducto, nombre, categoria, precio, cantidad);
                                productoAcceso.agregarProducto(nuevoProducto);
                                System.out.println("Producto agregado con éxito.");
                            }
                            break;

                        case 2: // Eliminar producto
                            System.out.println("=== Eliminar Producto ===");
                            System.out.print("ID del producto a eliminar: ");
                            int idEliminar = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea

                            boolean productoEliminado = productoAcceso.eliminarProducto(idEliminar);

                            if (productoEliminado) {
                                System.out.println("Producto con ID " + idEliminar + " eliminado con éxito.");
                            } else {
                                System.out.println("No se encontró un producto con ID " + idEliminar + " para eliminar.");
                            }
                            break;
                        case 3: // Buscar producto por nombre
                            System.out.println("=== Buscar Producto por Nombre ===");
                            System.out.print("Nombre del producto a buscar: ");
                            String nombreBuscar = scanner.nextLine();
                            // Implementa la lógica para buscar un producto por nombre aquí
                            break;
                        case 4: // Volver al menú principal
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
                case 3:
                    // Lógica para realizar búsqueda
                    // Implementa la lógica para búsqueda aquí
                    break;
                case 4:
                    // Lógica para registrar venta
                    // Implementa la lógica para registrar venta aquí
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        // No olvides guardar los datos en archivos CSV antes de salir
        productoAcceso.guardarProductosEnCSV();

        System.out.println("Gracias por usar PumaFarmacia. ¡Hasta luego!");
        scanner.close();
    }
}
