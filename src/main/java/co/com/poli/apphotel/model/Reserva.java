package co.com.poli.apphotel.model;

public class Reserva {
	
	private String habitacion;
	private Double numCamas;
	private Double precioxcama;
	
	public Reserva() {
	}

	public Reserva( String habitacion, Double numCamas, Double precioxcama) {
		super();
		this.habitacion = habitacion;
		this.numCamas = numCamas;
		this.precioxcama = precioxcama;
	}


	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public Double getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(Double numCamas) {
		this.numCamas = numCamas;
	}

	public Double getPrecioxcama() {
		return precioxcama;
	}

	public void setPrecioxcama(Double precioxcama) {
		this.precioxcama = precioxcama;
	}
	

}
