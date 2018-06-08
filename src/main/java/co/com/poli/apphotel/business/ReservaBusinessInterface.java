package co.com.poli.apphotel.business;

import java.util.List;

import co.com.poli.apphotel.model.Reserva;

public interface ReservaBusinessInterface {
	public String insertar(Reserva reserva);
	public List<Reserva> listarReservas();
}
