import java.util.ArrayList;
import java.util.List;

public class Pila {
    private int capacidad;
    private List<Caja> cajas;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.cajas = new ArrayList<>();
    }

    public boolean agregarCaja(Caja caja) {
        if (cajas.size() < capacidad) {
            cajas.add(caja);
            return true;
        }
        return false;
    }

    public Caja quitarCaja() {
        if (!cajas.isEmpty()) {
            return cajas.remove(cajas.size() - 1);
        }
        return null;
    }

    // Método para obtener la lista de cajas
    public List<Caja> getCajas() {
        return cajas;
    }

    @Override
    public String toString() {
        return "Pila con " + cajas.size() + " cajas";
    }
}
