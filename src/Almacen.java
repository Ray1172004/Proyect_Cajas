import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private int capacidadPilas;
    private int capacidadPila;
    private List<Pila> pilas;

    public Almacen(int capacidadPilas, int capacidadPila) {
        this.capacidadPilas = capacidadPilas;
        this.capacidadPila = capacidadPila;
        this.pilas = new ArrayList<>();
        for (int i = 0; i < capacidadPilas; i++) {
            pilas.add(new Pila(capacidadPila));
        }
    }

    public boolean ingresarCaja(Caja caja) {
        for (Pila pila : pilas) {
            if (pila.agregarCaja(caja)) {
                return true;
            }
        }
        return false;
    }

    public List<Caja> retirarCaja(int numeroPila, int numeroCaja) {
        if (numeroPila >= 0 && numeroPila < pilas.size()) {
            Pila pila = pilas.get(numeroPila);
            List<Caja> cajasRetiradas = new ArrayList<>();
            for (int i = pila.getCajas().size() - 1; i >= 0; i--) {
                Caja caja = pila.getCajas().get(i);
                if (caja.getNumero() == numeroCaja) {
                    cajasRetiradas.add(caja);
                    pila.getCajas().remove(i);
                }
            }
            return cajasRetiradas;
        }
        return null;
    }

    public boolean moverCaja(int numeroPilaOrigen, int numeroPilaDestino, int numeroCaja) {
        List<Caja> cajasRetiradas = retirarCaja(numeroPilaOrigen, numeroCaja);
        if (cajasRetiradas != null) {
            for (Caja caja : cajasRetiradas) {
                if (!ingresarCaja(caja)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Almacen:\n" + String.join("\n", pilas.toString());
    }
}
