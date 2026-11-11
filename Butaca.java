
public class Butaca {

    private String fila;
    private int numero;
    private boolean disponible;

    public Butaca(String fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.disponible = true;
    }

    public String getCodigo() {
        return fila + numero;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void bloquear() {
        disponible = false;
    }

    public void mostrarEstado() {
        System.out.println(getCodigo() + " - " +
                (disponible ? "Disponible" : "Ocupada"));
    }
}
