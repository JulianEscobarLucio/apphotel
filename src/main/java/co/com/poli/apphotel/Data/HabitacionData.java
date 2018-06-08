package co.com.poli.apphotel.Data;

import java.util.ArrayList;
import java.util.List;

import co.com.poli.apphotel.model.Habitacion;
import co.com.poli.apphotel.model.TipoHabitacion;


public class HabitacionData {
	
	  private static List<Habitacion> listaHabitaciones;
	    static{
	    	listaHabitaciones = new ArrayList<Habitacion>(){
	           { 	                
	            add(new Habitacion("101", TipoHabitacion.Privada, 4D));
	            add(new Habitacion("102", TipoHabitacion.Compartida, 10D));
	            add(new Habitacion("103", TipoHabitacion.Privada, 3D));	    
	           }
	       };
	    }

	    public static List<Habitacion> getListaHabitaciones() {
	        return listaHabitaciones;
	    }

	    public static void setListaHabitaciones(List<Habitacion> aListaHabitaciones) {
	    	listaHabitaciones = aListaHabitaciones;
	    }
	
}
