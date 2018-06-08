package co.com.poli.apphotel.DaoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.poli.apphotel.Dao.HabitacionDaoInterface;
import co.com.poli.apphotel.Data.HabitacionData;
import co.com.poli.apphotel.model.Habitacion;

@Repository
public class HabitacionDaoImpl implements HabitacionDaoInterface {

	@Override
	public String insertar(Habitacion habitacion) {
        List<Habitacion> listado = HabitacionData.getListaHabitaciones();
        for(Habitacion habi :  listado){
            if(habi.getIdHabitacion().equals(habitacion.getIdHabitacion())){
            	return "Habitación ya Registrada";
            }
        }
        listado.add(habitacion);
        HabitacionData.setListaHabitaciones(listado);
		return "Habitación Registrada";
	}

	@Override
	public List<Habitacion> listarHabitaciones() {
		return HabitacionData.getListaHabitaciones();
	}

	@Override
	public Habitacion consultarHabitacion(String idHabitacion) {
		Habitacion habitacionRespuesta = new Habitacion();
		List<Habitacion> listado = HabitacionData.getListaHabitaciones();
		for(Habitacion habitacion : listado) {
			if(habitacion.getIdHabitacion().equals(idHabitacion)) {
				habitacionRespuesta=habitacion;
				continue;
			}
		}
		return habitacionRespuesta;
	}

}
