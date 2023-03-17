import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {



    public static void main(String[] args) throws ParseException {
        DateFormat formateador= new SimpleDateFormat("dd/M/yy");
        Date fecha = formateador.parse("10/01/2022");
        Hotel hotel = new Hotel();
        Reserva reserva1 = new Reserva();
        Reserva reserva2 = new Reserva();
        Reserva reserva3 = new Reserva();
        Habitacion habitacion1 = new Habitacion();
        Habitacion habitacion2 = new Habitacion();
        Habitacion habitacion3 = new Habitacion();
        Habitacion habitacion4 = new Habitacion();
        Habitacion habitacion5 = new Habitacion();
        Habitacion habitacion6 = new Habitacion();

        habitacion1.definir(1,4,true);
        habitacion2.definir(2,3,true);
        habitacion3.definir(3,8,false);
        habitacion4.definir(4,5,true);
        habitacion5.definir(5,2,false);
        habitacion6.definir(6,7,true);

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);
        hotel.agregarHabitacion(habitacion4);
        hotel.agregarHabitacion(habitacion5);
        hotel.agregarHabitacion(habitacion6);
        //hotel.mostrarHabitaciones();
        //hotel.habitacionesDisponibles();
        reserva1.definir(301, "Juan Carlos",fecha);
        reserva2.definir(302, "Luis",fecha);
        reserva3.definir(303, "Pedro",fecha);
        hotel.agregarReserva(reserva1);
        hotel.agregarReserva(reserva2);
        hotel.agregarReserva(reserva3);
        hotel.mostrarReservas();



    }

}