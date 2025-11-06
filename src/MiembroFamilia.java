import java.util.ArrayList;
import java.util.List;

public class MiembroFamilia {
    private String nombre;
    private String usuario;
    private String contrasena;
    private float saldo;
    private float limiteRetiro;
    private List<Gasto_1> gastos;
    private List<CuentaDeAhorro> cuentasDeAhorro;

    public MiembroFamilia(String nombre, String usuario, String contrasena, float saldo, float limiteRetiro) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.saldo = saldo;
        this.limiteRetiro = limiteRetiro;
        this.gastos = new ArrayList<>();
        this.cuentasDeAhorro = new ArrayList<>();
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public float registrarGasto(Gasto_1 gasto) {
        gastos.add(gasto);
        saldo -= gasto.getMonto();
        return saldo;
    }

    public String verGastos() {
        if (gastos.isEmpty()) return "No hay gastos registrados.";
        StringBuilder sb = new StringBuilder();
        for (Gasto_1 gasto : gastos) {
            sb.append(gasto.verGasto()).append("\n");
        }
        return sb.toString();
    }

    public float verSaldo() {
        return saldo;
    }

    public void agregarCuentaDeAhorro(CuentaDeAhorro cuenta) {
        cuentasDeAhorro.add(cuenta);
    }

    public boolean retirarDinero(float cantidad) {
        if (cantidad <= limiteRetiro && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public float sumarGastos() {
        float total = 0;
        for (Gasto_1 gasto : gastos) total += gasto.getMonto();
        return total;
    }

    // Getters
    public String getNombre() { return nombre; }
    public List<Gasto_1> getGastos() { return gastos; }
    public List<CuentaDeAhorro> getCuentasDeAhorro() { return cuentasDeAhorro; }
    public float getLimiteRetiro() { return limiteRetiro; }
}
