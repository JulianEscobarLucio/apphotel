package co.com.poli.apphotel.DaoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.poli.apphotel.Dao.ResevaDaoInteface;
import co.com.poli.apphotel.Data.ReservaData;
import co.com.poli.apphotel.model.Reserva;

@Repository
public class ReservaDaoImpl  implements ResevaDaoInteface {
	

	@Override
	public String insertar(Reserva reserva) {
        String respuesta = "Reserva ya Registrada";
        List<Reserva> listado = ReservaData.getListaReservas();
        if(!listado.contains(reserva)){
            listado.add(reserva);
            ReservaData.setListaReservas(listado);
            respuesta = "Reserva Registrada";
        }  
		return respuesta;
	}

	@Override
	public List<Reserva> listarReservas() {
		return ReservaData.getListaReservas();
	}

	@Override
	public Double numeroCamasReservadas(String idHabitacion) {
		 Double numeroCamasOcupadas = 0D;
		 List<Reserva> listado = ReservaData.getListaReservas();
		 for(Reserva reserva : listado) {
			 if(reserva.getHabitacion().equals(idHabitacion)) {
				 numeroCamasOcupadas += reserva.getNumCamas();
			 }
		 }
		return numeroCamasOcupadas;
	}

	@Override
	public boolean habitacionConReserva(String idHabitacion) {
		List<Reserva> listado = ReservaData.getListaReservas();
		for(Reserva reserva : listado) {
			 if(reserva.getHabitacion().equals(idHabitacion)) {
				 return true;
			 }
		}		
		return false;
	}

	@Override
	public Double camasOcupadas(String idHabitacion) {
		Double camasOcupadas = 0D;
		List<Reserva> listado = ReservaData.getListaReservas();
		for(Reserva reserva : listado) {
			 if(reserva.getHabitacion().equals(idHabitacion)) {
				 camasOcupadas += reserva.getNumCamas() ;
			 }
		}	
		return camasOcupadas;
	}

}
