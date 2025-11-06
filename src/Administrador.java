import java.util.List;
import java.util.ArrayList;

public class Administrador {
    private String nombreFamilia;
    private List<MiembroFamilia> miembros;
    private float saldoFamiliar;
    private float limiteRetiroFamiliar;

    // Constructor
    public Administrador(String nombreFamilia, float saldoFamiliar, float limiteRetiroFamiliar) {
        this.nombreFamilia = nombreFamilia;
        this.saldoFamiliar = saldoFamiliar;
        this.limiteRetiroFamiliar = limiteRetiroFamiliar;
        this.miembros = new ArrayList<>();  // Inicializamos la lista de miembros
    }

    // Métodos
    public void agregarMiembro(MiembroFamilia miembro) {
        miembros.add(miembro);
    }

    public float verSaldoFamiliar() {
        return saldoFamiliar;
    }

    public float sumarGastosFamilia() {
        float totalGastos = 0;
        for (MiembroFamilia miembro : miembros) {
            totalGastos += miembro.sumarGastos();  // cada miembro debe tener sumargastos
        }
        return totalGastos;
    }

    public void establecerLimiteRetiroFamiliar(float limite) {
        this.limiteRetiroFamiliar = limite;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public float getLimiteRetiroFamiliar() {
        return limiteRetiroFamiliar;
    }
}
