import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class VentaAcceso{
    private final String archivoCSV = "ventas.csv"; // Nombre del archivo CSV para ventas
    private List<Venta> ventas; // Lista para almacenar las ventas

    public VentaAcceso() {
        ventas = new ArrayList<>();
        cargarVentasDesdeCSV(); // Cargar ventas existentes desde el archivo CSV
    }

    // Método para cargar ventas desde el archivo CSV
    private void cargarVentasDesdeCSV() {
        // Implementa la lógica para cargar las ventas desde el archivo CSV (si existe).
    }

    // Método para guardar una venta en el archivo CSV
    public void guardarVenta(Venta venta) {
        ventas.add(venta);
        escribirVentaEnCSV(venta);
    }

    // Método para escribir una venta en el archivo CSV
    private void escribirVentaEnCSV(Venta venta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            // Formatear la venta como una línea CSV y escribirla en el archivo
            bw.write(venta.getDia() + "," + venta.getMes() + "," + venta.getYear() + ","
                    + venta.getTotalVendido());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir la venta en el archivo CSV: " + e.getMessage());
        }
    }

    // Implementa otros métodos según tus necesidades, como listar ventas, buscar por fecha, etc

    public void registrarVenta() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("=== Registrar Venta ===");
        System.out.print("Ingrese el día (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año (aaaa): ");
        int year = scanner.nextInt();
        System.out.print("Ingrese el total vendido: ");
        double totalVendido = scanner.nextDouble();
    
        // Verificar que la fecha sea válida (opcional)
        if (esFechaValida(dia, mes, year)) {
            // Crear una instancia de Venta con los datos capturados
            Venta venta = new Venta(dia, mes, year, totalVendido);
            // Guardar la venta en el archivo CSV de ventas (debes implementar este método)
            guardarVenta(venta);
            System.out.println("Venta registrada con éxito.");
        } else {
            System.out.println("Fecha no válida. Revise el formato de la fecha (dd/mm/aaaa).");
        }
    }
    

private boolean esFechaValida(int dia, int mes, int year) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false); // No permitir fechas inválidas (por ejemplo, 30 de febrero)
    try {
        Date fecha = sdf.parse(String.format("%02d/%02d/%04d", dia, mes, year));
        return true;
    } catch (ParseException e) {
        return false;
    }
}



public void imprimirVentasDesdeCSV() {
    try (BufferedReader br = new BufferedReader(new FileReader("ventas.csv"))) {
        String linea;
        boolean primeraLinea = true; // Variable para omitir la primera línea (encabezado)

        System.out.println("=== Ventas Registradas ===");
        while ((linea = br.readLine()) != null) {
            if (primeraLinea) {
                primeraLinea = false;
                continue; // Omitir la primera línea (encabezado)
            }

            // Divide la línea en partes usando la coma como separador
            String[] partes = linea.split(",");
            if (partes.length == 4) {
                int dia = Integer.parseInt(partes[0].trim());
                int mes = Integer.parseInt(partes[1].trim());
                int year = Integer.parseInt(partes[2].trim());
                double totalVendido = Double.parseDouble(partes[3].trim());

                // Imprimir los datos de la venta
                System.out.println("Fecha: " + dia + "/" + mes + "/" + year);
                System.out.println("Total Vendido: $" + totalVendido);
                System.out.println("-------------------------");
            }
        }
    } catch (IOException e) {
        System.err.println("Error al imprimir las ventas desde el archivo CSV: " + e.getMessage());
        e.printStackTrace(); // Imprime detalles del error
    }
}
}