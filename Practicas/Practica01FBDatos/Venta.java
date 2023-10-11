public class Venta{
    private int dia;
    private int mes;
    private int year;
    private double totalVendido;
    
    public Venta(int dia, int mes, int year, double totalVendido) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.totalVendido = totalVendido;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getTotalVendido() {
        return totalVendido;
    }
    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    // Constructor, getters y setters
}
