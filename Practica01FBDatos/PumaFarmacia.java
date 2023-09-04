import java.util.Scanner;

public class PumaFarmacia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        ProductoAcceso productoAcceso = new ProductoAcceso();
        // VentaAcceso ventaAcceso = new VentaAcceso();
        // Resolviendo problema de acceso al archivo
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
                    productoAcceso.imprimirProductosDesdeCSV();
                    break;
                case 2:
                    // Lógica para actualizar hoja de cálculo
                    ActualizarDatos actualizarDatos = new ActualizarDatos();
                    actualizarDatos.realizarOpciones();
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

        System.out.println("Gracias por usar PumaFarmacia. ¡Hasta luego!");
        scanner.close();
    }
}