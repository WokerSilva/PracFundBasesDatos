public class Producto{
    private String id;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadEnExistencia;

    public Producto(String id, String nombre, String categoria, double precio, int cantidadEnExistencia) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadEnExistencia = cantidadEnExistencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnExistencia() {
        return cantidadEnExistencia;
    }

    public void setCantidadEnExistencia(int cantidadEnExistencia) {
        this.cantidadEnExistencia = cantidadEnExistencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Categoría: ").append(categoria).append("\n");
        sb.append("Precio: ").append(String.format("%.2f", precio)).append("\n");
        sb.append("Cantidad en Existencia: ").append(cantidadEnExistencia).append("\n");
        return sb.toString();
    }
}