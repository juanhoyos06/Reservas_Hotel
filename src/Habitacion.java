import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Habitacion {

   int numeroHabitacion;
   int capacidad;
   boolean disponible;
    //static Scanner scanner = new Scanner(Systemn.in);

    public void definir(Integer numHab, Integer cap, boolean disp){
        this.numeroHabitacion = numHab;
        this.capacidad = cap;
        this.disponible = disp;
        List habitacion = new ArrayList<>();
        habitacion.add(this.numeroHabitacion);
        habitacion.add(this.capacidad);
        habitacion.add(this.disponible);
    }
}
