import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    static List<Habitacion> habitaciones = new ArrayList<>();
    static List<Reserva> reservas = new ArrayList<>();
    DateFormat formateador= new SimpleDateFormat("dd/M/yy");
    public void agregarHabitacion(Habitacion habitacion){

        this.habitaciones.add(habitacion);
    }
    public void agregarReserva(Reserva reserva){

        reservas.add(reserva);
    }
    public List<Reserva> mostrarReservas(){
        for (Reserva res: reservas){

            System.out.println("Reserva numero: "+res.numeroReserva+
                    "..  A nombre de: " + res.nombreCliente +".. Fecha: "+ formateador.format(res.fechaReserva));

        }
        return reservas;
    }
    public List<Habitacion> mostrarHabitaciones(){
        String estado;
        for (Habitacion hab: habitaciones){
            if (hab.disponible){
                estado = "Disponible";
            }else{
                estado = "No disponible";
            }
            System.out.println("Habitacion numero: "+hab.numeroHabitacion+
                    "-> Capacidad:" + hab.capacidad +" Personas -> Estado: "+ estado);

        }
        return habitaciones;
    }
    public List<Habitacion> habitacionesDisponibles(){
        String estado;
        for (Habitacion hab: habitaciones){
            if (hab.disponible){
                System.out.println("Habitacion numero: "+hab.numeroHabitacion+
                        "-> Capacidad:" + hab.capacidad +" Personas");
            }

        }
        return habitaciones;
    }


}
