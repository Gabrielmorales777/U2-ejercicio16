
import java.util.Arrays;
import java.util.List;

public class PlataformaReserva {

    private SalaCine sala;

    public PlataformaReserva(SalaCine sala) {
        this.sala = sala;
    }

    public void realizarReserva(List<String> codigosButacas) {
        System.out.println("Procesando reserva...");
        sala.bloquearButacas(codigosButacas);
    }


}
