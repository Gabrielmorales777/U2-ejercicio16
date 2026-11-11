
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        SalaCine sala = new SalaCine();


        sala.agregarButaca(new Butaca("A", 1));
        sala.agregarButaca(new Butaca("A", 2));
        sala.agregarButaca(new Butaca("A", 3));
        sala.agregarButaca(new Butaca("B", 1));
        sala.agregarButaca(new Butaca("B", 2));
        sala.agregarButaca(new Butaca("B", 3));


        PlataformaReserva plataforma = new PlataformaReserva(sala);


        System.out.println("ESTADO INICIAL:");
        sala.mostrarSala();


        List<String> codigos = Arrays.asList("A1", "A2", "B2");

        System.out.println("\nREALIZANDO RESERVA:");
        plataforma.realizarReserva(codigos);


        System.out.println("\nESTADO FINAL:");
        sala.mostrarSala();
    }
}
