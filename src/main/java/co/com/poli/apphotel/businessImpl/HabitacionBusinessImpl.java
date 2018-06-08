package co.com.poli.apphotel.businessImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.poli.apphotel.Dao.HabitacionDaoInterface;
import co.com.poli.apphotel.DaoImpl.ReservaDaoImpl;
import co.com.poli.apphotel.business.HabitacionBusinessInterface;
import co.com.poli.apphotel.model.Habitacion;
import co.com.poli.apphotel.model.TipoHabitacion;

@Service
public class HabitacionBusinessImpl implements HabitacionBusinessInterface {
    
	@Autowired
	HabitacionDaoInterface habitacionDaoInterface;
	
	@Autowired
	ReservaDaoImpl reservaDaoImpl;
	
	@Override
	public String insertar(Habitacion habitacion) {
     	if(habitacion.getTipoHabitacion().equals(TipoHabitacion.Privada) &&
				habitacion.getNumCamas()>= 2D && habitacion.getNumCamas() <=4D ) {			
			return habitacionDaoInterface.insertar(habitacion);		   	
		}else if(habitacion.getTipoHabitacion().equals(TipoHabitacion.Privada) &&
				(habitacion.getNumCamas()< 2D || habitacion.getNumCamas() >4D) ) {
			return  "El número de camas debe estar entre 2 y 4";			
		}else if(habitacion.getTipoHabitacion().equals(TipoHabitacion.Compartida) &&
				habitacion.getNumCamas()>= 4D && habitacion.getNumCamas() <=10D ) {			
			return habitacionDaoInterface.insertar(habitacion);		   	
		}else  {
			return  "El número de camas debe estar entre 4 y 10";			
		}
	}

	@Override
	public List<Habitacion> listarHabitaciones() {
		return habitacionDaoInterface.listarHabitaciones();
	}

	@Override
	public Integer numeroHabitacionesConReserva() {
		Integer numeroHabitacionesConReserva = 0;
		List<Habitacion> listHabitaciones =	habitacionDaoInterface.listarHabitaciones();
		for(Habitacion habitacion : listHabitaciones ) {
			if(reservaDaoImpl.habitacionConReserva(habitacion.getIdHabitacion())) {
				numeroHabitacionesConReserva += 1;
			}
		}
		return numeroHabitacionesConReserva;
	}

	@Override
	public Double valorHabitacionesDisponible() {
		Double valorHabitacionesDisponible = 0D;
		List<Habitacion> listHabitaciones =	habitacionDaoInterface.listarHabitaciones();
		for(Habitacion habitacion : listHabitaciones ) {
			Double camasOcupadas = reservaDaoImpl.camasOcupadas(habitacion.getIdHabitacion());
			if(habitacion.getTipoHabitacion().equals(TipoHabitacion.Privada)) {
				valorHabitacionesDisponible += (habitacion.getNumCamas() - camasOcupadas ) * 50000D;
			}else {
				valorHabitacionesDisponible += (habitacion.getNumCamas() - camasOcupadas ) * 30000D;
			}
		}
		return valorHabitacionesDisponible;
	}

}
