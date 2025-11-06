public class PresupuestoMensual {
    private Categoria categoria;
    private float montoEstablecido;
    private float montoGastado;

    public PresupuestoMensual(Categoria categoria, float montoEstablecido) {
        this.categoria = categoria;
        this.montoEstablecido = montoEstablecido;
        this.montoGastado = 0;
    }

    public void actualizarMontoGastado(float monto) {
        this.montoGastado += monto;
    }

    public float verPresupuestoRestante() {
        return montoEstablecido - montoGastado;
    }

    public boolean excedido() {
        return montoGastado > montoEstablecido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public float getMontoEstablecido() {
        return montoEstablecido;
    }

    public float getMontoGastado() {
        return montoGastado;
    }
}
