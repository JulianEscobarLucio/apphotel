package co.com.poli.apphotel.Data;

import java.util.ArrayList;
import java.util.List;
import co.com.poli.apphotel.model.Reserva;

public class ReservaData {
	
	  private static List<Reserva> listaReservas;
	    static{
	    	listaReservas = new ArrayList<Reserva>(){
	           { 	                
	            
	           }
	       };
	    }

	    public static List<Reserva> getListaReservas() {
	        return listaReservas;
	    }

	    public static void setListaReservas(List<Reserva> aListaReservas) {
	    	listaReservas = aListaReservas;
	    }

}
