import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private float limitePresupuesto;
    private List<Gasto_1> gastos;

    public Categoria(String nombre, float limitePresupuesto) {
        this.nombre = nombre;
        this.limitePresupuesto = limitePresupuesto;
        this.gastos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public float getLimitePresupuesto() {
        return limitePresupuesto;
    }

    public void setLimitePresupuesto(float limitePresupuesto) {
        this.limitePresupuesto = limitePresupuesto;
    }

    public void agregarGasto(Gasto_1 gasto) {
        gastos.add(gasto);
    }

    public float totalGastos() {
        float total = 0;
        for (Gasto_1 gasto : gastos) {
            total += gasto.getMonto();
        }
        return total;
    }

    public float presupuestoRestante() {
        return limitePresupuesto - totalGastos();
    }

    public boolean excedidoPresupuesto() {
        return totalGastos() > limitePresupuesto;
    }

    public String mostrarGastos() {
        if (gastos.isEmpty()) return "No hay gastos registrados en esta categoría.";
        StringBuilder sb = new StringBuilder();
        for (Gasto_1 gasto : gastos) {
            sb.append(gasto.verGasto()).append("\n");
        }
        return sb.toString();
    }
}
