import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Habitacion {

   int numeroHabitacion;
   int capacidad;
   boolean disponible;
    //static Scanner scanner = new Scanner(Systemn.in);


    public Habitacion(int numeroHabitacion, int capacidad, boolean disponible) {

        for (Habitacion h : Hotel.habitaciones) {
            if (h.numeroHabitacion == numeroHabitacion) {
                throw new IllegalArgumentException("Ya existe una habitacion con el  " + numeroHabitacion);
            }
        }

        this.numeroHabitacion = numeroHabitacion;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }
}
