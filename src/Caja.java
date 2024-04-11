public class Caja {
    private int numero;
    private String empresa;

    public Caja(int numero, String empresa) {
        this.numero = numero;
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Caja " + numero + " de " + empresa;
    }
}
