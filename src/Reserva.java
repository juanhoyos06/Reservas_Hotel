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

    public Reserva(int numRes, String nomCli, String fecRes) throws ParseException {
        DateFormat formateador = new SimpleDateFormat("dd/M/yy");
        Date fecha = formateador.parse(fecRes);

        for (Reserva r : Hotel.reservas) {
            if (r.numeroReserva == numRes) {
                throw new IllegalArgumentException("Ya existe una reserva con el número de reserva " + numRes);
            }
        }

        this.numeroReserva = numRes;
        this.nombreCliente = nomCli;
        this.fechaReserva = fecha;
    }
}