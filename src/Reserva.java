import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    int numeroReserva;
    String nombreCliente;
    Date fechaReserva;

    public void definir(int numRes,String nomCli,Date fecRes){

        this.numeroReserva = numRes;
        this.nombreCliente = nomCli;
        this.fechaReserva = fecRes;
        List Reserva = new ArrayList<>();
        Reserva.add(this.numeroReserva);
        Reserva.add(this.nombreCliente);
        Reserva.add(this.fechaReserva);


    }
}
