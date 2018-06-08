package co.com.poli.apphotel.businessImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.poli.apphotel.Dao.HabitacionDaoInterface;
import co.com.poli.apphotel.Dao.ResevaDaoInteface;
import co.com.poli.apphotel.business.ReservaBusinessInterface;
import co.com.poli.apphotel.model.Habitacion;
import co.com.poli.apphotel.model.Reserva;
import co.com.poli.apphotel.model.TipoHabitacion;

@Service
public class ReservaBusinessImpl implements ReservaBusinessInterface{
	
	@Autowired
	ResevaDaoInteface resevaDaoInteface;
	
	@Autowired
	HabitacionDaoInterface habitacionDaoInterface;

	@Override
	public String insertar(Reserva reserva) {
		Double camasReservadas = resevaDaoInteface.numeroCamasReservadas(reserva.getHabitacion());
		Habitacion habitacion = habitacionDaoInterface.consultarHabitacion(reserva.getHabitacion());
		Double camasDisponibles = habitacion.getNumCamas() - camasReservadas;
		if(reserva.getNumCamas() <= camasDisponibles ) {
			
			if(habitacion.getTipoHabitacion().equals(TipoHabitacion.Privada)) {
				reserva.setNumCamas(habitacion.getNumCamas());
				reserva.setPrecioxcama(50000D);
			}else {
				reserva.setPrecioxcama(30000D);
			}
			return resevaDaoInteface.insertar(reserva);
		}else if(camasDisponibles.equals(0) ) {
			return "La habitación está ocupada";
		}else {
			return "No hay disponibilidad de camas";
		}
	}

	@Override
	public List<Reserva> listarReservas() {
		return resevaDaoInteface.listarReservas();
	}

}
