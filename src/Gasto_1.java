import java.util.Date;

public class Gasto_1 {
    private float monto;
    private Categoria categoria;
    private Date fecha;
    private String descripcion;

    public Gasto_1(float monto, Categoria categoria, Date fecha, String descripcion) {
        this.monto = monto;
        this.categoria = categoria;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public float getMonto() {
        return monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Devuelve los datos del gasto como String para la GUI
    public String verGasto() {
        return "Monto: $" + monto + " | Categoría: " + categoria.getNombre() + " | Descripción: " + descripcion;
    }
}
