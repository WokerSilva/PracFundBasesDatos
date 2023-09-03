import java.util.Scanner;

public class PumaFarmacia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar el sistema y cargar datos desde archivos CSV
        ProductoAcceso productoAcceso = new ProductoAcceso();
        //VentaAcceso ventaAcceso = new VentaAcceso();

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
            scanner.nextLine();  // Consumir la nueva línea

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
                    scanner.nextLine();  // Consumir la nueva línea

                    switch (opcionActualizar) {
                        case 1: // Agregar producto
                            System.out.println("=== Agregar Producto ===");
                            System.out.print("ID del producto: ");
                            int idProducto = scanner.nextInt();
                            scanner.nextLine();  // Consumir la nueva línea
                            break;
                        case 2: // Eliminar producto
                            System.out.println("=== Eliminar Producto ===");
                            System.out.print("ID del producto a eliminar: ");
                            int idEliminar = scanner.nextInt();
                        scanner.nextLine();  // Consumir la nueva línea
                            break;
                        case 3: // Buscar producto por nombre
                            System.out.println("=== Buscar Producto por Nombre ===");
                            System.out.print("Nombre del producto a buscar: ");
                            String nombreBuscar = scanner.nextLine();
                            break;
                        case 4: // Volver al menú principal
                            break;      
                            default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
                case 3:
                    // Lógica para realizar búsqueda
                    break;
                case 4:
                    // Lógica para registrar venta
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        // Guardar datos en archivos CSV antes de salir
        // productoAcceso.guardarProductosEnCSV();
        // ventaAcceso.guardarVentasEnCSV();

        System.out.println("Gracias por usar PumaFarmacia. ¡Hasta luego!");
        scanner.close();
    }
}