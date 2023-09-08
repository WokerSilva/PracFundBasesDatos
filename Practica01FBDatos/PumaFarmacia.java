import java.util.Scanner;

public class PumaFarmacia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        ProductoAcceso productoAcceso = new ProductoAcceso();
        VentaAcceso ventaAcceso = new VentaAcceso();
        
        boolean salir = false;
        while (!salir) {
            System.out.println("=== PumaFarmacia ===");
            System.out.println("1. Visualizar productos");
            System.out.println("2. Actualizar hoja de cálculo");
            System.out.println("3. Realizar búsqueda");
            System.out.println("4. Registrar venta");
            System.out.println("5. Ver inventario de venta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    // Lógica para visualizar productos
                    productoAcceso.imprimirProductosDesdeCSV();
                    break;
                case 2:
                    // Lógica para actualizar hoja de cálculo
                    ActualizarDatos actualizarDatos = new ActualizarDatos();
                    actualizarDatos.realizarOpciones();
                    break;
                case 3:
                    // Lógica para realizar búsqueda
                    System.out.print("Ingrese la categoria a buscar: ");
                    String categoriaBuscada = scanner.nextLine();
                    productoAcceso.buscarProductosPorCategoria(categoriaBuscada);
                    break;
                case 4:
                    // Lógica para registrar venta
                    ventaAcceso.registrarVenta();
                    break;
                case 5:
                    // Visualizar ventas
                    ventaAcceso.imprimirVentasDesdeCSV(); // Llama al método imprimirVentasDesdeCSV de ventaAcceso
                    break;
                case 6: 
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        }

        System.out.println("Gracias por usar PumaFarmacia. ¡Hasta luego!");
        scanner.close();
    }
}