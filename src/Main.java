import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear cajas
        Caja caja1 = new Caja(1, "Empresa A");
        Caja caja2 = new Caja(2, "Empresa B");
        Caja caja3 = new Caja(3, "Empresa C");

        // Crear almacén con capacidad para 2 pilas de 3 cajas cada una
        Almacen almacen = new Almacen(2, 3);

        // Ingresar cajas al almacén
        almacen.ingresarCaja(caja1);
        almacen.ingresarCaja(caja2);
        almacen.ingresarCaja(caja3);

        // Retirar la caja 2 de la primera pila
        List<Caja> cajasRetiradas = almacen.retirarCaja(0, 2);
        System.out.println("Cajas retiradas: " + cajasRetiradas);

        // Mover la caja 1 de la primera pila a la segunda pila
        almacen.moverCaja(0, 1, 1);

        System.out.println(almacen);
    }
}
