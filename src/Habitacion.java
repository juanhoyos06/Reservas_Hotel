public class Habitacion {

   int numeroHabitacion;
   int capacidad;
   boolean disponible;

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

    public int getCapacidad() {
        return this.capacidad;
    }
}
