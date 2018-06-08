package co.com.poli.apphotel.Dao;

import java.util.List;

import co.com.poli.apphotel.model.Reserva;

public interface ResevaDaoInteface {
	public String insertar(Reserva reserva);
	public List<Reserva> listarReservas();
	public Double numeroCamasReservadas(String idHabitacion);
	public boolean habitacionConReserva(String idHabitacion);
	public Double camasOcupadas(String idHabitacion);
}
