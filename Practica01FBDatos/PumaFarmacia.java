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
            System.out.println("3. Realizar búsqueda por categoría");
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
                    System.out.println("2. Eliminar producto por ID");
                    System.out.println("3. Volver al menú principal");
                    System.out.print("Seleccione una opción: ");

                    int opcionActualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    switch (opcionActualizar) {
                        case 1: // Agregar producto
                            System.out.println("=== Agregar Producto ===");
                            // Implementa la lógica para agregar un producto al archivo CSV aquí
                            break;
                        case 2: // Eliminar producto por ID
                            System.out.println("=== Eliminar Producto por ID ===");
                            // Implementa la lógica para eliminar un producto por ID aquí
                            break;
                        case 3: // Volver al menú principal
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
                case 3:
                    // Lógica para realizar búsqueda por categoría
                    System.out.println("=== Búsqueda por Categoría ===");
                    System.out.print("Ingrese la categoría a buscar: ");
                    String categoriaBuscar = scanner.nextLine();
                    productoAcceso.buscarProductosPorCategoria(categoriaBuscar);
                    break;
                case 4:
                    // Lógica para registrar venta
                    System.out.println("=== Registrar Venta ===");
                    // Implementa la lógica para registrar una venta aquí
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
