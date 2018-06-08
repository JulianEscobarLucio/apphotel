package co.com.poli.apphotel.business;

import java.util.List;

import co.com.poli.apphotel.model.Habitacion;

public interface HabitacionBusinessInterface {
	public String insertar(Habitacion habitacion);
	public List<Habitacion> listarHabitaciones();
	public Integer numeroHabitacionesConReserva();
	public Double valorHabitacionesDisponible();
}
