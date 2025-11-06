public class CuentaDeAhorro {
    
    // Atributos
    private String nombre;  // Nombre de la cuenta
    private float monto;    // Saldo actual de la cuenta
    private float meta;     // Meta de ahorro

    // Constructor
    public CuentaDeAhorro(String nombre, float montoInicial, float meta) {
        this.nombre = nombre;
        this.monto = montoInicial;
        this.meta = meta;
    }

    // Métodos
    public void agregarDinero(float cantidad) {
        if (cantidad > 0) {
            this.monto += cantidad;  // Aumenta el saldo de la cuenta
            System.out.println("Se han agregado $" + cantidad + " a la cuenta " + this.nombre);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }

    public void retirarDinero(float cantidad) {
        if (cantidad > 0 && cantidad <= this.monto) {
            this.monto -= cantidad;  // Resta el dinero de la cuenta
            System.out.println("Se han retirado $" + cantidad + " de la cuenta " + this.nombre);
        } else {
            System.out.println("No se puede retirar esa cantidad. Verifique el saldo disponible.");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo de la cuenta " + this.nombre + ": $" + this.monto);
    }

    public void verMeta() {
        System.out.println("Meta de ahorro para la cuenta " + this.nombre + ": $" + this.meta);
    }

    public boolean esMetaAlcanzada() {
        return this.monto >= this.meta;  // Verifica si la meta de ahorro ha sido alcanzada
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }
}
