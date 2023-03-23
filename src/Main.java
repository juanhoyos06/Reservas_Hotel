import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        Hotel hotel = new Hotel();
        Habitacion habitacion1 = new Habitacion(1, 4, true);
        Habitacion habitacion2 = new Habitacion(2, 3, true);
        Habitacion habitacion3 = new Habitacion(3, 8, false);
        Habitacion habitacion4 = new Habitacion(4, 5, true);
        Habitacion habitacion5 = new Habitacion(5, 2, false);
        Habitacion habitacion6 = new Habitacion(6, 7, true);

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);
        hotel.agregarHabitacion(habitacion4);
        hotel.agregarHabitacion(habitacion5);
        hotel.agregarHabitacion(habitacion6);


        Reserva reserva1 = new Reserva(301, "Juan Carlos", "10/10/2023");
        Reserva reserva2 = new Reserva(302, "Luis", "10/11/2023");
        Reserva reserva3 = new Reserva(303, "Pedro", "10/12/2023");
        Reserva reserva4 = new Reserva(304, "Carlos José", "10/10/2023");
        hotel.agregarReserva(reserva1);
        hotel.agregarReserva(reserva2);
        hotel.agregarReserva(reserva3);
        hotel.agregarReserva(reserva4);


        int opc = menu();
        while (opc != 6) {

            if (opc == 1) {
                hotel.habitacionesDisponibles();
            } else if (opc == 2) {
                hotel.mostrarHabitaciones();
            } else if (opc == 3) {
                hotel.mostrarReservas();
            } else if (opc == 4) {
                int numRes = numeroReserva();
                String nomCli = nombreCliente();
                String fechaRes = fechaReserva();

                Reserva reserva = new Reserva(numRes, nomCli, fechaRes);
                hotel.agregarReserva(reserva);
                System.out.println("Reserva creada exitosamente");
            } else if (opc == 5) {
                String fechaBuscar = fechaReserva();
                hotel.mostrarReservasEnFecha(fechaBuscar);
            }

            opc = menu();
        }


    }

    public static int menu(){

        System.out.println("----------------------------------------------\n" +
                "BIENVENIDO AL SISTEMAS DE RESERVAS DEL HOTEL\n" +
                "1. VER HABITACIONES DISPONIBLES.\n" +
                "2. VER TODAS LAS HABITACIONES. \n"+
                "3. VER RESERVAS.\n"+
                "4. REALIZAR RESERVA.\n" +
                "5. BUSCAR RESERVAS POR FECHA.\n" +
                "6. SALIR. \n" +
                "INGRESE LA OPCION DESEADA: ");
        int opc;

        if (scanner.hasNextInt()){
            opc = scanner.nextInt();

            if (opc > 6 || opc < 1){
                System.out.println("Opción inválida, ingrese una opción del 1 al 6");
                opc = menu();
            }

        } else {
            System.out.println("Opción inválida, ingrese una opción del 1 al 6");
            scanner.next();
            opc = menu();
        }

        return opc;
    }

    public static int numeroReserva(){

        System.out.println("Ingrese el numero de la reserva");
        int res;

        if (scanner.hasNextInt()){
            res = scanner.nextInt();

        } else{
            System.out.println("El dato ingresado no es correcto ");
            scanner.next();
            res = numeroReserva();
        }
        return res;
    }

    public static String fechaReserva(){
        System.out.println("Ingrese la fecha en formato (dd/mm/aaaa)");
        String fec;

        if (scanner.hasNextInt()){
            System.out.println("El dato ingresado no es correcto ");
            scanner.next();
            fec = fechaReserva();

        } else{
            fec = scanner.next();
        }
        return fec;
    }
    public static String nombreCliente(){

        System.out.println("Ingrese el nombre del cliente");
        String nom;

        if (scanner.hasNextInt()){
            System.out.println("El dato ingresado no es correcto ");
            scanner.next();
            nom = nombreCliente();

        } else{
            nom = scanner.next();
        }
        return nom;

    }




    }
