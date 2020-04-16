package mx.uv.Hotel;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.hotel.CancelarReservacionRequest;
import org.example.hotel.CancelarReservacionResponse;
import org.example.hotel.ConsultaRequest;
import org.example.hotel.ConsultaResponse;
import org.example.hotel.HabitacionRequest;
import org.example.hotel.HabitacionResponse;
import org.example.hotel.ModificarReservacionRequest;
import org.example.hotel.ModificarReservacionResponse;
import org.example.hotel.PagoRequest;
import org.example.hotel.PagoResponse;
import org.example.hotel.ReservacionRegistroRequest;
import org.example.hotel.ReservacionRegistroResponse;


@Endpoint
public class EndPoint {

	@PayloadRoot(localPart ="ReservacionRegistroRequest", namespace = "http://www.example.org/hotel")
	
	@ResponsePayload
	public ReservacionRegistroResponse getNombre(@RequestPayload ReservacionRegistroRequest peticion) {
		ReservacionRegistroResponse respuesta = new ReservacionRegistroResponse();
		respuesta.setRespuesta( peticion.getNombre() + " " + peticion.getApellido() + "," + " gracias por hospedarse con nosotros, su reservación y registro se realizó con éxito" );
		return respuesta;
	}
	
	@PayloadRoot(localPart ="HabitacionRequest", namespace = "http://www.example.org/hotel")
	
	@ResponsePayload
	public HabitacionResponse getTipo(@RequestPayload HabitacionRequest peticion) {
		HabitacionResponse respuesta = new HabitacionResponse();
		respuesta.setRespuesta(" Habitación disponible " + peticion.getTipo());
		return respuesta;
	}
	
	@PayloadRoot(localPart ="ConsultaRequest", namespace = "http://www.example.org/hotel")
	
	@ResponsePayload
	public ConsultaResponse getConsulta(@RequestPayload ConsultaRequest peticion) {
		ConsultaResponse respuesta = new ConsultaResponse();
		respuesta.setRespuesta( " Su reservación es " + peticion.getConsulta());
		return respuesta;
	}
	
	@PayloadRoot(localPart ="ModificarReservacionRequest", namespace = "http://www.example.org/hotel")
	
	@ResponsePayload
	public ModificarReservacionResponse getModificar(@RequestPayload ModificarReservacionRequest peticion) {
		ModificarReservacionResponse respuesta = new ModificarReservacionResponse();
		respuesta.setRespuesta( " Su reservación ha sido modificada " );
		return respuesta;
	}
	
	@PayloadRoot(localPart ="CancelarReservacionRequest", namespace = "http://www.example.org/hotel")
	
	@ResponsePayload
	public CancelarReservacionResponse getCancelar(@RequestPayload CancelarReservacionRequest peticion) {
		CancelarReservacionResponse respuesta = new CancelarReservacionResponse();
		respuesta.setRespuesta(" Su reservación ha sido cancelada ");
		return respuesta;
	}
	
	@PayloadRoot(localPart ="PagoRequest", namespace ="http://www.example.org/hotel")
	
	@ResponsePayload
	public PagoResponse getPago(@RequestPayload PagoRequest peticion) {
		PagoResponse respuesta = new PagoResponse();
		respuesta.setRespuesta(" Pago aceptado ");
		return respuesta;
	}
}