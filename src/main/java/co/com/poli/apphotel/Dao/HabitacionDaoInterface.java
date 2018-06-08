package co.com.poli.apphotel.Dao;

import java.util.List;

import co.com.poli.apphotel.model.Habitacion;

public interface HabitacionDaoInterface {
	public String insertar(Habitacion habitacion);
	public List<Habitacion> listarHabitaciones();
	public Habitacion consultarHabitacion(String idHabitacion);
}
