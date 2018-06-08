package co.com.poli.apphotel.model;

public class Habitacion {
	
	private String idHabitacion;
	private TipoHabitacion tipoHabitacion;
	private Double numCamas;
	
	
	
	public Habitacion() {
	}


	public Habitacion(String idHabitacion, TipoHabitacion tipoHabitacion, Double numCamas) {
		this.idHabitacion = idHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.numCamas = numCamas;
	}


	public String getIdHabitacion() {
		return idHabitacion;
	}


	public void setIdHabitacion(String idHabitacion) {
		this.idHabitacion = idHabitacion;
	}


	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}


	public Double getNumCamas() {
		return numCamas;
	}


	public void setNumCamas(Double numCamas) {
		this.numCamas = numCamas;
	}
	
	

}
