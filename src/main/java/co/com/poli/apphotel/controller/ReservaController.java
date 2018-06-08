package co.com.poli.apphotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.poli.apphotel.business.ReservaBusinessInterface;
import co.com.poli.apphotel.model.Reserva;

@CrossOrigin(origins = "*",maxAge = 4600)
@RestController
@RequestMapping(value = "/")
public class ReservaController {
	
	@Autowired
	ReservaBusinessInterface reservaBusinessInterface;
	
	@PostMapping("/reservas")
	public String IngresarReserva(@RequestBody Reserva reserva) {
		return reservaBusinessInterface.insertar(reserva);
	}
	
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return reservaBusinessInterface.listarReservas();
	}
}

