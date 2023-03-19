import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    int numeroReserva;
    String nombreCliente;
    Date fechaReserva;

    public void definir(int numRes,String nomCli,String fecRes) throws ParseException {
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        Date fecha = formateador.parse(fecRes);

        this.numeroReserva = numRes;
        this.nombreCliente = nomCli;
        this.fechaReserva = fecha;
        List Reserva = new ArrayList<>();
        Reserva.add(this.numeroReserva);
        Reserva.add(this.nombreCliente);
        Reserva.add(this.fechaReserva);


    }
}
