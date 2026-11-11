
import java.util.ArrayList;
import java.util.List;

public class SalaCine {

    private List<Butaca> butacas;

    public SalaCine() {
        butacas = new ArrayList<>();
    }

    public void agregarButaca(Butaca butaca) {
        butacas.add(butaca);
    }

    public void bloquearButacas(List<String> codigosButacas) {

        // Primero verificamos que todas estén disponibles
        for (String codigo : codigosButacas) {
            boolean encontrada = false;

            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equals(codigo)
                        && butaca.estaDisponible()) {
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                System.out.println("No se pudo realizar la reserva. Butaca no disponible: " + codigo);
                return;
            }
        }

        // Si todas están disponibles, las bloqueamos
        for (String codigo : codigosButacas) {
            for (Butaca butaca : butacas) {
                if (butaca.getCodigo().equals(codigo)) {
                    butaca.bloquear();
                    break;
                }
            }
        }

        System.out.println("Reserva realizada correctamente.");
    }

    public void mostrarSala() {
        System.out.println("\nEstado actual de la sala:");

        for (Butaca butaca : butacas) {
            butaca.mostrarEstado();
        }
    }
}
