package co.com.poli.apphotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.poli.apphotel.business.HabitacionBusinessInterface;
import co.com.poli.apphotel.model.Habitacion;

@CrossOrigin(origins = "*",maxAge = 4600)
@RestController
@RequestMapping(value = "/")
public class HabitacionController {
	
	@Autowired
	HabitacionBusinessInterface habitacionBusinessInterface;
	
	@GetMapping("/saludo")
	public String saludo() {
		return  "hola";
	}
	
	@PostMapping("/habitaciones")
	public String igresarHabitacion(@RequestBody Habitacion habitacion) {
		return habitacionBusinessInterface.insertar(habitacion);		
	}
	
	@GetMapping("/habitaciones")
	public List<Habitacion> listarHabitaciones(){
		return habitacionBusinessInterface.listarHabitaciones();
	}
	
	@GetMapping("/habitacionesconreserva")
	public Integer numeroHabitacionesConReserva(){
		return habitacionBusinessInterface.numeroHabitacionesConReserva();
	}
	
	@GetMapping("/valorhabitacionesdisponibles")
	public Double valorHabitacionesDisponible() {
		return habitacionBusinessInterface.valorHabitacionesDisponible();
	}

}
